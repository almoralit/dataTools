package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.RolModel;
import com.example.demo.repositories.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService{
    @Autowired
    RolRepository rolRepository;

    public ArrayList<RolModel> obtenerRoles(){
        return (ArrayList<RolModel>) rolRepository.findAll();
    }

    public RolModel guardarUsuario(RolModel rol){
        return rolRepository.save(rol); 
    }

    public boolean eliminarRol(Integer id){
        try {
            rolRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}