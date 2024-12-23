package com.example.Vraj_project.service;
import com.example.Vraj_project.repository.BrokerRepository;

import com.example.Vraj_project.model.Broker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrokerServiceImpl implements BrokerService{

    @Autowired
    private BrokerRepository brokerRepository;
    @Override
    public Broker saveBroker(Broker broker) {
        return brokerRepository.save(broker);
    }

    @Override
    public List<Broker> getAllBrokers() {
        return brokerRepository.findAll();
    }

}