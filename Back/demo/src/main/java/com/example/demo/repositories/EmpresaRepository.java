package com.example.demo.repositories;

import com.example.demo.models.EmpresaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaModel, Integer> {
    
}
