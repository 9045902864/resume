package com.work.controller;

import com.work.model.Day;
import com.work.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WorkController {

    @Autowired
    private WorkService workService;

    @GetMapping("/index")
    public String get(){
        return "index";
    }

    @PostMapping("/save")
    public String save(Day day){
        this.workService.store(day);
        return "index";
    }
}
