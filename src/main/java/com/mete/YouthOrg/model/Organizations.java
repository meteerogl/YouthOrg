package com.mete.YouthOrg.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "organizations")
public class Organizations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "org_id")
    private int id;


    @Column(name = "org_name")
    private String org_name;

    @Column(name = "org_detail")
    private String org_detail;

    @OneToMany(mappedBy = "organization")
    private Set<Users> users;




}
