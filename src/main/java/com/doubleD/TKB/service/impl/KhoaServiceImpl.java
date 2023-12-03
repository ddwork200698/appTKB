package com.doubleD.TKB.service.Impl;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.repositories.KhoaRepository;
import com.doubleD.TKB.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhoaServiceImpl implements KhoaService {

    @Autowired
    KhoaRepository khoaRepository;


    @Override
    public List<Khoa> getAllKhoa() {
        return khoaRepository.findAll();
    }

    @Override
    public Khoa getKhoaByMaKhoa(String maKhoa) {
        return khoaRepository.getByMaKhoa(maKhoa);
    }

    @Override
    public Khoa saveKhoa(Khoa khoa) {
        return khoaRepository.save(khoa);
    }
}
