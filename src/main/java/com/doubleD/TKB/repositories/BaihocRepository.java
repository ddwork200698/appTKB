package com.doubleD.TKB.repositories;

import com.doubleD.TKB.models.Baihoc;
import com.doubleD.TKB.models.Monhoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaihocRepository extends JpaRepository<Baihoc, String> {
    List<Baihoc> findAll();
    Baihoc getByMaBaihoc(String maBaihoc);
}
