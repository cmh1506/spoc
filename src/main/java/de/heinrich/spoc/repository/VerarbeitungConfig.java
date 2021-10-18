package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Verarbeitung;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VerarbeitungConfig {
    @Bean
    CommandLineRunner initVerarbeitungs(VerarbeitungRepository verarbeitungRepository) {
        return args -> {
            Verarbeitung verarbeitung = new Verarbeitung("Walzen");
            verarbeitungRepository.save(verarbeitung);
        };
    }
}
