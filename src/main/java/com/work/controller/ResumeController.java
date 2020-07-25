package com.work.controller;

import com.work.model.ResumeFormDTO;
import com.work.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/resume/create")
    public void create(ResumeFormDTO resumeFormDTO, HttpServletResponse response) {
        resumeService.create(resumeFormDTO, response);
//        return "success";
    }

    @GetMapping("/resume/get")
    public String create() {

        return "resume";
    }
}
