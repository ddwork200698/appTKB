package com.doubleD.TKB.controllers;

import com.doubleD.TKB.models.Thaygiao;
import com.doubleD.TKB.service.impl.ThaygiaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Thaygiao")
public class ThaygiaoController {
    @Autowired
    ThaygiaoServiceImpl thaygiaoService;

    @GetMapping("/getAllThaygiao")
    List<Thaygiao> getAllThaygiao(){
        return thaygiaoService.getAllThaygiao();
    }

    // lay thong tin http://localhost:8080/Monhoc/
}
