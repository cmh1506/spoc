package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.NutzenergieCO2Equivalent;
import de.heinrich.spoc.repository.NutzenergieCO2EquivalentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutzenergieCO2EquivalentService {
    private final NutzenergieCO2EquivalentRepository repo;
    @Autowired
    public NutzenergieCO2EquivalentService(NutzenergieCO2EquivalentRepository repo) {
        this.repo = repo;
    }
    public List<NutzenergieCO2Equivalent> findALL() {
        return repo.findAll();
    }
    public NutzenergieCO2Equivalent findNutzenergieCO2EquivalentByEnergietraeger(String energietraeger){
        return repo.findNutzenergieCO2EquivalentByEnergietraeger(energietraeger);
    }
}
