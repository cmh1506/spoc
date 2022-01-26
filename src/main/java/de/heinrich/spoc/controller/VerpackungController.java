package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.Verpackung;
import de.heinrich.spoc.service.UserService;
import de.heinrich.spoc.service.VerpackungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/verpackung")
public class VerpackungController {
    private final VerpackungService service;
    private final UserService userService;
    @Autowired
    public VerpackungController(VerpackungService service, UserService userService) {
        this.service = service;
        this.userService = userService;
    }

    @GetMapping("/allVerpackungs")
    public ResponseEntity<List<Verpackung>> getVerpackungs(){
        List<Verpackung> verpackungs = service.findAllVerpackungs();
        return new ResponseEntity<>(verpackungs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Verpackung> getVerpackungById(@PathVariable("id") Long id){
        Verpackung verpackung = service.findVerpackungById(id);
        return new ResponseEntity<>(verpackung, HttpStatus.OK);
    }

    @PostMapping("/addVerpackung")
    public ResponseEntity<de.heinrich.spoc.dto.Verpackung> addVerpackung(@RequestBody de.heinrich.spoc.dto.Verpackung verpackung){
        Verpackung newVerpackung = service.addVerpackung(verpackung);
        de.heinrich.spoc.dto.Verpackung toReturn = service.transformDomain(newVerpackung);
        return new ResponseEntity<>(toReturn, HttpStatus.CREATED);
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

    @GetMapping("/findAllForUserId/{id}")
    public ResponseEntity<List<de.heinrich.spoc.dto.Verpackung>> findAllForUserId(@PathVariable("id") Long id){
        List<Verpackung> fromDB = service.findAllForUser(userService.findUserById(id));
        List<de.heinrich.spoc.dto.Verpackung> toReturn = new ArrayList<>();
        fromDB.stream().forEach(verpackung -> {toReturn.add(service.transformDomain(verpackung));});
        return new ResponseEntity<>(toReturn, HttpStatus.OK);
    }


}
