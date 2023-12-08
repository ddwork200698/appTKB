package com.doubleD.TKB.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    // một khoa có nhiều môn học
    // mappedBy = "tên của biến khoa mà để trong môn học"
    // JsonManagedReference => tạo lên kết sang
    @OneToMany(mappedBy = "khoa", cascade = CascadeType.ALL)
    @JsonBackReference
//    @JsonManagedReference
    private Set<Monhoc> monhocs;

    @OneToMany(mappedBy = "khoa", cascade = CascadeType.ALL)
    @JsonBackReference
//    @JsonManagedReference
    private Set<Thaygiao> thaygiaos;

    public Khoa() {
        this.setMaKhoa("CT");
        this.setTenKhoa("Chinh tri");
    }

    public Khoa(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
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

    public Set<Thaygiao> getThaygiaos() {
        return thaygiaos;
    }

    public void setThaygiaos(Set<Thaygiao> thaygiaos) {
        this.thaygiaos = thaygiaos;
    }
}
