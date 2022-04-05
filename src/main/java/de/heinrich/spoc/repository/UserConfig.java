package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.security.ApplicationUserRole;

import java.util.stream.IntStream;

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
    CommandLineRunner initUsers(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("Burth", passwordEncoder.encode("12345"), ApplicationUserRole.ADMIN, "dirk.burth@hm.edu",true, true, true, true));
            userRepository.save(new User("Claus", passwordEncoder.encode("12345"), ApplicationUserRole.KUNDE, "claus-heinrich@gmx.net",true, true, true, true));
            //userRepository.save(new User("benutzer", passwordEncoder.encode("passwort"), ApplicationUserRole.ADMIN, "dirk.burth@hm.edu",true, true, true, true));
            //IntStream.range(1, 100).forEach(n -> { userRepository.save(new User("benutzer" + n, passwordEncoder.encode("passwort" + n), ApplicationUserRole.ADMIN, "user@user.com",true, true, true, true)); });
        };
    }
}