package de.heinrich.spoc.controller;

import de.heinrich.spoc.dto.Energierueckgewinnung;
import de.heinrich.spoc.service.EnergierueckgewinnungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/energierueckgewinnung")
public class EnergierueckgewinnungController {
    private final EnergierueckgewinnungService service;
    @Autowired
    public EnergierueckgewinnungController(EnergierueckgewinnungService service) {
        this.service = service;
    }
    @GetMapping("/allEnergierueckgewinnungs")
    public ResponseEntity<List<Energierueckgewinnung>> getEnergierueckgewinnungs(){
        List<Energierueckgewinnung> energierueckgewinnungs = service.findAllEnergierueckgewinnungs();
        return new ResponseEntity<>(energierueckgewinnungs, HttpStatus.OK);
    }
}
