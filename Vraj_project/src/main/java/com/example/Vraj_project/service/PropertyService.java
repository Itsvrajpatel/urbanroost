package com.example.Vraj_project.service;

import com.example.Vraj_project.model.Property;

import java.util.List;

public interface PropertyService {
    public Property saveProperty(Property property);
    public List<Property> getAllProperties();
}
