package com.doubleD.TKB.repositories;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Monhoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonhocRepository extends JpaRepository<Monhoc, String> {
    List<Monhoc> findAll();
    Monhoc findByMaMonhoc(String maMonhoc);
    List<Monhoc> findByKhoa(Khoa khoa);
}
