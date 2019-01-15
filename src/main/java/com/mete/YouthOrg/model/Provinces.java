package com.mete.YouthOrg.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provinces")
public class Provinces {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "province_id")
    private int id;


    @Column(name = "province_name")
    private String province_name;


    @OneToMany(mappedBy = "uni_province")
    private Set<Universities> universities;

    @ManyToOne(cascade = CascadeType.ALL)
    private Countries country;



}
