package com.example.Vraj_project.controller;

import com.example.Vraj_project.model.Utility;
import com.example.Vraj_project.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utility")
@CrossOrigin
public class UtilityController{

    @Autowired
    private UtilityService utilityService;

    @PostMapping("/add")
    public String add(@RequestBody Utility utility){
        System.out.println("Hiiiiiiiiiiiiiiiiiiiii");
        utilityService.saveUtility(utility);
        return "New Utility is added";
    }

    @GetMapping("/getAll")
    public List<Utility> list(){
        return utilityService.getAllUtilitys();
    }
}

