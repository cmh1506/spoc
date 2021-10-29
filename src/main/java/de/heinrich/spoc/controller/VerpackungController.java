package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.Verpackung;
import de.heinrich.spoc.service.VerpackungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/verpackung")
@CrossOrigin(origins = "http://localhost:4200")
public class VerpackungController {private final VerpackungService service;

    @Autowired
    public VerpackungController(VerpackungService service) {
        this.service = service;
    }

    @GetMapping("/allVerpackungs")
    public ResponseEntity<List<Verpackung>> getVerpackungs(){
        List<Verpackung> verpackungs = service.findAllVerpackungs();
        //verpackungs.stream().map()
        return new ResponseEntity<>(verpackungs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Verpackung> getVerpackungById(@PathVariable("id") Long id){
        Verpackung verpackung = service.findVerpackungById(id);
        return new ResponseEntity<>(verpackung, HttpStatus.OK);
    }

    @PostMapping("/addVerpackung")
    public ResponseEntity<Verpackung> addVerpackung(@RequestBody Verpackung verpackung){
        Verpackung newVerpackung = service.addVerpackung(verpackung);
        return new ResponseEntity<>(newVerpackung, HttpStatus.CREATED);
    }

    @PostMapping("/updateVerpackung")
    public ResponseEntity<Verpackung> updateVerpackung(@RequestBody Verpackung verpackung){
        Verpackung updateVerpackung = service.updateVerpackung(verpackung);
        return new ResponseEntity<>(updateVerpackung, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteVerpackung(@PathVariable("id") Long id){
        service.deleteVerpackung(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
