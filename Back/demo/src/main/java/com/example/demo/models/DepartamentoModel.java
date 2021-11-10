package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "departamentos")
public class DepartamentoModel {
    @Id
    @JsonIgnore
    private Long id;

    private String nombre;

    @JsonIgnore
    private Integer codigo;

    @OneToMany(mappedBy = "departamento")
    private Collection<MunicipioModel> municipio;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    
}
