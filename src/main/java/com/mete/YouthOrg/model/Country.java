package com.mete.YouthOrg.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id")
    private int country_id;

    @Column(name = "country_name")
    private String country_name;

    @OneToMany(mappedBy = "uni_country")
    private Set<University> universities;

    @OneToMany(mappedBy = "country")
    private Set<Province> provinces;


    public Country(){

    }

    public Country(String country_name, Set<University> universities, Set<Province> provinces) {
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

    public Set<University> getUniversities() {
        return universities;
    }

    public void setUniversities(Set<University> universities) {
        this.universities = universities;
    }

    public Set<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(Set<Province> provinces) {
        this.provinces = provinces;
    }
}
