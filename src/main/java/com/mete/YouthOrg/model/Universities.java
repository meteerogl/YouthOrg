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


    public Universities(){

    }

    public Universities(String uni_name, Countries uni_country, Provinces uni_province, Set<Users> users) {
        this.uni_name = uni_name;
        this.uni_country = uni_country;
        this.uni_province = uni_province;
        this.users = users;
    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }

    public String getUni_name() {
        return uni_name;
    }

    public void setUni_name(String uni_name) {
        this.uni_name = uni_name;
    }

    public Countries getUni_country() {
        return uni_country;
    }

    public void setUni_country(Countries uni_country) {
        this.uni_country = uni_country;
    }

    public Provinces getUni_province() {
        return uni_province;
    }

    public void setUni_province(Provinces uni_province) {
        this.uni_province = uni_province;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }
}
