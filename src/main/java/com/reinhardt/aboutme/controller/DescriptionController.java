package com.reinhardt.aboutme.controller;

import com.reinhardt.aboutme.dto.Description;
import com.reinhardt.aboutme.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/description")
public class DescriptionController {

    @Autowired
    private DescriptionService descriptionService;

    @GetMapping("/getAll")
    public List<Description> getAllDescriptions(){
        return descriptionService.getAllDescriptions();
    }

    @GetMapping("/hello")
    public String returnHello(){
        return "Hello Descriptions";
    }

}
