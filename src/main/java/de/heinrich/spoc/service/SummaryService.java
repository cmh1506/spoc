package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.dto.SummaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryService {

    private MaterialverwendungService materialverwendungService;

    @Autowired
    public SummaryService(VerpackungService verpackungService, MaterialverwendungService materialverwendungService) {
        this.materialverwendungService = materialverwendungService;
    }

    public SummaryDTO findSummaryForVerpackung (Long verpackungId){
        List<Materialverwendung> mvs = materialverwendungService.findAllByVerpackung(verpackungId);

        return null;
    }
}
