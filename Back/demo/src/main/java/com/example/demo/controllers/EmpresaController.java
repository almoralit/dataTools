package com.example.demo.controllers;

import java.util.ArrayList;

import com.example.demo.models.EmpresaModel;
import com.example.demo.services.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/empresas") // Va a indicar la dirección del servidor en la que se va a activar la clase

public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @GetMapping()
    public ArrayList<EmpresaModel> obtenerEmpresas(){
        return empresaService.obtenerEmpresas();
    }

    @PostMapping
    public EmpresaModel guardarEmpresa(@RequestBody EmpresaModel empresa){
        return this.empresaService.guardarEmpresa(empresa);
    }
}
