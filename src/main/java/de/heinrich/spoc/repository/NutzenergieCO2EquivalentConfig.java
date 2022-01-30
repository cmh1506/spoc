package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.NutzenergieCO2Equivalent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NutzenergieCO2EquivalentConfig {
    @Bean
    CommandLineRunner initNutzenergieCO2Equivalent(NutzenergieCO2EquivalentRepository nutzenergieCO2EquivalentRepository){
        return args -> {
            nutzenergieCO2EquivalentRepository.save(new NutzenergieCO2Equivalent("CO2 Stromnetz", 413, 0.114722222222222));
            nutzenergieCO2EquivalentRepository.save(new NutzenergieCO2Equivalent("CO2 Gaswärme", 200, 0.0555555555555556));

        };
    }
}
