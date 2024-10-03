package com.example.Vraj_project.repository;
import com.example.Vraj_project.model.Allie;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllieRepository extends JpaRepository<Allie,Integer> {

    Allie findByUsername(String username);
}
