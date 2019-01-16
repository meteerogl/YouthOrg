package com.mete.YouthOrg.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provinces")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "province_id")
    private int id;


    @Column(name = "province_name")
    private String province_name;


    @OneToMany(mappedBy = "uni_province")
    private Set<University> universities;

    @ManyToOne(cascade = CascadeType.ALL)
    private Country country;

    public Province(){

    }

    public Province(String province_name, Set<University> universities, Country country) {
        this.province_name = province_name;
        this.universities = universities;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public Set<University> getUniversities() {
        return universities;
    }

    public void setUniversities(Set<University> universities) {
        this.universities = universities;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
