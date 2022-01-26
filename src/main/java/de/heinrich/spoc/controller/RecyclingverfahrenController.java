package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.Recyclingverfahren;
import de.heinrich.spoc.service.RecyclingverfahrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/recyclingverfahren")
public class RecyclingverfahrenController {
    private final RecyclingverfahrenService service;

    @Autowired
    public RecyclingverfahrenController(RecyclingverfahrenService service) {
        this.service = service;
    }

    @GetMapping("/allRecyclingverfahrens")
    public ResponseEntity<List<de.heinrich.spoc.dto.Recyclingverfahren>> getRecyclingverfahrens(){
        List<de.heinrich.spoc.dto.Recyclingverfahren> recyclingverfahrens = service.findAllRecyclingverfahrens();
        return new ResponseEntity<>(recyclingverfahrens, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Recyclingverfahren> getRecyclingverfahrenById(@PathVariable("id") Long id){
        Recyclingverfahren recyclingverfahren = service.findRecyclingverfahrenById(id);
        return new ResponseEntity<>(recyclingverfahren, HttpStatus.OK);
    }


}
