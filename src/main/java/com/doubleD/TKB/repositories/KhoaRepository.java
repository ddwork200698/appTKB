package com.doubleD.TKB.repositories;

import com.doubleD.TKB.models.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhoaRepository extends JpaRepository <Khoa, String> {
    Khoa getByMaKhoa(String maKhoa);
}
