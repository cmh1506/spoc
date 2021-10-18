package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.domain.RecyclingVerfahren;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecyclingVerfahrenConfig {
    @Bean
    CommandLineRunner initRecyclingVerfahren(RecyclingVerfahrenRepository repository){
        return args -> {
            RecyclingVerfahren recyclingVerfahren = new RecyclingVerfahren("Einschmelzen");
            repository.save(recyclingVerfahren);
        };
    }
}
