package co.edu.icesi.compunet.parcial.service;

import co.edu.icesi.compunet.parcial.model.Expedition;
import co.edu.icesi.compunet.parcial.repository.ExpeditionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

public class ExpeditionService {

    private final ExpeditionRepository expeditionRepository;

    public ExpeditionService(ExpeditionRepository expeditionRepository) {

        this.expeditionRepository = expeditionRepository;
    
    }

    public Expedition create(Expedition expedition){

        if (expedition == null) throw new IllegalArgumentException("La expedicion no puede ser null");

        if (expedition.getName() == null || expedition.getName().isBlank()) throw new IllegalArgumentException("El nombre de la expedicion es obligatorio");

        if (expeditionRepository.findById(expedition.getId()).isPresent()) throw new IllegalArgumentException("Ya existe una expedicion con este ID llamado " + expedition.getId());

        return expeditionRepository.save(expedition);

    }
    
}
