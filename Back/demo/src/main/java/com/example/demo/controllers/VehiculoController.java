package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.VehiculoModel;
import com.example.demo.services.VehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
    VehiculoService vehiculoService;

    @GetMapping()
    public ArrayList<VehiculoModel> obtenerVehiculos(){
        return this.vehiculoService.obtenerVehiculos();
    }

    @PostMapping
    public VehiculoModel guardarVehiculo(VehiculoModel vehiculo){
        return this.vehiculoService.guardarVehiculo(vehiculo);
    }

    @GetMapping(path = "/{id}")
    public Optional<VehiculoModel> obtenerVehiculoPorId(@PathVariable("id") Integer id){
        return this.vehiculoService.obtenerVehiculoPorId(id);
    }

}
