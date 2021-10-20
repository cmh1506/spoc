package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Recyclingverfahren;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecyclingVerfahrenConfig {
    @Bean
    CommandLineRunner initRecyclingVerfahren(RecyclingVerfahrenRepository repository){
        return args -> {
            Recyclingverfahren recyclingVerfahren = new Recyclingverfahren("Einschmelzen");
            repository.save(recyclingVerfahren);
        };
    }
}
