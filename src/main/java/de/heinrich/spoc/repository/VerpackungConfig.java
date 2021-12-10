package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Verpackung;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VerpackungConfig {
    /*@Bean
    CommandLineRunner initVerpackungs(VerpackungRepository verpackungRepository, UserRepository userRepository) {
        return args -> {
            Verpackung verpackung = new Verpackung();
            verpackung.setName("Yoghurt");
            verpackungRepository.save(verpackung);
        };
    }*/
}
