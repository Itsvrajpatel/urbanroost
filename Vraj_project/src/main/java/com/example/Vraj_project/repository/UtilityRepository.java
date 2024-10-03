package com.example.Vraj_project.repository;

import com.example.Vraj_project.model.Utility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilityRepository extends JpaRepository<Utility,Integer> {
}
