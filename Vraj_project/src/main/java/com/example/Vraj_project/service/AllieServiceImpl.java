package com.example.Vraj_project.service;
import com.example.Vraj_project.repository.AllieRepository;

import com.example.Vraj_project.model.Allie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllieServiceImpl implements AllieService{

    @Autowired
    private AllieRepository allieRepository;
    @Override
    public Allie saveAllie(Allie allie) {
        return allieRepository.save(allie);
    }

    @Override
    public List<Allie> getAllAllies() {
        return allieRepository.findAll();
    }

}