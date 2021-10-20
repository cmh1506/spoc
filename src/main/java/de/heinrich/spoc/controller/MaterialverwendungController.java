package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.service.MaterialverwendungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/materialverwendung")
public class MaterialverwendungController {
    private final MaterialverwendungService service;

    @Autowired
    public MaterialverwendungController(MaterialverwendungService service) {
        this.service = service;
    }

    @GetMapping("/allMaterialverwendungs")
    public ResponseEntity<List<Materialverwendung>> getMaterialverwendungs(){
        List<Materialverwendung> materialverwendungs = service.findAllMaterialverwendungs();
        return new ResponseEntity<>(materialverwendungs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Materialverwendung> getMaterialverwendungById(@PathVariable("id") Long id){
        Materialverwendung materialverwendung = service.findMaterialverwendungById(id);
        return new ResponseEntity<>(materialverwendung, HttpStatus.OK);
    }

    @PostMapping("/addMaterialverwendung")
    public ResponseEntity<Materialverwendung> addMaterialverwendung(@RequestBody Materialverwendung materialverwendung){
        Materialverwendung newMaterialverwendung = service.addMaterialverwendung(materialverwendung);
        return new ResponseEntity<>(newMaterialverwendung, HttpStatus.CREATED);
    }

    @PostMapping("/updateMaterialverwendung")
    public ResponseEntity<Materialverwendung> updateMaterialverwendung(@RequestBody Materialverwendung materialverwendung){
        Materialverwendung updateMaterialverwendung = service.updateMaterialverwendung(materialverwendung);
        return new ResponseEntity<>(updateMaterialverwendung, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteMaterialverwendung(@PathVariable("id") Long id){
        service.deleteMaterialverwendung(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
