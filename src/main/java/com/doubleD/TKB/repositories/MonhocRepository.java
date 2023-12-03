package com.doubleD.TKB.repositories;

import com.doubleD.TKB.models.Monhoc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonhocRepository extends JpaRepository<Monhoc, String> {
    @Override
    List<Monhoc> findAll();
}
