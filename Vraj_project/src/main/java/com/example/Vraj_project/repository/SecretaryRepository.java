package com.example.Vraj_project.repository;
import com.example.Vraj_project.model.Secretary;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretaryRepository extends JpaRepository<Secretary,Integer> {
    Secretary findByUsername(String username);
}
