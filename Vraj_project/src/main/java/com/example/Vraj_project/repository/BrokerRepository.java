package com.example.Vraj_project.repository;
import com.example.Vraj_project.model.Broker;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrokerRepository extends JpaRepository<Broker,Integer> {
    Broker findByUsername(String username);
}
