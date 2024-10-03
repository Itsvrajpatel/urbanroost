package com.example.Vraj_project.controller;
import com.example.Vraj_project.service.OwnerService;
import com.example.Vraj_project.model.Owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
@CrossOrigin
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @PostMapping("/add")
    public String add(@RequestBody Owner owner){
        ownerService.saveOwner(owner);
        return "New Owner is added";
    }

    @GetMapping("/getAll")
    public List<Owner> list(){
        return ownerService.getAllOwners();
    }
}