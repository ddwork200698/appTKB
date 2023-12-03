package com.doubleD.TKB.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tbKhoa")
public class Khoa {
    @Id
    @Column(name = "makhoa")
    private String maKhoa;
    private String tenKhoa;

    @OneToMany(mappedBy = "khoa", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Monhoc> monhocs;

    public Khoa() {
        this.setMaKhoa("CT");
        this.setTenKhoa("Chinh tri");
    }

    public Khoa(String maKhoa, String tenKhoa, Set<Monhoc> monhocs) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
        this.monhocs = monhocs;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public Set<Monhoc> getMonhocs() {
        return monhocs;
    }

    public void setMonhocs(Set<Monhoc> monhocs) {
        this.monhocs = monhocs;
    }
}
