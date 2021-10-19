package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.repository.MaterialverwendungRepository;
import de.heinrich.spoc.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialverwendungService {
    private final MaterialverwendungRepository repo;

    @Autowired
    public MaterialverwendungService(MaterialverwendungRepository repo) {
        this.repo = repo;
    }

    public Materialverwendung addMaterialverwendung(Materialverwendung materialverwendung){
        return repo.save(materialverwendung);
    }

    public List<Materialverwendung> findAllMaterialverwendungs(){
        return repo.findAll();
    }

    public Materialverwendung updateMaterialverwendung(Materialverwendung materialverwendung){
        return repo.save(materialverwendung);
    }

    public Materialverwendung findMaterialverwendungById(Long id){
        return repo.findMaterialverwendungById(id).orElseThrow(() -> new EntityNotFoundException("Materialverwendung with id " + id + " was not found!"));
    }

    public void deleteMaterialverwendung(Long id){
        repo.deleteMaterialverwendungById(id);
    }
}
