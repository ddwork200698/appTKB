package com.doubleD.TKB.service.Impl;

import com.doubleD.TKB.models.Monhoc;
import com.doubleD.TKB.repositories.MonhocRepository;
import com.doubleD.TKB.service.MonhocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonhocServiceImpl implements MonhocService {
    @Autowired
    MonhocRepository monhocRepository;
    @Override
    public List<Monhoc> findAllMonhoc() {
        return monhocRepository.findAll();
    }

    @Override
    public Monhoc findInfoMonhoc(String maMonhoc) {
        return monhocRepository.findByMaMonhoc(maMonhoc);
    }
}
