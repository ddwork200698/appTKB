package com.doubleD.TKB.controllers;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Monhoc;
import com.doubleD.TKB.service.Impl.MonhocServiceImpl;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Monhoc")
public class MonhocController {
    @Autowired
    MonhocServiceImpl monhocService;

    // get All mon hoc:  http://localhost:8080/Monhoc/getAllMonhoc
    @GetMapping("/getAllMonhoc")
    List<Monhoc> getAllMonhoc(){
        return monhocService.findAllMonhoc();
    }

    // lay thong tin http://localhost:8080/Monhoc/
    @GetMapping("/getInfoMonhoc/{maMonhoc}")
    Monhoc getInfoMonhoc(@PathVariable String maMonhoc){
        return monhocService.findInfoMonhoc(maMonhoc);
    }
}
