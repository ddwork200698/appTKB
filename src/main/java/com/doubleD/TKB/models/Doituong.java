package com.doubleD.TKB.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tbDoituong")
public class Doituong {
    @Id
    @Column(name = "madoituong")
    private String maDoituong;
    private String name;
    @OneToMany(mappedBy = "doituong", cascade = CascadeType.ALL)
    @JsonBackReference
//    @JsonManagedReference
    private Set<Monhoc> monhocs;
    public Doituong() {
    }
    public Doituong(String maDoituong, String name) {
        this.maDoituong = maDoituong;
        this.name = name;
    }

    public String getMaDoituong() {
        return maDoituong;
    }

    public void setMaDoituong(String maDoituong) {
        this.maDoituong = maDoituong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Monhoc> getMonhocs() {
        return monhocs;
    }

    public void setMonhocs(Set<Monhoc> monhocs) {
        this.monhocs = monhocs;
    }
}

