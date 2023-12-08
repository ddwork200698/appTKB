package com.doubleD.TKB.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tbThaygiao")
public class Thaygiao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Set<Baihoc> baihocs;
    private Khoa khoa;


}
