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


    public Organizations(){

    }

    public Organizations(String org_name, String org_detail, Set<Users> users) {
        this.org_name = org_name;
        this.org_detail = org_detail;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getOrg_detail() {
        return org_detail;
    }

    public void setOrg_detail(String org_detail) {
        this.org_detail = org_detail;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }
}
