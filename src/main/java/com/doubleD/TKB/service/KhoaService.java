package com.doubleD.TKB.service;

import com.doubleD.TKB.models.Khoa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhoaService {
    List<Khoa> getAllKhoa();
    Khoa getKhoaByMaKhoa(String maKhoa);
    Khoa saveKhoa(Khoa khoa);
}
