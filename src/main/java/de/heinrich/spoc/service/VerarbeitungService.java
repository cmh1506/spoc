package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Verarbeitung;
import de.heinrich.spoc.repository.VerarbeitungRepository;
import de.heinrich.spoc.service.exceptions.VerarbeitungNotFoundException;

import java.util.List;

@Service
public class VerarbeitungService {
    private final VerarbeitungRepository repo;

    @Autowired
    public VerarbeitungService(VerarbeitungRepository repo) {
        this.repo = repo;
    }

    public Verarbeitung addVerarbeitung(Verarbeitung verarbeitung){
        return repo.save(Verarbeitung);
    }

    public List<Verarbeitung> findAllVerarbeitungs(){
        return repo.findAll();
    }

    public Verarbeitung updateVerarbeitung(Verarbeitung verarbeitung){
        return repo.save(verarbeitung);
    }

    public Verarbeitung findVerarbeitungById(Long id){
        return repo.findVerarbeitungById(id).orElseThrow(() -> new VerarbeitungNotFoundException("Verarbeitung with id " + id + " was not found!"));
    }

    public void deleteVerarbeitung(Long id){
        repo.deleteVerarbeitungById(id);
    }
}
