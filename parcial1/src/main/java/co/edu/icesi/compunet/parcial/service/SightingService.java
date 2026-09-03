package co.edu.icesi.compunet.parcial.service;

import org.springframework.stereotype.Service;
import co.edu.icesi.compunet.parcial.model.Sighting;
import co.edu.icesi.compunet.parcial.model.Expedition;
import co.edu.icesi.compunet.parcial.repository.ExpeditionRepository;
import co.edu.icesi.compunet.parcial.repository.SightingRepository;
import java.util.List;
import java.util.Optional;

@Service
public class SightingService {

    private final ExpeditionRepository expeditionRepository;

    private final SightingRepository sightingRepository;

    public SightingService(ExpeditionRepository expeditionRepository,SightingRepository sightingRepository) {
        
        this.expeditionRepository = expeditionRepository;
        
        this.sightingRepository = sightingRepository;
    
    }

    //create(Integer id, Integer SightingCode, String name, String Description, String ScientificName, String SightedAt, String Location, Integer Quantity, Integer ConfidenceLevel, Integer ExpeditionId)
        
    public Sighting create(Integer id, String SightingCode, String name, String Description, String ScientificName, String SightedAt, String Location, Integer Quantity, Integer ConfidenceLevel, Integer ExpeditionId){

        Expedition expedition = expeditionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No existe una expedicion con id " + id));

        Sighting s = new Sighting(id, SightingCode, name, Description, ScientificName, SightedAt, Location, Quantity, ConfidenceLevel, ExpeditionId);

        return sightingRepository.save(s);

    }

    public List<Sighting> findById(Integer id){

        return sightingRepository.findById(id);

    }

    public List<Sighting> findAll(){

        return sightingRepository.findAll();

    }
    
}
