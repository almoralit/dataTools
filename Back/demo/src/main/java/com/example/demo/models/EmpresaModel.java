package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class EmpresaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    private String tipo_doc;
    private String nombre;
    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "empresa")
    private Collection<AfiliacionModel> afiliacion;

    @ManyToOne
    @JoinColumn(name = "id_municipio")
    private MunicipioModel municipio;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTipo_doc() {
        return tipo_doc;
    }
    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
