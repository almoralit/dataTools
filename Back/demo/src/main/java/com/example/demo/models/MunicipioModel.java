package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "municipios")
public class MunicipioModel {
    @Id
    @JsonIgnore
    private Long id;

    @JsonIgnore
    private Integer codigo;
    
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private DepartamentoModel departamento;

    @OneToMany(mappedBy = "municipio")
    private Collection<UsuarioModel> usuario;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public DepartamentoModel getDepartamento() {
        return departamento;
    }
    public void setDepartamento(DepartamentoModel departamento) {
        this.departamento = departamento;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
