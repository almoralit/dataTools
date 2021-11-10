package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.VehiculoModel;
import com.example.demo.repositories.VehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {
    @Autowired
    VehiculoRepository vehiculoRepository;

    public ArrayList<VehiculoModel> obtenerVehiculos(){
        return (ArrayList<VehiculoModel>) vehiculoRepository.findAll();
    }

    public Optional<VehiculoModel> obtenerVehiculoPorId(Integer id){
        return this.vehiculoRepository.findById(id);
    }

    public VehiculoModel guardarVehiculo(VehiculoModel vehiculo){
        return this.vehiculoRepository.save(vehiculo);
    }

    public boolean eliminarVehiculo(Integer id){
        try {
            this.vehiculoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
