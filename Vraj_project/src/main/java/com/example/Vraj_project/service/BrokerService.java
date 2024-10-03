package com.example.Vraj_project.service;

import com.example.Vraj_project.model.Broker;

import java.util.List;

public interface BrokerService {
    public Broker saveBroker(Broker broker);
    public List<Broker> getAllBrokers();
}
