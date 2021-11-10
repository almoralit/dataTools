package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.EmpresaModel;
import com.example.demo.repositories.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public EmpresaModel guardarEmpresa(EmpresaModel empresa){
        return empresaRepository.save(empresa); 
    }

    public ArrayList<EmpresaModel> obtenerEmpresas(){
        return (ArrayList<EmpresaModel>) empresaRepository.findAll();
    }
}
