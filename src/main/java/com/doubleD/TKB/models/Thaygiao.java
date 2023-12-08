package com.doubleD.TKB.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tbThaygiao")
public class Thaygiao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "makhoa", nullable = false, referencedColumnName = "makhoa")
    @JsonManagedReference
//    @JsonBackReference
    private Khoa khoa;

    public Thaygiao() {
    }

    public Thaygiao(String name) {
        this.name = name;
    }

    public Thaygiao(String name, Khoa khoa) {
        this.name = name;
        this.khoa = khoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }
}
