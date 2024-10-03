package com.example.Vraj_project.service;

import com.example.Vraj_project.model.Utility;

import java.util.List;

public interface UtilityService {
    public Utility saveUtility(Utility utility);
    public List<Utility> getAllUtilitys();
}
