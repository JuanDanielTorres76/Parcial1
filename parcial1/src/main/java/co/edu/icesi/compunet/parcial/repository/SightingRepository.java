package co.edu.icesi.compunet.parcial.repository;

import org.springframework.stereotype.Repository;
import co.edu.icesi.compunet.parcial.model.Sighting;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class SightingRepository {

    private final Map<Integer, Sighting> sightings = new LinkedHashMap<>();

    private final AtomicInteger secuencia = new AtomicInteger(0);

    public Sighting save(Sighting sighting){

        if(sighting.getId() == null){

            sighting.setId(secuencia.incrementAndGet());

        }

        sightings.put(sighting.getId(), sighting);

        return sighting;

    }

    public List<Sighting> findAll(){

        return new ArrayList<>(sightings.values());

    }

    public List<Sighting> findByAssetId(Integer assetId){

        if (assetId == null) return new ArrayList<>();

        List<Sighting> resultado = new ArrayList<>();

        for (Sighting m : sightings.values()) {
            if (assetId.equals(m.getId())) {
                resultado.add(m);
            }
        }

        return resultado;

    }

}
