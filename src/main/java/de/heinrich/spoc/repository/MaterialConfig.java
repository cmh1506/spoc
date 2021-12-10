package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaterialConfig {
    /*@Bean
    CommandLineRunner initMaterials(MaterialRepository materialRepository) {
        return args -> {
            Material material = new Material("PVC");
            materialRepository.save(new Material("Aluminium"));
            materialRepository.save(new Material("Plastik"));
            materialRepository.save(new Material("Pappe"));
        };
    }*/
}
