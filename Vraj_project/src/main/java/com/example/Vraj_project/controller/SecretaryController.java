package com.example.Vraj_project.controller;
import com.example.Vraj_project.model.Secretary;
import com.example.Vraj_project.service.SecretaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secretary")
@CrossOrigin
public class SecretaryController {
    @Autowired
    private SecretaryService secretaryService;

    @PostMapping("/add")
    public String add(@RequestBody Secretary secretary){
        secretaryService.saveSecretary(secretary);
        return "New Secretary is added";
    }

    @GetMapping("/getAll")
    public List<Secretary> list(){
        return secretaryService.getAllSecretarys();
    }
}