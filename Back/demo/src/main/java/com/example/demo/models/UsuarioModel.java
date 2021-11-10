package com.example.demo.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    
    private String tipo_doc;
    private Integer documento;
    private String nombre_completo;
    private String direccion;
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "id_municipio")
    private MunicipioModel municipio;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RolModel rol;

    @ManyToMany
    @JoinTable(
        name = "conductor",
        joinColumns = @JoinColumn(name = "id_usuario"),
        inverseJoinColumns = @JoinColumn(name = "id_vehiculo")
    )
    private Collection<VehiculoModel> vehiculo;

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
    public Integer getDocumento() {
        return documento;
    }
    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    public String getNombre_completo() {
        return nombre_completo;
    }
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
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
    public MunicipioModel getMunicipio() {
        return municipio;
    }
    public void setMunicipio(MunicipioModel municipio) {
        this.municipio = municipio;
    }
    public RolModel getRol() {
        return rol;
    }
    public void setRol(RolModel rol) {
        this.rol = rol;
    }
    
}
