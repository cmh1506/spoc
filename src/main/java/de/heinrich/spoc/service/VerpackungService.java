package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Verpackung;
import de.heinrich.spoc.repository.VerpackungRepository;
import de.heinrich.spoc.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerpackungService {
    private final VerpackungRepository repo;

    @Autowired
    public VerpackungService(VerpackungRepository repo) {
        this.repo = repo;
    }

    public Verpackung addVerpackung(Verpackung verpackung){
        return repo.save(verpackung);
    }

    public List<Verpackung> findAllVerpackungs(){
        return repo.findAll();
    }

    public Verpackung updateVerpackung(Verpackung verpackung){
        return repo.save(verpackung);
    }

    public Verpackung findVerpackungById(Long id){
        return repo.findVerpackungById(id).orElseThrow(() -> new EntityNotFoundException("Verpackung with id " + id + " was not found!"));
    }

    public void deleteVerpackung(Long id){
        repo.deleteVerpackungById(id);
    }
}
