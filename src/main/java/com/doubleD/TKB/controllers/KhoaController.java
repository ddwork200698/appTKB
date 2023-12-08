package com.doubleD.TKB.controllers;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.service.Impl.KhoaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/khoa")
public class KhoaController {
    @Autowired
    KhoaServiceImpl khoaServiceImpl;

    @GetMapping("/getAllKhoa")
    List<Khoa> getAllKhoa(){
        return khoaServiceImpl.getAllKhoa();
    }

    // lay thong tin http://localhost:8080/khoas/getInfoKhoa/CT
    @GetMapping("/getInfoKhoa/{maKhoa}")
    Khoa getInfoKhoa(@PathVariable String maKhoa){
        return khoaServiceImpl.getKhoaByMaKhoa(maKhoa);
    }
}
