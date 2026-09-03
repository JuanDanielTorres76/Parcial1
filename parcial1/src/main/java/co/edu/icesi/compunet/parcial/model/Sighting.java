package co.edu.icesi.compunet.parcial.model;

import java.util.Objects;

public class Sighting {

     private Integer id; 

    private String SightingCode;

    private String name;

    private String Description;

    private String ScientificName;

    private String SightedAt;

    private String Location;

    private Integer Quantity;

    private Integer ConfidenceLevel;

    private Integer ExpeditionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSightingCode() {
        return SightingCode;
    }

    public void setSightingCode(String sightingCode) {
        SightingCode = sightingCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getScientificName() {
        return ScientificName;
    }

    public void setScientificName(String scientificName) {
        ScientificName = scientificName;
    }

    public String getSightedAt() {
        return SightedAt;
    }

    public void setSightedAt(String sightedAt) {
        SightedAt = sightedAt;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Integer getConfidenceLevel() {
        return ConfidenceLevel;
    }

    public void setConfidenceLevel(Integer confidenceLevel) {
        ConfidenceLevel = confidenceLevel;
    }

    public Integer getExpeditionId() {
        return ExpeditionId;
    }

    public void setExpeditionId(Integer expeditionId) {
        ExpeditionId = expeditionId;
    }
    
}
