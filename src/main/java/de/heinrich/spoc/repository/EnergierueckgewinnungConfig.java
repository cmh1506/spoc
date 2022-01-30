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
            energierueckgewinnungRepository.save(new Energierueckgewinnung("MVA", 44.6, 0.271706381813202, 0.72856751574911));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("EBS", 60.1, 0.279918864097363, 0.721208023439261));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("SMVA", 56.6, 0.0302603800140746, 0.985221674876847));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("IKW", 75.0, 0.333386915286931, 0.667095322295451));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("ZW", 70.0, 0.0, 0.998075998075998));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("ZW EBS IKW", 68.69, 0.223812095032397, 0.776187904967603));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("No Energy Recovery", 0.0, 0.0, 0.0));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Deponierung", 0.0, 0.0, 0.0));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Ländereingabe", 33.21, 0.252382767823103, 0.747780621970481));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("eigene Eingabe", 0.0, 0.0, 1.0));
            energierueckgewinnungRepository.save(new Energierueckgewinnung("Verlust Brennwert", 0.0, 0.0, 0.0));

        };
    }

}
