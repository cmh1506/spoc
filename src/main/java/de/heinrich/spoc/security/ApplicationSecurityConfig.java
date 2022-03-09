package de.heinrich.spoc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import de.heinrich.spoc.auth.ApplicationUserService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;
    private final ApplicationUserService applicationUserService;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder, ApplicationUserService applicationUserService) {
        this.passwordEncoder = passwordEncoder;
        this.applicationUserService = applicationUserService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf()
            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and()
            .cors()
            .and()
            .authorizeRequests()
            .antMatchers("/", "/static/**", "/*.js", "/*.json", "/*.ico", "/*.sccs","/*.woff2", "/*.css", "/index*", "/login"/*, "/spoclogin", "/materialverwendung/allMaterialverwendungs", "/material/allMaterials", "/verarbeitung/allVerarbeitungs", "/recyclingverfahren/allRecyclingverfahrens", "/energierueckgewinnung/allEnergierueckgewinnungs", "/transportmittel/allTransportmittels", "/user/users", "/material/delete"*/).permitAll()
            .antMatchers(HttpMethod.GET, "/verpackung/**", "/materialverwendung/**", "/spoclogin").hasAuthority(ApplicationUserPermission.STAMMDATEN.getPermission())
            .antMatchers(HttpMethod.POST, "/verpackung/**", "/materialverwendung/**").hasAuthority(ApplicationUserPermission.STAMMDATEN.getPermission())
            .antMatchers(HttpMethod.DELETE, "/verpackung/**", "/materialverwendung/**", "/material/**").hasAuthority(ApplicationUserPermission.STAMMDATEN.getPermission())
            .anyRequest()
            .authenticated().and()
            /*.formLogin().loginPage("/login").permitAll()
            .passwordParameter("password")
            .usernameParameter("username")
            .and()
            .logout().permitAll();*/
            .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider());
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder);
        provider.setUserDetailsService(applicationUserService);
        return provider;
    }

}
