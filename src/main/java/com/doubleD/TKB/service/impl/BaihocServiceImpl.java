package com.doubleD.TKB.service.impl;

import com.doubleD.TKB.models.Baihoc;
import com.doubleD.TKB.repositories.BaihocRepository;
import com.doubleD.TKB.service.BaihocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaihocServiceImpl implements BaihocService {
    @Autowired
    BaihocRepository baihocRepository;
    @Override
    public List<Baihoc> getAllBaihoc() {
        return baihocRepository.findAll();
    }

    @Override
    public Baihoc getInfoByMaBaihoc(String maBaihoc) {
        return baihocRepository.getByMaBaihoc(maBaihoc);
    }

    @Override
    public Baihoc save(Baihoc baihoc) {
        return baihocRepository.save(baihoc);
    }
}
