package com.doubleD.TKB.service;

import com.doubleD.TKB.models.Baihoc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaihocService {
    List<Baihoc> getAllBaihoc();
    Baihoc getInfoByMaBaihoc(String maBaihoc);
    Baihoc save(Baihoc baihoc);
}
