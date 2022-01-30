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
            verarbeitungRepository.save(new Verarbeitung("Blasfolienanlage", 1.134, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Flachfolienanlage", 1.26, 0.0));
            verarbeitungRepository.save(new Verarbeitung("FlachfolienundReckanlage", 2.8, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Spritzgussanlage", 2.16, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Extrusionsblasformen", 2.63, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Streckblasformen", 0.9, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Spritzguss-undStreckblasformanlage", 3.06, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Tiefziehen", 1.2, 0.0));
            verarbeitungRepository.save(new Verarbeitung("FolienherstellungundTiefziehen", 2.3, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Schrumpfofen", 0.6, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Wellpappenherstellung", 1.3, 0.0));
            verarbeitungRepository.save(new Verarbeitung("Weißblechwalzen", 0.0, 4.3));
            verarbeitungRepository.save(new Verarbeitung("Aluminium walzen", 11, 0.0));

        };
    }
}
