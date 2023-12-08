package com.doubleD.TKB.service.impl;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Thaygiao;
import com.doubleD.TKB.repositories.ThaygiaoRepository;
import com.doubleD.TKB.service.ThaygiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ThaygiaoServiceImpl implements ThaygiaoService {
    @Autowired
    ThaygiaoRepository thaygiaoRepository;
    @Override
    public List<Thaygiao> getAllThaygiao() {
        return thaygiaoRepository.findAll();
    }

    @Override
    public Optional<Thaygiao> getInfoThaygiao(Long id) {
        return thaygiaoRepository.findById(id);
    }

    @Override
    public Thaygiao save(Thaygiao thaygiao) {
        return thaygiaoRepository.save(thaygiao);
    }

}
