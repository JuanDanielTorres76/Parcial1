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

    public Sighting(Integer id, String sightingCode, String name, String description, String scientificName, String sightedAt, String location, Integer quantity, Integer confidenceLevel, Integer expeditionId) {
        
        this.id = id;
        
        this.SightingCode = sightingCode;
        
        this.name = name;
        
        this.Description = description;
        
        this.ScientificName = scientificName;
        
        this.SightedAt = sightedAt;
        
        this.Location = location;
        
        this.Quantity = quantity;
        
        this.ConfidenceLevel = confidenceLevel;
        
        this.ExpeditionId = expeditionId;
    }

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

    public Sighting(){

    }

    @Override
    public boolean equals(Object o){
        
        if(this == o){ return true;}

        if(o == null || getClass() != o.getClass()){ return false;}

        Sighting otro = (Sighting) o;

        return id != null && id.equals(otro.getId());

    }

     @Override
    public int hashCode() {

        return Objects.hash(id);

    }

     @Override
     public String toString() {
        return "Sighting [id=" + id + ", SightingCode=" + SightingCode + ", name=" + name + ", Description="
                + Description + ", ScientificName=" + ScientificName + ", SightedAt=" + SightedAt + ", Location="
                + Location + ", Quantity=" + Quantity + ", ConfidenceLevel=" + ConfidenceLevel + ", ExpeditionId="
                + ExpeditionId + "]";
     }
    
}
