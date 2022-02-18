package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.service.MaterialverwendungService;
import de.heinrich.spoc.util.Spoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/materialverwendung")
public class MaterialverwendungController {
    private final MaterialverwendungService service;
    private final Spoc spoc;

    @Autowired
    public MaterialverwendungController(MaterialverwendungService service, Spoc spoc) {
        this.service = service;
        this.spoc = spoc;
    }

    @GetMapping("/findAllByVerpackung/{id}")
    public ResponseEntity<List<de.heinrich.spoc.dto.Materialverwendung>> findAllByVerpackung(@PathVariable("id") Long id){
        List<Materialverwendung> materialverwendungs = service.findAllByVerpackung(id);
        List<de.heinrich.spoc.dto.Materialverwendung> toReturn = new ArrayList<>();
        materialverwendungs.stream().forEach(materialverwendung -> {
            de.heinrich.spoc.dto.Materialverwendung dto = service.transformEntity(materialverwendung);
            berechneCO2Werte(materialverwendung, dto);
            toReturn.add(dto);});
        return new ResponseEntity<>(toReturn, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Materialverwendung> getMaterialverwendungById(@PathVariable("id") Long id){
        Materialverwendung materialverwendung = service.findMaterialverwendungById(id);
        return new ResponseEntity<>(materialverwendung, HttpStatus.OK);
    }

    @PostMapping("/addMaterialverwendung")
    public ResponseEntity<de.heinrich.spoc.dto.Materialverwendung> addMaterialverwendung(@RequestBody de.heinrich.spoc.dto.Materialverwendung materialverwendung) {
        Materialverwendung materialDomain = service.addMaterialverwendung(materialverwendung);
        de.heinrich.spoc.dto.Materialverwendung toReturn = service.transformEntity(materialDomain);
        berechneCO2Werte(materialDomain, toReturn);//unschön!!!
        return new ResponseEntity<>(toReturn, HttpStatus.CREATED);
    }

    private void berechneCO2Werte(Materialverwendung materialverwendungDomain, de.heinrich.spoc.dto.Materialverwendung materialverwendungDTO) {
        spoc.berechneCO2Werte(materialverwendungDomain, materialverwendungDTO);//unschön!!! methode überflüssig!

    }

    @PostMapping("/updateMaterialverwendung")
    public ResponseEntity<Materialverwendung> updateMaterialverwendung(@RequestBody Materialverwendung materialverwendung){
        Materialverwendung updateMaterialverwendung = service.updateMaterialverwendung(materialverwendung);
        return new ResponseEntity<>(updateMaterialverwendung, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMaterialverwendung(@PathVariable("id") Long id){
        service.deleteMaterialverwendung(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
