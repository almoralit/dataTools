package com.example.demo.repositories;

import com.example.demo.models.AfiliacionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliacionRepository extends CrudRepository<AfiliacionModel, Integer>{
    
}
