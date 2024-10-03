package com.example.Vraj_project.repository;

import com.example.Vraj_project.model.Owner;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Integer> {

    Owner findByUsername(String username);
}
