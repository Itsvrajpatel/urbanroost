package com.example.Vraj_project.service;

import com.example.Vraj_project.model.Secretary;

import java.util.List;

public interface SecretaryService {
    public Secretary saveSecretary(Secretary secretary);
    public List<Secretary> getAllSecretarys();
}
