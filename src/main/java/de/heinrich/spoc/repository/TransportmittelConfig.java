package de.heinrich.spoc.repository;

import de.heinrich.spoc.domain.Transportmittel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransportmittelConfig {
    @Bean
    CommandLineRunner initTransportmittels(TransportmittelRepository transportmittelRepository){
        return args -> {
            transportmittelRepository.save(new Transportmittel("Bahn", 0.000022, 0.000284705882352941));
            transportmittelRepository.save(new Transportmittel("Flugzeug", 0.00077, 0.00996470588235294));
            transportmittelRepository.save(new Transportmittel("LKW", 0.0000725, 0.00102190476190476));
            transportmittelRepository.save(new Transportmittel("Schiff", 0.0000084, 0.000108705882352941));
        };
    }
}
