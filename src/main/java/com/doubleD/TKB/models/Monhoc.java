package com.doubleD.TKB.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "tbMonhoc")
public class Monhoc {
    @Id
    @Column(name = "mamonhoc")
    private String maMonhoc;

    private String tenMonhoc;

    // nhiều môn học trong 1 khoa
    // tenMonhoc = "tên của biến mà lấy làm khóa phụ"
    // JsonBackReference => tạo lên kết sang

    @ManyToOne
    @JoinColumn(name = "makhoa", nullable = false, referencedColumnName = "makhoa")
    @JsonManagedReference
//    @JsonBackReference
    private Khoa khoa;

    public Monhoc() {
    }

    public Monhoc(String maMonhoc, String tenMonhoc, Khoa khoa) {
        this.maMonhoc = maMonhoc;
        this.tenMonhoc = tenMonhoc;
        this.khoa = khoa;
    }
    public String getMaMonhoc() {
        return maMonhoc;
    }

    public void setMaMonhoc(String maMonhoc) {
        this.maMonhoc = maMonhoc;
    }

    public String getTenMonhoc() {
        return tenMonhoc;
    }

    public void setTenMonhoc(String tenMonhoc) {
        this.tenMonhoc = tenMonhoc;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }
}
