package com.example.Vraj_project.service;

import com.example.Vraj_project.model.Owner;

import java.util.List;

public interface OwnerService {
    public Owner saveOwner(Owner owner);
    public List<Owner> getAllOwners();
}
