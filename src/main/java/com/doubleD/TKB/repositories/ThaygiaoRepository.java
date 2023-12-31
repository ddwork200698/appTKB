package com.doubleD.TKB.repositories;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Thaygiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface ThaygiaoRepository extends JpaRepository<Thaygiao, Long> {
    Thaygiao save (Thaygiao thaygiao);

}
