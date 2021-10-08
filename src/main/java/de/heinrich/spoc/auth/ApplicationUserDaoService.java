package de.heinrich.spoc.auth;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository("real")
public class ApplicationUserDaoService implements ApplicationUserDao {
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;
    @Autowired
    public ApplicationUserDaoService(PasswordEncoder passwordEncoder, UserService userService) {
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    @Override
    public Optional<ApplicationUser> selectAppliationUserByUsername(String username) {
        User user = userService.findUserByName(username).orElseThrow();
        ApplicationUser applicationUser = new ApplicationUser(user.getUsername(),
                user.getPassword(),
                user.getRole().getGrantedAuthorities(),
                user.isAccountNonExpired(),
                user.isAccountNonLocked(),
                user.isCredentialsNonExpired(),
                user.isEnabled());
        Optional<ApplicationUser> toReturn = Optional.of(applicationUser);
        return toReturn;
    }

}
