package de.heinrich.spoc.controller;

import de.heinrich.spoc.dto.Transportmittel;
import de.heinrich.spoc.service.TransportmittelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/transportmittel")
public class TransportmittelController {
    private final TransportmittelService service;

    @Autowired
    public TransportmittelController(TransportmittelService service) {
        this.service = service;
    }

    @GetMapping("/allTransportmittels")
    public ResponseEntity<List<Transportmittel>> getTransportmittels(){
        List<de.heinrich.spoc.dto.Transportmittel> transportmittels = service.findAllTransportmittels();
        return new ResponseEntity<>(transportmittels, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<de.heinrich.spoc.domain.Transportmittel> getTransportmittelById(@PathVariable("id") Long id){
        de.heinrich.spoc.domain.Transportmittel transportmittel = service.findTransportmittelById(id);
        return new ResponseEntity<>(transportmittel, HttpStatus.OK);
    }
}
