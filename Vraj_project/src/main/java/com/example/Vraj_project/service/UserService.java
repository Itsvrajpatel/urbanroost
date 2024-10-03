package com.example.Vraj_project.service;

import com.example.Vraj_project.model.Secretary;
import com.example.Vraj_project.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User saveUser(User user);
    public List<User> getAllUsers();
    public User findUserByEmail(String email);
    public void deleteUserById(int id);
    public Optional<User> findUserById(int id);
    public User editUser(User user, int id);


}