package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.domain.Recyclingverfahren;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaterialConfig {
    @Bean
    CommandLineRunner initMaterials(MaterialRepository materialRepository) {
        return args -> {
            materialRepository.save(new Material("LDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 25.0025, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("HDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.955, 1.6, 1.8, 46.046, 1.8, 34.034, 35.0035, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("LLDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.7, 46.046, 1.79, 33.033, 25.0025, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("PP", 0.0, 0.0, 0.0, 0.41, 3.14, 0.91, 1.6, 1.7, 46.4, 1.63, 31.5, 30.003, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("PET", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24.024, 2.19, 47.2, 31.0031, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("GPPS", 0.0, 0.0, 0.0, 0.316, 3.38, 1.05, 1.6, 1.7, 42.042, 2.25, 40.3, 30.003, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("HIPS", 0.0, 0.0, 0.0, 0.316, 3.38, 1.05, 1.6, 1.7, 42.042, 2.43, 44.59, 30.003, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("EPS", 0.0, 0.0, 0.0, 0.41, 3.38, 0.015, 1.6, 1.85, 40.04, 3.17, 54.9, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("PA", 0.0, 0.0, 0.0, 0.41, 2.34, 1.15, 1.6, 2.5, 38.5, 6.7, 91.091, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("EVOH", 0.0, 0.0, 0.0, 0.41, 2.2, 1.2, 1.8, 1.59, 30.03, 4.6, 40.04, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("EVA 30%", 0.0, 0.0, 0.0, 0.41, 2.5, 0.945, 1.6, 1.59, 35.035, 2.07, 39.8, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("PVC", 0.0, 0.0, 0.0, 0.41, 1.4, 1.38, 1.6, 1.4, 20.02, 1.99, 40.04, 10.001, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("PVDC", 0.0, 0.0, 0.0, 0.41, 0.91, 1.63, 1.6, 1.6, 21.5, 4.4, 40.04, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("ABS", 0.0, 0.0, 0.0, 0.36, 3.3, 1.05, 1.6, 1.95, 44.044, 3.1, 52.18, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("PC", 0.0, 0.0, 0.0, 0.41, 2.89, 1.2, 1.6, 2.0, 33.033, 3.4, 71.28, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("PUR", 0.0, 0.0, 0.0, 0.41, 2.0, 1.0, 1.6, 1.8, 33.033, 3.0, 56.056, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("aliph PU", 0.0, 0.0, 0.0, 0.41, 2.0, 0.05, 1.6, 3.3, 31.031, 6.5, 113.113, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("SAN", 0.0, 0.0, 0.0, 0.36, 3.31, 1.09, 1.6, 2.0, 44.044, 2.96, 52.88, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-LDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 25.0025, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-HDPE (Kisten)", 0.0, 0.0, 0.0, 0.368, 3.14, 0.955, 1.6, 1.8, 46.0, 1.8, 34.034, 80.008, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-HDPE (bottle cup)", 0.0, 0.0, 0.0, 0.368, 3.14, 0.955, 1.6, 1.8, 46.0, 1.8, 34.034, 35.0035, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-LLDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.7, 46.0, 1.79, 33.033, 25.0025, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-PP", 0.0, 0.0, 0.0, 0.368, 3.14, 0.91, 1.6, 1.7, 46.4, 1.63, 31.5, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-PET (bottle)", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 46.0, 2.19, 47.2, 94.0094, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-PET (Schale)", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 46.0, 2.19, 47.2, 31.0031, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-Misch-PET-90/10", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24.0, 2.19, 47.2, 31.0031, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-Folien", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-MPO Flex", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("R-Mischku", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("bio PE", 3.14, 2.77, 0.0, 0.368, 0.0, 0.925, 1.6, 0.4, 46.0, 1.0, 70.07, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 3.14));
            materialRepository.save(new Material("bio PE iluc", 3.14, 2.77, 0.0, 0.368, 0.0, 0.925, 1.6, 0.4, 46.0, 2.33, 70.07, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 3.14));
            materialRepository.save(new Material("R-BioPE", 3.14, 2.77, 0.0, 0.368, 0.0, 0.925, 1.8, 0.4, 46.0, 1.0, 70.07, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 3.14));
            materialRepository.save(new Material("bio-PET", 0.46, 0.0, 0.0, 0.48, 1834, 1.38, 1.6, 1.13, 24.024, 1.8, 51.051, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.46));
            materialRepository.save(new Material("PLA", 0.0, 0.0, 0.0, 0.41, 0.0, 1.3, 1.6, 1195, 18.018, 1.0, 53.8, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("bio-PA", 2.34, 0.0, 0.0, 0.41, 0.0, 1.15, 1.6, 1.44, 20.02, 3.38, 64.8, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 2.34));
            materialRepository.save(new Material("Papier M", 1.595, 0.69, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 11.0, 0.53, 17.0, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Papier hf ", 1.595, 1.02, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 16.0, 0.54, 24.13, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Papier hf coated ", 1129, 0.71, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 11.0, 0.54, 17.51, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Papier holzhaltig", 1.595, 0.39, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 15.0, 0.72, 11.7, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("holzhaltig coated ", 1129, 0.27, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 11.0, 0.66, 10.1, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Altpapier ", 0.8, 0.15, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 5.5, 0.55, 5.99, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Altpapier coated ", 0.7, 0.11, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 3.7, 0.54, 6.1, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Kraftliner ", 1629, 0.54, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 15.6, 0.54, 24.1, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Testliner ", 0.8, 0.14, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 4.9, 0.54, 5.9, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Schrenz ", 0.8, 0.14, 0.0, 0.2, 0.0, 0.9, 2.0, 0.12, 4.9, 0.54, 5.99, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("GZ Karton", 1129, 0.95, 0.0, 0.2, 0.0, 0.7, 2.0, 0.12, 15.3, 0.56, 21.4, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("GC Karton ", 0.8, 0.42, 0.0, 0.2, 0.0, 0.7, 2.0, 0.12, 16.2, 0.81, 12.9, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("GD Karton ", 0.5, 0.14, 0.0, 0.2, 0.0, 0.7, 2.0, 0.12, 4.8, 0.58, 6.48, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Zellstoff", 1629, 1.09, 1.37, 0.2, 0.0, 0.9, 2.0, 0.0, 18.0, 0.25, 21.0, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Holzstoff", 1.595, 0.28, 0.9, 0.2, 0.0, 0.8, 2.0, 0.0, 18.0, 0.6, 5.4, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Altpapier", 0.8, 0.12, 0.3, 0.15, 0.0, 0.9, 0.0, 0.0, 5.4, 0.15, 1.44, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("DIPP", 0.8, 0.2, 0.5, 0.24, 0.0, 0.9, 0.0, 0.0, 5.4, 0.24, 2.16, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Füllstoff-CaCO3", 0.0, 0.0, 0.0, 0.2, 0.0, 1.944, 2.0, 0.0, 0.0, 0.075, 0.08, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Streich-CaCO3", 0.0, 0.0, 0.0, 0.2, 0.0, 1.944, 2.0, 0.0, 0.0, 0.115, 0.13, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Kaolin", 0.0, 0.0, 0.0, 0.2, 0.0, 2.58, 2.0, 0.0, 0.0, 0.21, 0.2, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("SB-Binder (40/60; Tg 21°C))", 0.0, 0.0, 0.0, 0.2, 0.0, 1.0, 2.0, 0.0, 30, 3.3, 50.05, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Papiermaschine", 0.0, 0.025, 0.0, 0.313, 0.0, 0.0, 2.0, 0.0, 0.0, 0.313, 8.3, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("StreichmaschineKalander", 0.0, 0.00233, 0.0, 0.034, 0.0, 0.0, 2.0, 0.0, 0.0, 0.034, 0.677, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Alu prod EU", 0.0, 0.0, 0.0, 0.5, 0.0, 2.71, 8.0, 0.53, 10.0, 6.7, 140, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Alu used EU", 0.0, 0.0, 0.0, 0.5, 0.0, 2.71, 8.0, 0.53, 10.0, 8.6, 160.0, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Elektrostahl", 0.0, 0.0, 0.0, 0.71, 0.0, 7.8, 5.5, 0.0, 8.0, 0.71, 5.5, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Hochofenstahl", 0.0, 0.0, 0.0, 0.71, 0.0, 7.8, 5.5, 0.0, 8.0, 1.6, 14.0, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("R-Weißblech", 0.0, 0.0, 0.0, 0.71, 0.0, 7.8, 5.5, 0.311, 0.0, 1.03, 8.6, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Neuglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.2, 0.244, 0.0, 1.03, 11.0, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("R-Behälterglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 6.2, 0.16, 0.0, 0.36, 7.2, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("R-Weißglas", 0.0, 0.0, 0.0, 0.382, 0.0, 2.5, 7.6, 0.158, 0.0, 0.382, 7.6, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("R-Buntglas", 0.0, 0.0, 0.0, 0.306, 0.0, 2.5, 6.2, 0.129, 0.0, 0.306, 6.2, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Weißglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.6, 0.176, 0.0, 0.449, 8.47, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Buntglas", 0.0, 0.0, 0.0, 0.306, 0.0, 2.5, 6.2, 0.176, 0.0, 0.437, 8.47, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("Flaconglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 6.2, 0.32, 0.0, 0.76, 14.0, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("PU Foam 18", 0.0, 0.0, 0.0, 0.41, 2.0, 0.018, 1.6, 1.85, 33.0, 3.18, 55.055, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Pu foam 35", 0.0, 0.0, 0.0, 0.41, 2.0, 0.035, 1.6, 1.91, 33.0, 3.22, 59.059, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Pu foam 40", 0.0, 0.0, 0.0, 0.41, 2.0, 0.04, 1.6, 2.03, 33.0, 3.56, 64.064, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Pu foam 45", 0.0, 0.0, 0.0, 0.41, 2.0, 0.045, 1.6, 1.85, 33.0, 2.95, 55.055, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("rigid PU foam", 0.0, 0.0, 0.0, 0.41, 2.0, 0.05, 1.6, 2.1, 37.037, 4.2, 64.064, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("PSA-Acrylat generic", 0.0, 0.0, 0.0, 0.41, 0.0, 1.38, 1.6, 1.8, 22.0, 2.5, 50.05, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("HMPSA (Rosin) ", 1.59, 0.0, 0.0, 0.41, 1.36, 1.0, 1.6, 0.78, 42.0, 1.7, 31.0, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("HMPSA (C5 Resin)", 0.0, 0.0, 0.0, 0.41, 3.15, 1.0, 1.6, 1.7, 41.0, 2.5, 50.0, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("2k lh Klebstoff M", 0.0, 0.0, 0.0, 0.41, 2.0, 1.0, 1.6, 1.8, 30.03, 4.3, 56.056, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("2k lf Klebstoff M", 0.0, 0.0, 0.0, 0.41, 2.0, 1.0, 1.6, 1.8, 33.0, 3.5, 56.056, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("HMA EVA Rosin", 1.1, 0.0, 0.0, 0.41, 1.6, 1.0, 1.6, 1.1, 42.3, 1.6, 21.5, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("HMA C5-Harz ", 0.0, 0.0, 0.0, 0.41, 2.8, 1.0, 1.6, 1.7, 43.5, 2.1, 34.5, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Offsetfarbe M", 1.6, 0.0, 0.0, 0.41, 0.8, 1.0, 1.6, 0.7, 30.03, 2, 30.03, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 1.6));
            materialRepository.save(new Material("Tiefdruckfarbe M", 0.0, 0.0, 0.0, 0.41, 2.5, 1.0, 1.6, 0.0, 30.03, 3.293, 30.03, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Flexofarbe wässrig M", 0.0, 0.0, 0.0, 0.41, 2.5, 1.0, 1.6, 0.0, 30.03, 3.293, 30.03, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Flexofarbe wässrig M", 0.0, 0.0, 0.0, 0.41, 2.5, 1.0, 1.6, 0.0, 30.03, 3.293, 30.03, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Flexofarbe M", 0.0, 0.0, 0.0, 0.41, 2.5, 1.0, 1.6, 0.7, 30.03, 3.293, 40.04, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Brettschichtholz", 1.595, 0.64, 0.0, 0.1, 0.0, 0.507, 0.2, 0.0, 18.0, 0.19, 2.61, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Dreischichtholz", 1.595, 0.36, 0.0, 0.1, 0.0, 0.51, 0.2, 0.0, 18.0, 0.23, 2.89, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Laubschnittholz", 1.595, 0.94, 0.0, 0.1, 0.0, 0.761, 0.2, 0.0, 18.0, 0.13, 1.85, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Nadelschnittholz trocken", 1.595, 0.46, 0.0, 0.1, 0.0, 0.484, 0.2, 0.0, 18.0, 0.08, 0.78, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Nadelschnittholz frisch ", 1.595, 0.01, 0.0, 0.1, 0.0, 0.674, 0.2, 0.0, 18.0, 0.023, 0.49, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Furniersperrholz", 1.595, 1.72, 0.0, 0.1, 0.0, 0.824, 0.2, 0.0, 18.0, 0.31, 5.4, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Spanplatte", 1.595, 0.13, 0.0, 0.1, 0.0, 0.633, 0.2, 0.0, 18.0, 0.13, 1.81, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("Spanplatte Melamin beschichtet", 1.595, 0.19, 0.0, 0.1, 0.0, 0.639, 0.2, 0.0, 18.0, 0.18, 2.66, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("OSB", 1.595, 0.49, 0.0, 0.1, 0.0, 0.6, 0.2, 0.0, 18.0, 0.39, 7.48, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("HDF", 1.595, 0.29, 0.0, 0.1, 0.0, 0.81, 0.2, 0.0, 18.0, 0.76, 12.0, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("N2 gas", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.048, 0.44, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("N2 flüssig", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.164, 1.8, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("O2 flüssig", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.17, 1.5, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("long polyol", 0.0, 0.0, 0.0, 0.41, 2.0, 0.0, 1.6, 0.0, 37.037, 2.93, 52.052, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("short Polyol", 0.0, 0.0, 0.0, 0.41, 2.0, 0.0, 1.6, 0.0, 42.042, 2.83, 52.052, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("arom Polyol", 0.0, 0.0, 0.0, 0.41, 2.0, 0.0, 1.6, 0.0, 38.038, 1.63, 34.034, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("GAA", 0.0, 0.0, 0.0, 0.41, 2.2, 0.95, 1.6, 0.97, 19.019, 1.2, 26.026, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("MA", 0.0, 0.0, 0.0, 0.41, 2.04, 0.95, 1.6, 1.2, 22.022, 1.7, 34.034, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("EA", 0.0, 0.0, 0.0, 0.41, 2.2, 0.95, 1.6, 1.2, 25.025, 1.6, 59.059, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("BA", 0.0, 0.0, 0.0, 0.41, 2.4, 0.95, 1.6, 1.68, 29.029, 2.2, 46.046, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("EHA", 0.0, 0.0, 0.0, 0.41, 2.44, 0.95, 1.6, 2.26, 33.033, 3.3, 70.07, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("EVA 30%", 0.0, 0.0, 0.0, 0.41, 2.5, 0.945, 1.6, 1.59, 35.035, 2.07, 39.8, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));

        };
    }
}
