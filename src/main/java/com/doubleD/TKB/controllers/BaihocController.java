package com.doubleD.TKB.controllers;

import com.doubleD.TKB.models.Baihoc;
import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.service.impl.BaihocServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Baihoc")
public class BaihocController {
    @Autowired
    BaihocServiceImpl baihocService;


    //link: http://localhost:8080/BaiHoc/getAllBaihoc
    @GetMapping("/getAllBaihoc")
    List<Baihoc> getAllBaihoc(){
        return baihocService.getAllBaihoc();
    }


    // lay thong tin http://localhost:8080/BaiHoc/getInfoBaihoc/A1
    @GetMapping("/getInfoBaihoc/{maBaihoc}")
    Baihoc getInfoBaihoc(@PathVariable String maBaihoc){
        return baihocService.getInfoByMaBaihoc(maBaihoc);
    }
}
