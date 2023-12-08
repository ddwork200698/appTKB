package com.doubleD.TKB.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "tbBaihoc")
public class Baihoc {
    @Id
    @Column(name = "mabaihoc")
    private String maBaihoc;

    private String tenBaihoc;
    private int doUutien;
    private String ghiChu;
    private String loaiBaihoc;
    @ManyToOne
    @JoinColumn(name = "mamonhoc", nullable = false, referencedColumnName = "mamonhoc")
    @JsonManagedReference
//    @JsonBackReference
    private Monhoc monhoc;

    public Baihoc() {
    }

    public Baihoc(String maBaihoc, String tenBaihoc, int doUutien, String ghiChu, Monhoc monhoc, String loaiBaihoc) {
        this.maBaihoc = maBaihoc;
        this.tenBaihoc = tenBaihoc;
        this.doUutien = doUutien;
        this.ghiChu = ghiChu;
        this.monhoc = monhoc;
        this.loaiBaihoc = loaiBaihoc;
    }

    public String getMaBaihoc() {
        return maBaihoc;
    }

    public void setMaBaihoc(String maBaihoc) {
        this.maBaihoc = maBaihoc;
    }

    public String getTenBaihoc() {
        return tenBaihoc;
    }

    public void setTenBaihoc(String tenBaihoc) {
        this.tenBaihoc = tenBaihoc;
    }

    public int getDoUutien() {
        return doUutien;
    }

    public void setDoUutien(int doUutien) {
        this.doUutien = doUutien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Monhoc getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(Monhoc monhoc) {
        this.monhoc = monhoc;
    }

    public String getLoaiBaihoc() {
        return loaiBaihoc;
    }

    public void setLoaiBaihoc(String loaiBaihoc) {
        this.loaiBaihoc = loaiBaihoc;
    }
}
