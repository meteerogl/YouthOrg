package com.mete.YouthOrg.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "universities")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uni_id")
    private int uni_id;

    @Column(name = "uni_name")
    private String uni_name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Country uni_country;

    @ManyToOne(cascade = CascadeType.ALL)
    private Province uni_province;



    @OneToMany(mappedBy = "university")
    private Set<User> users;


    public University(){

    }

    public University(String uni_name, Country uni_country, Province uni_province, Set<User> users) {
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

    public Country getUni_country() {
        return uni_country;
    }

    public void setUni_country(Country uni_country) {
        this.uni_country = uni_country;
    }

    public Province getUni_province() {
        return uni_province;
    }

    public void setUni_province(Province uni_province) {
        this.uni_province = uni_province;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
