package com.example.Vraj_project.repository;

import com.example.Vraj_project.model.Secretary;
import com.example.Vraj_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findUserByEmail(String email);

}