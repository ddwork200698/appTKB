package com.doubleD.TKB.repositories;

import com.doubleD.TKB.models.Doituong;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoituongRepository extends JpaRepository<Doituong, String> {
    List<Doituong> findAll();
}
