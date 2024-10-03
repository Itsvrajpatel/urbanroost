package com.example.Vraj_project.repository;
import com.example.Vraj_project.model.Property;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Integer> {

}
