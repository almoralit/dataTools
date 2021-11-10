package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.AfiliacionModel;
import com.example.demo.repositories.AfiliacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AfiliacionService{
    @Autowired
    AfiliacionRepository afiliacionRepository;

    public ArrayList<AfiliacionModel> obtenerAfiliaciones(){
        return (ArrayList<AfiliacionModel>)afiliacionRepository.findAll();
    }

    public AfiliacionModel afiliarVehiculo(AfiliacionModel afiliacion){
        return afiliacionRepository.save(afiliacion);
    }

    public boolean desafiliarVehiculo(Integer id){
        try {
            afiliacionRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}