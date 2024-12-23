package com.example.Vraj_project.controller;
import com.example.Vraj_project.service.BrokerService;
import com.example.Vraj_project.model.Broker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/broker")
@CrossOrigin
public class BrokerController {
    @Autowired
    private BrokerService brokerService;

    @PostMapping("/add")
    public String add(@RequestBody Broker broker){
        brokerService.saveBroker(broker);
        return "New Broker is added";
    }

    @GetMapping("/getAll")
    public List<Broker> list(){
        return brokerService.getAllBrokers();
    }
}