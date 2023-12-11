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
}
