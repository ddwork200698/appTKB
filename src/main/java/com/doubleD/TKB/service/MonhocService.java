package com.doubleD.TKB.service;

import com.doubleD.TKB.models.Monhoc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MonhocService {
    List<Monhoc> findAllMonhoc();
    Monhoc findInfoMonhoc(String maMonhoc);
}
