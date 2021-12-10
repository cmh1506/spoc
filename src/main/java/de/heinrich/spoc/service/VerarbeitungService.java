package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Verarbeitung;
import de.heinrich.spoc.repository.VerarbeitungRepository;
import de.heinrich.spoc.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerarbeitungService {
    private final VerarbeitungRepository repo;

    @Autowired
    public VerarbeitungService(VerarbeitungRepository repo) {
        this.repo = repo;
    }

    public Verarbeitung addVerarbeitung(Verarbeitung verarbeitung){
        return repo.save(verarbeitung);
    }

    public List<de.heinrich.spoc.dto.Verarbeitung> findAllVerarbeitungs(){
        return repo.findAllVerarbeitungs();
    }

    public Verarbeitung updateVerarbeitung(Verarbeitung verarbeitung){
        return repo.save(verarbeitung);
    }

    public Verarbeitung findVerarbeitungById(Long id){
        return repo.findVerarbeitungById(id).orElseThrow(() -> new EntityNotFoundException("Verarbeitung with id " + id + " was not found!"));
    }

    public void deleteVerarbeitung(Long id){
        repo.deleteVerarbeitungById(id);
    }
}
