package com.example.demo.repositories;

import com.example.demo.models.RolModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<RolModel, Integer>{
    
}
