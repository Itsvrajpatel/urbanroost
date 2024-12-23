package com.example.Vraj_project.controller;
import com.example.Vraj_project.service.AllieService;
import com.example.Vraj_project.model.Allie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allie")
@CrossOrigin
public class AllieController {
    @Autowired
    private AllieService allieService;

    @PostMapping("/add")
    public String add(@RequestBody Allie allie){
        allieService.saveAllie(allie);
        return "New Allie is added";
    }

    @GetMapping("/getAll")
    public List<Allie> list(){
        return allieService.getAllAllies();
    }
}