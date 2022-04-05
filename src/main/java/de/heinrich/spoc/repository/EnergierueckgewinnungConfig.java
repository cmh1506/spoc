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
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Standard", 52.8, 0.252382767823103, 0.747780621970481));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Müllverbrennungsanlage", 44.6, 0.271706381813202, 0.72856751574911));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Sondermüllverbrennung", 56.6, 0.0302603800140746, 0.985221674876847));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Industriekraftwerk", 75.0, 0.333386915286931, 0.667095322295451));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Zementwerk", 70.0, 0.0, 0.998075998075998));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("No Energy Recovery", 0.0, 0.0, 0.0));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Deponierung", 0.0, 0.0, 0.0));

        };
    }

}
