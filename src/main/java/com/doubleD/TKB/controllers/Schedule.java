package com.doubleD.TKB.controllers;

import com.doubleD.TKB.models.Khoa;
import com.doubleD.TKB.models.Thaygiao;
import com.doubleD.TKB.service.impl.ThaygiaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/Schedule")
public class Schedule {
    @Autowired
    ThaygiaoServiceImpl thaygiaoService;
    @Autowired
    com.doubleD.TKB.service.Impl.MonhocServiceImpl monhocService;


}
