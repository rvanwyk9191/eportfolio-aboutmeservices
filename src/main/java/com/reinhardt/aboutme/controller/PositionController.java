package com.reinhardt.aboutme.controller;

import com.reinhardt.aboutme.dto.Position;
import com.reinhardt.aboutme.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/position")
@CrossOrigin(origins = "http://localhost:3001/**")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping("/getAll")
    public List<Position> getAllPosition(){
        return positionService.getAllPositions();
    }

    @GetMapping("/hello")
    public String returnHello(){
        return "Hello Descriptions";
    }

}
