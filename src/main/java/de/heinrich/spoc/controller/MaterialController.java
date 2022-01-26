package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/material")
public class MaterialController {
    private final MaterialService service;

    @Autowired
    public MaterialController(MaterialService service) {
        this.service = service;
    }

    @GetMapping("/allMaterials")
    public ResponseEntity<List<de.heinrich.spoc.dto.Material>> getMaterials(){
        List<de.heinrich.spoc.dto.Material> materials = service.findAllMaterials();
        return new ResponseEntity<>(materials, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Material> getMaterialById(@PathVariable("id") Long id){
        Material material = service.findMaterialById(id);
        return new ResponseEntity<>(material, HttpStatus.OK);
    }

    @PostMapping("/addMaterial")
    public ResponseEntity<Material> addMaterial(@RequestBody Material material){
        Material newMaterial = service.addMaterial(material);
        return new ResponseEntity<>(newMaterial, HttpStatus.CREATED);
    }

    @PostMapping("/updateMaterial")
    public ResponseEntity<Material> updateMaterial(@RequestBody Material material){
        Material updateMaterial = service.updateMaterial(material);
        return new ResponseEntity<>(updateMaterial, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteMaterial(@PathVariable("id") Long id){
        service.deleteMaterial(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
