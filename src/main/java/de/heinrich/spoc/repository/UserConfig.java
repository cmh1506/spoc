package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.security.ApplicationUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfig {
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            User user = new User("Burth", passwordEncoder.encode("123"), ApplicationUserRole.ADMIN, "dirk.burth@hm.edu",true, true, true, true);
            userRepository.save(user);
            userRepository.findAll().forEach(System.out::println);
        };
    }
}