package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaterialConfig {
    @Bean
    CommandLineRunner initMaterials(MaterialRepository materialRepository) {
        return args -> {
            materialRepository.save(new Material("LDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7));
            materialRepository.save(new Material("HDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.955, 1.6, 1.8, 46, 1.8, 34.0));
            materialRepository.save(new Material("LLDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.7, 46, 1.79, 33.0));
            materialRepository.save(new Material("PET", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24, 2.19, 47.2));
            materialRepository.save(new Material("PP", 0.0, 0.0, 0.0, 0.41, 3.14, 0.91, 1.6, 1.7, 46.4, 1.63, 31.5));
            materialRepository.save(new Material("GPPS", 0.0, 0.0, 0.0, 0.316, 3.38, 1.05, 1.6, 1.7, 42, 2.25, 40.3));
            materialRepository.save(new Material("HIPS", 0.0, 0.0, 0.0, 0.316, 3.38, 1.05, 1.6, 1.7, 42, 2.43, 44.59));
            materialRepository.save(new Material("PVC", 0.0, 0.0, 0.0, 0.41, 1.4, 1.38, 1.6, 1.4, 20.0, 1.99, 40.0));
            materialRepository.save(new Material("PA", 0.0, 0.0, 0.0, 0.41, 2.34, 1.15, 1.6, 2.5, 38.5, 6.7, 91.0));
            materialRepository.save(new Material("EVOH generic", 0.0, 0.0, 0.0, 0.41, 2.2, 1.2, 1.8, 1.59, 30.0, 4.6, 40.0));
            materialRepository.save(new Material("PVDC", 0.0, 0.0, 0.0, 0.41, 0.91, 1.63, 1.6, 1.6, 21.5, 4.4, 40.0));
            materialRepository.save(new Material("R-LLDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.7, 46, 1.79, 33));
            materialRepository.save(new Material("R-LDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.8, 46, 1.87, 36.7));
            materialRepository.save(new Material("R-HDPE (Kisten))", 0.0, 0.0, 0.0, 0.368, 3.14, 0.955, 1.6, 1.8, 46, 1.8, 34));
            materialRepository.save(new Material("R-HDPE (bottle, cup))", 0.0, 0.0, 0.0, 0.368, 3.14, 0.955, 1.6, 1.8, 46, 1.8, 34));
            materialRepository.save(new Material("R-PET (Schale))", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24, 2.19, 47.2));
            materialRepository.save(new Material("R-PET (bottle))", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24, 2.19, 47.2));
            materialRepository.save(new Material("R-Folien", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46, 1.87, 36.7));
            materialRepository.save(new Material("R-Misch-PET-90/10", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24, 2.19, 47.2));
            materialRepository.save(new Material("R-MPO Flex", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46, 1.87, 36.7));
            materialRepository.save(new Material("R-Mischku", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46, 1.87, 36.7));
            materialRepository.save(new Material("R-PP", 0.0, 0.0, 0.0, 0.368, 3.14, 0.91, 1.6, 1.7, 46.4, 1.63, 31.5));
            materialRepository.save(new Material("bio PE iluc", 2.77, 0.0, 3.14, 0.368, 0.0, 0.925, 1.6, 0.4, 46.0, 2.33, 70.0));
            materialRepository.save(new Material("PLA", 0.0, 0.0, 0.0, 0.41, 0.0, 1.3, 1.6, 1.19555555555556, 18, 1, 53.8));
            materialRepository.save(new Material("ABS", 0.0, 0.0, 0.0, 0.36, 3.3, 1.05, 1.6, 1.95, 44, 3.1, 52.18));
            materialRepository.save(new Material("SAN", 0.0, 0.0, 0.0, 0.36, 3.31, 1.09, 1.6, 2, 44, 2.96, 52.88));
            materialRepository.save(new Material("PUR", 0.0, 0.0, 0.0, 0.41, 2, 1, 1.6, 1.8, 33, 3, 56));
            materialRepository.save(new Material("PU Foam 18", 0.0, 0.0, 0.0, 0.41, 2, 0.018, 1.6, 1.85, 33, 3.18, 55));
            materialRepository.save(new Material("Pu foam 35", 0.0, 0.0, 0.0, 0.41, 2, 0.035, 1.6, 1.91, 33, 3.22, 59));
            materialRepository.save(new Material("Pu foam 40", 0.0, 0.0, 0.0, 0.41, 2, 0.04, 1.6, 2.03, 33, 3.56, 64));
            materialRepository.save(new Material("Pu foam 45", 0.0, 0.0, 0.0, 0.41, 2, 0.045, 1.6, 1.85, 33, 2.95, 55));
            materialRepository.save(new Material("rigid PU foam", 0.0, 0.0, 0.0, 0.41, 2, 0.05, 1.6, 2.1, 37, 4.2, 64));
            materialRepository.save(new Material("PSA-Acrylat generic", 0.0, 0.0, 0.0, 0.41, 0.0, 1.38, 1.6, 1.8, 0.0, 0.0, 50));
            materialRepository.save(new Material("HMPSA (C5 Resin)) generic", 0.0, 0.0, 0.0, 0.41, 3.1, 1, 1.6, 1.7, 41, 3.5, 62));
            materialRepository.save(new Material("2k lh Klebstoff M", 0.0, 0.0, 0.0, 0.41, 2, 1, 1.6, 1.8, 30.0, 4.3, 56));
            materialRepository.save(new Material("2k lf Klebstoff M", 0.0, 0.0, 0.0, 0.41, 2, 1, 1.6, 1.8, 33, 3.5, 56));
            materialRepository.save(new Material("HMA C5-Rosin generic", 0.0, 0.0, 0.0, 0.41, 2.4, 1, 1.6, 1.7, 41, 2.5, 61));
            materialRepository.save(new Material("Tiefdruckfarbe M", 0.0, 0.0, 0.0, 0.41, 2.5, 1, 1.6, 0.0, 30.0, 3.293, 0));
            materialRepository.save(new Material("Flexofarbe wässrig M", 0.0, 0.0, 0.0, 0.41, 2.5, 1, 1.6, 0.0, 30.0, 3.293, 0));
            materialRepository.save(new Material("Flexofarbe wässrig M", 0.0, 0.0, 0.0, 0.41, 2.5, 1, 1.6, 0.0, 30.0, 3.293, 0));
            materialRepository.save(new Material("Flexofarbe M", 0.0, 0.0, 0.0, 0.41, 2.5, 1, 1.6, 0.7, 30.0, 3.293, 40));
            materialRepository.save(new Material("aliph PU", 0.0, 0.0, 0.0, 0.41, 0.0, 0.05, 1.6, 3.3, 31, 6.5, 113));
            materialRepository.save(new Material("EVA 30% generic", 0.0, 0.0, 0.0, 0.41, 2.5, 0.945, 1.6, 1.59, 35, 2.07, 39.8));
            materialRepository.save(new Material("long polyol", 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 1.6, 0.0, 37, 2.93, 52));
            materialRepository.save(new Material("short Polyol", 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 1.6, 0.0, 42, 2.83, 52));
            materialRepository.save(new Material("arom Polyol", 0.0, 0.0, 0.0, 0.41, 0.0, 0.0, 1.6, 0.0, 38, 1.63, 34));
            materialRepository.save(new Material("GAA", 0.0, 0.0, 0.0, 0.41, 0.0, 0.95, 1.6, 0.97, 19, 1.2, 26));
            materialRepository.save(new Material("MA", 0.0, 0.0, 0.0, 0.41, 2.04, 0.95, 1.6, 1.2, 22, 1.7, 34));
            materialRepository.save(new Material("EA", 0.0, 0.0, 0.0, 0.41, 2.2, 0.95, 1.6, 1.2, 25, 1.6, 59));
            materialRepository.save(new Material("BA", 0.0, 0.0, 0.0, 0.41, 2.4, 0.95, 1.6, 1.68, 29, 2.2, 46));
            materialRepository.save(new Material("EHA", 0.0, 0.0, 0.0, 0.41, 2.44, 0.95, 1.6, 2.26, 33, 3.3, 70));
            materialRepository.save(new Material("EVA 30%", 0.0, 0.0, 0.0, 0.41, 2.5, 0.945, 1.6, 1.59, 35, 2.07, 39.8));
            materialRepository.save(new Material("Papier M", 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 2, 0.12, 18, 0.0, 0));
            materialRepository.save(new Material("Papier hf generic", 0.0, 0.0, 0.0, 0.1, 0.0, 0.9, 2, 0.12, 18, 0.0, 0));
            materialRepository.save(new Material("N2 gas", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.048, 0.44));
            materialRepository.save(new Material("N2 flüssig", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.164, 1.8));
            materialRepository.save(new Material("O2 flüssig", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 1.5));
            materialRepository.save(new Material("Neuglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.2, 0.244, 0.0, 1.03, 11));
            materialRepository.save(new Material("R-Behälterglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.2, 0.16, 0.0, 0.36, 7.2));
            materialRepository.save(new Material("R-Weißglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.2, 0.158, 0.0, 0.382, 7.6));
            materialRepository.save(new Material("R-Buntglas", 0.0, 0.0, 0.0, 0.306, 0.0, 2.5, 7.2, 0.129, 0.0, 0.306, 6.2));
            materialRepository.save(new Material("Weißglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.2, 0.176, 0.0, 0.449, 8.47));
            materialRepository.save(new Material("Buntglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.2, 0.176, 0.0, 0.437, 8.47));
            materialRepository.save(new Material("Flaconglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.2, 0.32, 0.0, 0.76, 14));
            materialRepository.save(new Material("Alu prod EU", 0.0, 0.0, 0.0, 0.5, 0.0, 2.71, 8, 0.53, 10.0, 6.7, 140));
            materialRepository.save(new Material("Alu used EU", 0.0, 0.0, 0.0, 0.5, 0.0, 2.71, 8, 0.53, 10.0, 8.6, 160));
            materialRepository.save(new Material("Elektrostahl", 0.0, 0.0, 0.0, 0.61, 0.0, 7.8, 5.5, 0.0, 8, 0.71, 5.5));
            materialRepository.save(new Material("Hochofenstahl", 0.0, 0.0, 0.0, 0.61, 0.0, 7.8, 5.5, 0.0, 8, 1.6, 14));
            materialRepository.save(new Material("R-Weißblech", 0.0, 0.0, 0.0, 0.61, 0.0, 7.8, 5.5, 0.311, 0.0, 1.03, 14));
            materialRepository.save(new Material("Füllstoff-CaCO3", 0.0, 0.0, 0.0, 0.1, 0.0, 1.944, 2, 0.0, 0.0, 0.25, 0));
            materialRepository.save(new Material("Streich-CaCO3", 0.0, 0.0, 0.0, 0.1, 0.0, 1.944, 2, 0.0, 0.0, 0.115, 0));
            materialRepository.save(new Material("Kaolin", 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 2, 0.0, 0.0, 0.21, 0));
            materialRepository.save(new Material("SB-Binder (40/60; Tg 21°C))))", 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 2, 0.0, 0.0, 3.3, 50));
            materialRepository.save(new Material("Papiermaschine", 0.12, 0.0, 0.0, 0.0, 0.0, 0.0, 2, 0.0, 0.0, 0.4, 6.1));
            materialRepository.save(new Material("StreichmaschineKalander", 0.0133, 0.0, 0.0, 0.0, 0.0, 0.0, 2, 0.0, 0.0, 0.037, 0.677));

        };
    }
}
