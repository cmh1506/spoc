package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.Verarbeitung;
import de.heinrich.spoc.service.VerarbeitungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/verarbeitung")
public class VerarbeitungController {

    private final VerarbeitungService service;

    @Autowired
    public VerarbeitungController(VerarbeitungService service) {
        this.service = service;
    }
    @GetMapping("/allVerarbeitungs")
    public ResponseEntity<List<Verarbeitung>> getVerarbeitungs(){
        List<Verarbeitung> verarbeitungs = service.findAllVerarbeitungs();
        return new ResponseEntity<>(verarbeitungs, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Verarbeitung> getVerarbeitungById(@PathVariable("id") Long id){
        Verarbeitung verarbeitung = service.findVerarbeitungById(id);
        return new ResponseEntity<>(verarbeitung, HttpStatus.OK);
    }

    @PostMapping("/addVerarbeitung")
    public ResponseEntity<Verarbeitung> addVerarbeitung(@RequestBody Verarbeitung verarbeitung){
        Verarbeitung newVerarbeitung = service.addVerarbeitung(verarbeitung);
        return new ResponseEntity<>(newVerarbeitung, HttpStatus.CREATED);
    }

    @PostMapping("/updateVerarbeitung")
    public ResponseEntity<Verarbeitung> updateVerarbeitung(@RequestBody Verarbeitung verarbeitung){
        Verarbeitung updateVerarbeitung = service.updateVerarbeitung(verarbeitung);
        return new ResponseEntity<>(updateVerarbeitung, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteVerarbeitung(@PathVariable("id") Long id){
        service.deleteVerarbeitung(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
