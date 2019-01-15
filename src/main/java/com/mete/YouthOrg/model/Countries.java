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








}
