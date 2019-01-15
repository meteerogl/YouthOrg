package com.mete.YouthOrg.model;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "universities")
public class Universities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uni_id")
    private int uni_id;

    @Column(name = "uni_name")
    private String uni_name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Countries uni_country;

    @ManyToOne(cascade = CascadeType.ALL)
    private Provinces uni_province;



    @OneToMany(mappedBy = "university")
    private Set<Users> users;


}
