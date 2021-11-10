package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rol")
public class RolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer id;
    
    private String nombre_rol;
    
    @JsonIgnore
    private String descripcion_rol;

    @OneToMany(mappedBy = "rol")
    private Collection<UsuarioModel> usuario;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre_rol() {
        return nombre_rol;
    }
    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
    public String getDescripcion_rol() {
        return descripcion_rol;
    }
    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }

    
}
