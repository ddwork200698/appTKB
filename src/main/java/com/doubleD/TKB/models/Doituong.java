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
}

