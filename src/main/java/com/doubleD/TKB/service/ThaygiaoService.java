package com.doubleD.TKB.service;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Thaygiao;
import com.doubleD.TKB.service.impl.ThaygiaoServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public interface ThaygiaoService {
    List<Thaygiao> getAllThaygiao();
    Optional<Thaygiao> getInfoThaygiao(Long id);
    Thaygiao save(Thaygiao thaygiao);
    Set<Thaygiao> getAllThaygiaoByKhoa(String makhoa);
}
