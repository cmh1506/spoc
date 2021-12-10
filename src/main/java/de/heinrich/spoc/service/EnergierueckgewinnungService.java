package de.heinrich.spoc.service;

import de.heinrich.spoc.dto.Energierueckgewinnung;
import de.heinrich.spoc.repository.EnergierueckgewinnungRepository;
import de.heinrich.spoc.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergierueckgewinnungService {
    private final EnergierueckgewinnungRepository repo;
    @Autowired
    public EnergierueckgewinnungService(EnergierueckgewinnungRepository repo) {
        this.repo = repo;
    }
    public List<Energierueckgewinnung> findAllEnergierueckgewinnungs(){
        return repo.findAllMaterials();
    }

    public de.heinrich.spoc.domain.Energierueckgewinnung findEnergierueckgewinnungById(Long id) {
        return repo.findEnergierueckgewinnungById(id).orElseThrow(() -> new EntityNotFoundException("Energierueckgewinnung with id " + id + " was not found!"));
    }
}
