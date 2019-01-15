package com.mete.YouthOrg.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id")
    private int country_id;

    @Column(name = "country_name")
    private String country_name;

    @OneToMany(mappedBy = "uni_country")
    private Set<Universities> universities;

    @OneToMany(mappedBy = "country")
    private Set<Provinces> provinces;


    public Countries(){

    }

    public Countries(String country_name, Set<Universities> universities, Set<Provinces> provinces) {
        this.country_name = country_name;
        this.universities = universities;
        this.provinces = provinces;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public Set<Universities> getUniversities() {
        return universities;
    }

    public void setUniversities(Set<Universities> universities) {
        this.universities = universities;
    }

    public Set<Provinces> getProvinces() {
        return provinces;
    }

    public void setProvinces(Set<Provinces> provinces) {
        this.provinces = provinces;
    }
}
