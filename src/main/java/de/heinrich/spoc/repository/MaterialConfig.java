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
            materialRepository.save(new Material("1110 LDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 25.0025, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1120 LLDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.7, 46.046, 1.79, 33.033, 25.0025, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1130 HDPE", 0.0, 0.0, 0.0, 0.368, 3.14, 0.955, 1.6, 1.8, 46.046, 1.8, 34.034, 35.0035, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1210 PP", 0.0, 0.0, 0.0, 0.41, 3.14, 0.91, 1.6, 1.7, 46.4, 1.63, 31.5, 30.003, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1310 PET", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24.024, 2.19, 47.2, 31.0031, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1410 PS (EPS)", 0.0, 0.0, 0.0, 0.41, 3.38, 0.015, 1.6, 1.85, 40.04, 3.17, 54.9, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1420 PS (GPPS)", 0.0, 0.0, 0.0, 0.316, 3.38, 1.05, 1.6, 1.7, 42.042, 2.25, 40.3, 30.003, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1430 PS (HIPS)", 0.0, 0.0, 0.0, 0.316, 3.38, 1.05, 1.6, 1.7, 42.042, 2.43, 44.59, 30.003, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1510  EVA 30%", 0.0, 0.0, 0.0, 0.41, 2.5, 0.945, 1.6, 1.59, 35.035, 2.07, 39.8, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1530 EVOH ", 0.0, 0.0, 0.0, 0.41, 2.2, 1.2, 1.6, 1.59, 30.03, 2.95, 40.04, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1610 PA", 0.0, 0.0, 0.0, 0.41, 2.34, 1.15, 1.6, 2.5, 38.5, 6.7, 91.091, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1710 PVC", 0.0, 0.0, 0.0, 0.41, 1.4, 1.38, 1.6, 1.4, 20.02, 1.99, 40.04, 10.001, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1720 PVDC", 0.0, 0.0, 0.0, 0.41, 0.91, 1.63, 1.6, 1.6, 21.5, 4.4, 40.04, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1820 ABS", 0.0, 0.0, 0.0, 0.36, 3.3, 1.05, 1.6, 1.95, 44.044, 3.1, 52.18, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1840 PC", 0.0, 0.0, 0.0, 0.41, 2.89, 1.2, 1.6, 2.0, 33.033, 3.4, 71.28, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1860 aliph PU", 0.0, 0.0, 0.0, 0.41, 2.0, 0.05, 1.6, 3.3, 31.031, 6.5, 113.113, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1880 PUR", 0.0, 0.0, 0.0, 0.41, 2.0, 1.0, 1.6, 1.8, 33.033, 3.0, 56.056, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("1910 SAN", 0.0, 0.0, 0.0, 0.36, 3.31, 1.09, 1.6, 2.0, 44.044, 2.96, 52.88, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("2100 alle Papiere Mittelwert", 0.51, 0.4, 0.0, 0.7, 0.0, 1, 10.0, 0.12, 14, 0.75, 16.4, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2200 Papier hf", 1.44, 1.02, 0.0, 0.7, 0.0, 1, 10.0, 0.12, 16.0, 0.74, 25.9, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2300 Papier holzhaltig", 1.44, 0.53, 0.0, 0.7, 0.0, 1, 10.0, 0.12, 16.0, 0.95, 16.1, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2400 Altpapier", 0.4, 0.32, 0.0, 0.7, 0.0, 1, 0.0, 0.12, 3.6, 0.74, 13.3, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2500 Kraftliner", 1.44, 0.87, 0.0, 0.7, 0.0, 1, 10.0, 0.12, 16.0, 0.74, 23.4, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2600 Testliner", 0.4, 0.32, 0.0, 0.7, 0.0, 1, 0.0, 0.12, 3.6, 0.73, 13.3, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2700 Schrenz", 0.4, 0.32, 0.0, 0.7, 0.0, 1, 0.0, 0.12, 3.6, 0.73, 13.3, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2810 Karton GZ", 1.1, 0.82, 0.0, 0.7, 0.0, 1, 10.0, 0.12, 14.0, 0.7, 22.4, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2820 Karton GC", 1.1, 0.404, 0.0, 0.7, 0.0, 1, 10.0, 0.12, 14.0, 0.92, 13.5, 71.10711, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2830 Karton GD", 1.1, 0.29, 0.0, 0.7, 0.0, 1, 0.0, 0.12, 3.1, 0.73, 12.4, 71.10711, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("2900 Glassine", 1.6, 1.1, 0.0, 0.7, 0.0, 1, 10.0, 0.12, 18.0, 0.76, 25.9, 0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("3100 Alu prod EU", 0.0, 0.0, 0.0, 0.5, 0.0, 2.71, 8.0, 0.53, 10.0, 6.7, 140, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("3200 Alu used EU", 0.0, 0.0, 0.0, 0.5, 0.0, 2.71, 8.0, 0.53, 10.0, 8.6, 160.0, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("3300 R-Weißblech", 0.0, 0.0, 0.0, 0.71, 0.0, 7.8, 5.5, 0.311, 0.0, 1.03, 8.6, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("3400 Hochofenstahl", 0.0, 0.0, 0.0, 0.71, 0.0, 7.8, 5.5, 0.0, 8.0, 1.6, 14.0, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("3500 Elektrostahl", 0.0, 0.0, 0.0, 0.71, 0.0, 7.8, 5.5, 0.0, 8.0, 0.71, 5.5, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("4100 R-LDPE, Recyclat", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 25.0025, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4110 R-LLDPE, Recyclat", 0.0, 0.0, 0.0, 0.368, 3.14, 0.925, 1.6, 1.7, 46.0, 1.79, 33.033, 25.0025, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4140 R-HDPE, Recyclat", 0.0, 0.0, 0.0, 0.368, 3.14, 0.955, 1.6, 1.8, 46.0, 1.8, 34.034, 35.0035, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4160 R-PP, Recyclat", 0.0, 0.0, 0.0, 0.368, 3.14, 0.91, 1.6, 1.7, 46.4, 1.63, 31.5, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4210 R-PET (bottle), Recyclat", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24.0, 2.19, 47.2, 94.0094, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4230 R-PET (Schale), Recyclat", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24.0, 2.19, 47.2, 31.0031, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4250 R-Misch-PET-90/10, Recyclat", 0.0, 0.0, 0.0, 0.433, 2.29, 1.38, 1.8, 1.6, 24.0, 2.19, 47.2, 31.0031, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4310 R-Mischkunststoff, Recyclat", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4330 R-MPO Flex, Recyclat", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4350 R-Folien, Recyclat", 0.0, 0.0, 0.0, 0.394, 3.14, 0.925, 1.6, 1.8, 46.0, 1.87, 36.7, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4370 R-BioPE, Bio-Polymer", 3.14, 2.77, 0.0, 0.368, 0.0, 0.925, 1.8, 0.4, 46.0, 1.0, 70.07, 30.003, true, true, Recyclingverfahren.OPEN_LOOP, 3.14));
            materialRepository.save(new Material("4610 bio PE, Bio-Polymer", 3.14, 2.77, 0.0, 0.368, 0.0, 0.925, 1.6, 0.4, 46.0, 1.0, 70.07, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 3.14));
            materialRepository.save(new Material("4620 bio PE iluc, Bio-Polymer", 3.14, 2.77, 0.0, 0.368, 0.0, 0.925, 1.6, 0.4, 46.0, 2.33, 70.07, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 3.14));
            materialRepository.save(new Material("4650 PLA, Bio-Polymer", 0.0, 0.0, 0.0, 0.41, 0.0, 1.3, 1.6, 1195, 18.018, 1.0, 53.8, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("4700 bio-PET, Bio-Polymer", 0.46, 0.0, 0.0, 0.48, 1834, 1.38, 1.6, 1.13, 24.024, 1.8, 51.051, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.46));
            materialRepository.save(new Material("4750 bio-PA, Bio-Polymer", 2.34, 0.0, 0.0, 0.41, 0.0, 1.15, 1.6, 1.44, 20.02, 3.38, 64.8, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 2.34));
            materialRepository.save(new Material("5100 Glas: R-Behälterglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 6.2, 0.16, 0.0, 0.36, 7.2, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("5200 Glas: R-Buntglas", 0.0, 0.0, 0.0, 0.306, 0.0, 2.5, 6.2, 0.129, 0.0, 0.306, 6.2, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("5300 Glas: R-Weißglas", 0.0, 0.0, 0.0, 0.382, 0.0, 2.5, 7.6, 0.158, 0.0, 0.382, 7.6, 0.0, false, false, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("5410 Glas: Weißglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 7.6, 0.176, 0.0, 0.449, 8.47, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("5430 Glas: Buntglas", 0.0, 0.0, 0.0, 0.306, 0.0, 2.5, 6.2, 0.176, 0.0, 0.437, 8.47, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("5510 Glas: Flaconglas", 0.0, 0.0, 0.0, 0.36, 0.0, 2.5, 6.2, 0.32, 0.0, 0.76, 14.0, 0.0, false, true, Recyclingverfahren.CLOSED_LOOP, 0.0));
            materialRepository.save(new Material("6100 Holz:  Nadelschnittholz trocken", 1.595, 0.46, 0.0, 0.1, 0.0, 0.484, 0.2, 0.0, 18.0, 0.08, 0.78, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6150 Holz:  Nadelschnittholz frisch", 1.595, 0.01, 0.0, 0.1, 0.0, 0.674, 0.2, 0.0, 18.0, 0.023, 0.49, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6180 Holz:  Laubschnittholz", 1.595, 0.94, 0.0, 0.1, 0.0, 0.761, 0.2, 0.0, 18.0, 0.13, 1.85, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6210 Holz:  Furniersperrholz", 1.595, 1.72, 0.0, 0.1, 0.0, 0.824, 0.2, 0.0, 18.0, 0.31, 5.4, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6310 Holz:  Brettschichtholz", 1.595, 0.64, 0.0, 0.1, 0.0, 0.507, 0.2, 0.0, 18.0, 0.19, 2.61, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6350 Holz:  Dreischichtholz", 1.595, 0.36, 0.0, 0.1, 0.0, 0.51, 0.2, 0.0, 18.0, 0.23, 2.89, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6410 Holz:  OSB", 1.595, 0.49, 0.0, 0.1, 0.0, 0.6, 0.2, 0.0, 18.0, 0.39, 7.48, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6510 Holz:  Spanplatte", 1.595, 0.13, 0.0, 0.1, 0.0, 0.633, 0.2, 0.0, 18.0, 0.13, 1.81, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6520 Holz:  Spanplatte Melamin beschichtet", 1.595, 0.19, 0.0, 0.1, 0.0, 0.639, 0.2, 0.0, 18.0, 0.18, 2.66, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("6610 Holz:  HDF", 1.595, 0.29, 0.0, 0.1, 0.0, 0.81, 0.2, 0.0, 18.0, 0.76, 12.0, 0.0, false, true, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7010 Druckfarben: Flexofarbe M", 0.0, 0.0, 0.0, 0.41, 2.5, 1.0, 1.6, 0.7, 30.03, 3.293, 40.04, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7020 Druckfarben: Flexofarbe wässrig M", 0.0, 0.0, 0.0, 0.41, 2.5, 1.0, 1.6, 0.0, 30.03, 3.293, 30.03, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7030 Druckfarben: Flexofarbe wässrig M", 0.0, 0.0, 0.0, 0.41, 2.5, 1.0, 1.6, 0.0, 30.03, 3.293, 30.03, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7110 Druckfarben: Offsetfarbe M", 1.6, 0.0, 0.0, 0.41, 0.8, 1.0, 1.6, 0.7, 30.03, 2, 30.03, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 1.6));
            materialRepository.save(new Material("7210 Druckfarben: Tiefdruckfarbe M", 0.0, 0.0, 0.0, 0.41, 2.5, 1.0, 1.6, 0.0, 30.03, 3.293, 30.03, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7510 Klebstoffe: 2k lf Klebstoff M", 0.0, 0.0, 0.0, 0.41, 2.0, 1.0, 1.6, 1.8, 33.0, 3.5, 56.056, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7520 Klebstoffe: 2k lh Klebstoff M", 0.0, 0.0, 0.0, 0.41, 2.0, 1.0, 1.6, 1.8, 30.03, 4.3, 56.056, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7610 Klebstoffe: HMA C5-Harz", 0.0, 0.0, 0.0, 0.41, 2.8, 1.0, 1.6, 1.7, 43.5, 2.1, 34.5, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7650 Klebstoffe: HMA EVA Rosin", 1.1, 0.0, 0.0, 0.41, 1.6, 1.0, 1.6, 1.1, 42.3, 1.6, 21.5, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7710 Klebstoffe: HMPSA (C5 Resin)", 0.0, 0.0, 0.0, 0.41, 3.15, 1.0, 1.6, 1.7, 41.0, 2.5, 50.0, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7720 Klebstoffe: HMPSA (Rosin)", 1.59, 0.0, 0.0, 0.41, 1.36, 1.0, 1.6, 0.78, 42.0, 1.7, 31.0, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("7810 Klebstoffe: PSA-Acrylat generic", 0.0, 0.0, 0.0, 0.41, 0.0, 1.38, 1.6, 1.8, 22.0, 2.5, 50.05, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("9110 Schäume: PU Foam 18", 0.0, 0.0, 0.0, 0.41, 2.0, 0.018, 1.6, 1.85, 33.0, 3.18, 55.055, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("9130 Schäume: Pu foam 35", 0.0, 0.0, 0.0, 0.41, 2.0, 0.035, 1.6, 1.91, 33.0, 3.22, 59.059, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("9150 Schäume: Pu foam 40", 0.0, 0.0, 0.0, 0.41, 2.0, 0.04, 1.6, 2.03, 33.0, 3.56, 64.064, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("9170 Schäume: Pu foam 45", 0.0, 0.0, 0.0, 0.41, 2.0, 0.045, 1.6, 1.85, 33.0, 2.95, 55.055, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("9210 Schäume: rigid PU foam", 0.0, 0.0, 0.0, 0.41, 2.0, 0.05, 1.6, 2.1, 37.037, 4.2, 64.064, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("9410 Gase: N2 flüssig", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.164, 1.8, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("9420 Gase: N2 gas", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.048, 0.44, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));
            materialRepository.save(new Material("9430 Gase: O2 flüssig", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.17, 1.5, 0.0, false, false, Recyclingverfahren.OPEN_LOOP, 0.0));

        };
    }
}
