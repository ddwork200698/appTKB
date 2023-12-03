package com.doubleD.TKB.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tbMonhoc")
public class Monhoc {
    @Id
    @Column(name = "mamonhoc")
    private String maMonhoc;

    private String name;

    @ManyToOne
    @JoinColumn(name = "makhoa", nullable = false, referencedColumnName = "makhoa")
    @JsonBackReference
    private Khoa khoa;

    public Monhoc() {
    }

    public Monhoc(String maMonhoc, String name, Khoa khoa) {
        this.maMonhoc = maMonhoc;
        this.name = name;
        this.khoa = khoa;
    }

    public String getMaMonhoc() {
        return maMonhoc;
    }

    public void setMaMonhoc(String maMonhoc) {
        this.maMonhoc = maMonhoc;
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
