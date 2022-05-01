package de.heinrich.spoc.controller;

import de.heinrich.spoc.domain.Material;
import de.heinrich.spoc.dto.SummaryDTO;
import de.heinrich.spoc.service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/summary")
public class SummaryController {

    private final SummaryService summaryService;

    @Autowired
    public SummaryController(SummaryService summaryService) {
        this.summaryService = summaryService;
    }

    @GetMapping("/findSummaryForVerpackung/{id}")
    public ResponseEntity<SummaryDTO> findSummaryForVerpackung(@PathVariable("id") Long id){
        SummaryDTO toReturn = summaryService.findSummaryForVerpackung(id);
        return new ResponseEntity<>(toReturn, HttpStatus.OK);
    }

}
