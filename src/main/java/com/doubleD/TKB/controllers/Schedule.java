package com.doubleD.TKB.controllers;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Thaygiao;
import com.doubleD.TKB.repositories.ThaygiaoRepository;
import com.doubleD.TKB.service.impl.ThaygiaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/Schedule")
public class Schedule {
    @Autowired
    ThaygiaoServiceImpl thaygiaoService;
    @Autowired
    ThaygiaoRepository thaygiaoRepository;
    @Autowired
    com.doubleD.TKB.service.Impl.MonhocServiceImpl monhocService;


    @GetMapping("tg")
    Set<Thaygiao> getInforThaygiao(){
//        return thaygiaoRepository.getInfoByName("Nguyễn Văn A");
        Set<Thaygiao> dsTG = thaygiaoRepository.getInfoByName("CT");
        return dsTG;
    };
}
