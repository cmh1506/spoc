package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Transportmittel;
import de.heinrich.spoc.repository.TransportmittelRepository;
import de.heinrich.spoc.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportmittelService {
    private final TransportmittelRepository repo;
    @Autowired
    public TransportmittelService(TransportmittelRepository repo) {
        this.repo = repo;
    }
    public List<de.heinrich.spoc.dto.Transportmittel> findAllTransportmittels(){
        List<de.heinrich.spoc.dto.Transportmittel> toReturn = repo.findAllTransportmittels();
        return toReturn;
    }

    public Transportmittel findTransportmittelById(Long id){
        return repo.findTransportmittelById(id).orElseThrow(() -> new EntityNotFoundException("Transportmittel with id " + id + " was not found!"));
    }
    
}
