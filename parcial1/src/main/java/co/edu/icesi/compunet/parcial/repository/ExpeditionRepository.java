package co.edu.icesi.compunet.parcial.repository;

import org.springframework.stereotype.Repository;
import co.edu.icesi.compunet.parcial.model.Expedition;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ExpeditionRepository {

    private final Map<Integer, Expedition> expeditions = new LinkedHashMap<>();

    private final AtomicInteger secuencia = new AtomicInteger(0);

    public Expedition save(Expedition expedition){

        if(expedition.getId() == null){

            expedition.setId(secuencia.incrementAndGet());

        }

        expeditions.put(expedition.getId(), expedition);

        return expedition;

    }

    public List<Expedition> findAll(){

        return new ArrayList<>(expeditions.values());

    }

    public Expedition<Device> findById(Integer id){

        if(id == null){return Optional.empty();}

        return Optional.ofNullable(expeditions.get(id));

    }
    
}
