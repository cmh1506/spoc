package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Energierueckgewinnung;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnergierueckgewinnungConfig {
    @Bean
    CommandLineRunner initEnergierueckgewinnung(EnergierueckgewinnungRepository energierueckgewinnungRepository){
        return args -> {
           //energierueckgewinnungRepository.save(new Energierueckgewinnung())
        };
    }

}
