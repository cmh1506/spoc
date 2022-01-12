package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Recyclingverfahren;
import de.heinrich.spoc.repository.MaterialRepository;
import de.heinrich.spoc.repository.RecyclingverfahrenRepository;
import de.heinrich.spoc.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecyclingverfahrenService {
    private final RecyclingverfahrenRepository repo;

    @Autowired
    public RecyclingverfahrenService(RecyclingverfahrenRepository repo) {
        this.repo = repo;
    }

    public List<de.heinrich.spoc.dto.Recyclingverfahren> findAllRecyclingverfahrens(){
        return repo.findAllRecyclingverfahren();
    }



    public Recyclingverfahren findRecyclingverfahrenById(Long id){
        return repo.findRecyclingverfahrenById(id).orElseThrow(() -> new EntityNotFoundException("Recyclingverfahren with id " + id + " was not found!"));
    }


}
