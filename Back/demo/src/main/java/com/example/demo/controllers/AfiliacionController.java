package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.AfiliacionModel;
import com.example.demo.services.AfiliacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/afiliacion")
public class AfiliacionController {
    @Autowired
    AfiliacionService afiliacionService;

    @GetMapping()
    public ArrayList<AfiliacionModel> obtenerAfiliaciones(){
        return afiliacionService.obtenerAfiliaciones();
    }

    @PostMapping()
    public AfiliacionModel afiliarVehiculo(AfiliacionModel afiliacion){
        return afiliacionService.afiliarVehiculo(afiliacion);
    }

    @DeleteMapping(path = "/{id}")
    public String desafiliarVehiculoPorId(@PathVariable("id") Integer id){
        boolean ok = afiliacionService.desafiliarVehiculo(id);
        if( ok ){
            return "Vehiculo desafiliado";
        }else{
            return "Error desafiliando vehiculo";
        }
    }
}
