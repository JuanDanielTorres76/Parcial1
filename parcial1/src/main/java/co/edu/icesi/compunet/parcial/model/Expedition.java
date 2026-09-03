package co.edu.icesi.compunet.parcial.model;

import java.util.Objects;

public class Expedition{

    private Integer Id;

    private String Name;

    private String Code;

    private String Region;

    private String BaseCamp;

    private String Leader;

    private String StartDate;

    private String EndDate;

    private String Estate;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Sting getCode() {
        return Code;
    }

    public void setCode(Sting code) {
        Code = code;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getBaseCamp() {
        return BaseCamp;
    }

    public void setBaseCamp(String baseCamp) {
        BaseCamp = baseCamp;
    }

    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getEstate() {
        return Estate;
    }

    public void setEstate(String estate) {
        Estate = estate;
    }

    public Expedition(){

    }

    public Expedition(Integer Id, String Name, String Code, String Region, String BaseCamp, String Leader, String StartDate, String EndDate, String Estate){

        this.Id = Id;
        
        this.Name = Name;
        
        this.Code = Code;
        
        this.Region = Region;
        
        this.BaseCamp = BaseCamp;
        
        this.Leader = Leader;
        
        this.StartDate = StartDate;
        
        this.EndDate = EndDate;
        
        this.Estate = Estate;

    }

    @Override
    public boolean equals(Object o){
        
        if(this == o){ return true;}

        if(o == null || getClass() != o.getClass()){ return false;}

        Expedition otro = (Expedition) o;

        return id != null && id.equals(otro.getId());

    }

    @Override
    public int hashCode() {

        return Objects.hash(id);

    }

    @Override
    public String toString(){

        return "Expedición{" + "id=" + Id + ", Nombre" + Name + ", Codigo" + Code + ", Region" + Region + ", Lider" + Leader + ", Base" + BaseCamp + ", Fecha comienzo "  + StartDate + ", Fecha finalizacion "  + EndDate + ", Estado" + Estate + "}";

    }

}