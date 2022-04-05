package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.domain.User;
import de.heinrich.spoc.domain.Verpackung;
import de.heinrich.spoc.repository.VerpackungRepository;
import de.heinrich.spoc.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerpackungService {
    private final VerpackungRepository repo;
    private final UserService userService;

    @Autowired
    public VerpackungService(VerpackungRepository repo, UserService userService) {
        this.repo = repo;
        this.userService = userService;
    }

    public Verpackung addVerpackung(de.heinrich.spoc.dto.Verpackung dto){
        de.heinrich.spoc.domain.Verpackung toSave = transformDTO(dto);
        return repo.save(toSave);
    }

    public Verpackung updateVerpackung(de.heinrich.spoc.dto.Verpackung dto){
        de.heinrich.spoc.domain.Verpackung toSave = transformDTO(dto);
        return repo.save(toSave);
    }

    private Verpackung transformDTO(de.heinrich.spoc.dto.Verpackung dto) {
        de.heinrich.spoc.domain.Verpackung toReturn;
        if(dto.getId() == null || dto.getId() == 0L){
            toReturn = new Verpackung();
        } else {
            toReturn = repo.findVerpackungById(dto.getId()).get();
        }
        toReturn.setName(dto.getName());
        toReturn.setUser(userService.findUserById(dto.getUserId()).orElseThrow());
        toReturn.setBeschreibung(dto.getBeschreibung());
        return toReturn;
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

    public List<Verpackung> findAllForUser(User principal) {
        return repo.findAllByUser(principal);
    }

    public de.heinrich.spoc.dto.Verpackung transformDomain(Verpackung domain) {
        de.heinrich.spoc.dto.Verpackung toReturn = new de.heinrich.spoc.dto.Verpackung();
        toReturn.setId(domain.getId());
        toReturn.setName(domain.getName());
        toReturn.setBeschreibung(domain.getBeschreibung());
        return toReturn;
    }
}
