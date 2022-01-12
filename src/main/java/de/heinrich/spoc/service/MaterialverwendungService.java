package de.heinrich.spoc.service;

import de.heinrich.spoc.domain.Materialverwendung;
import de.heinrich.spoc.domain.Verpackung;
import de.heinrich.spoc.repository.MaterialverwendungRepository;
import de.heinrich.spoc.service.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialverwendungService {
    private final MaterialverwendungRepository repo;
    private final MaterialService materialService;
    private final RecyclingverfahrenService recyclingverfahrenService;
    private final VerarbeitungService verarbeitungService;
    private final VerpackungService verpackungService;
    private final EnergierueckgewinnungService energierueckgewinnungService;
    private final TransportmittelService transportmittelService;

    @Autowired
    public MaterialverwendungService(MaterialverwendungRepository repo, MaterialService materialService, RecyclingverfahrenService recyclingverfahrenService, VerarbeitungService verarbeitungService, VerpackungService verpackungService, EnergierueckgewinnungService energierueckgewinnungService, TransportmittelService transportmittelService) {
        this.repo = repo;
        this.materialService = materialService;
        this.recyclingverfahrenService = recyclingverfahrenService;
        this.verarbeitungService = verarbeitungService;
        this.verpackungService = verpackungService;
        this.energierueckgewinnungService = energierueckgewinnungService;
        this.transportmittelService = transportmittelService;
    }

    public Materialverwendung addMaterialverwendung(de.heinrich.spoc.dto.Materialverwendung materialverwendung){
        de.heinrich.spoc.domain.Materialverwendung toSave = new Materialverwendung();
        toSave.setMaterial(materialService.findMaterialById(materialverwendung.getMaterialId()));
        toSave.setVerarbeitung(verarbeitungService.findVerarbeitungById(materialverwendung.getVerarbeitungId()));
        toSave.setRecyclingVerfahren(recyclingverfahrenService.findRecyclingverfahrenById(materialverwendung.getRecyclingverfahrenId()));
        toSave.setVerpackung(verpackungService.findVerpackungById(materialverwendung.getVerpackungId()));
        toSave.setEnergierueckgewinnung(energierueckgewinnungService.findEnergierueckgewinnungById(materialverwendung.getEnergierueckgewinnungId()));
        toSave.setTransportmittel(transportmittelService.findTransportmittelById(materialverwendung.getTransportmittelId()));
        toSave.setMenge(materialverwendung.getMenge());
        toSave.setFlaeche(materialverwendung.getFlaeche());
        toSave.setDicke(materialverwendung.getDicke());
        toSave.setTransportStrecke(materialverwendung.getTransportstrecke());
        toSave.setRecyclingQuote(materialverwendung.getRecyclingQuote());
        return repo.save(toSave);
    }

    public List<Materialverwendung> findAllMaterialverwendungs(){
        return repo.findAll();
    }

    public List<Materialverwendung> findAllByVerpackung(Long id){
        Verpackung verpackung = verpackungService.findVerpackungById(id);
        return repo.findAllByVerpackung(verpackung);
    }

    public Materialverwendung updateMaterialverwendung(Materialverwendung materialverwendung){
        return repo.save(materialverwendung);
    }

    public Materialverwendung findMaterialverwendungById(Long id){
        return repo.findMaterialverwendungById(id).orElseThrow(() -> new EntityNotFoundException("Materialverwendung with id " + id + " was not found!"));
    }

    public void deleteMaterialverwendung(Long id){
        repo.deleteMaterialverwendungById(id);
    }

    public de.heinrich.spoc.dto.Materialverwendung transformEntity(de.heinrich.spoc.domain.Materialverwendung domain) {
        de.heinrich.spoc.dto.Materialverwendung toReturn = new de.heinrich.spoc.dto.Materialverwendung();
        toReturn.setId(domain.getId());
        toReturn.setMaterial(domain.getMaterial().getName());
        toReturn.setMaterialId(domain.getMaterial().getId());
        toReturn.setVerarbeitung(domain.getVerarbeitung().getName());
        toReturn.setVerarbeitungId(domain.getVerarbeitung().getId());
        toReturn.setRecyclingverfahren(domain.getRecyclingVerfahren().getMethode());
        toReturn.setRecyclingQuote(domain.getRecyclingQuote());
        toReturn.setRecyclingverfahrenId(domain.getRecyclingVerfahren().getId());
        toReturn.setVerpackungId(domain.getVerpackung().getId());
        toReturn.setEnergierueckgewinnung(domain.getEnergierueckgewinnung().getName());
        toReturn.setEnergierueckgewinnungId(domain.getEnergierueckgewinnung().getId());
        toReturn.setTransportmittel(domain.getTransportmittel().getName());
        toReturn.setTransportmittelId(domain.getTransportmittel().getId());
        toReturn.setMenge(domain.getMenge());
        toReturn.setFlaeche(domain.getFlaeche());
        toReturn.setDicke(domain.getDicke());
        toReturn.setTransportstrecke(domain.getTransportStrecke());
        return toReturn;
    }
}
