package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "afiliacion")
public class AfiliacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    private Date fecha_afiliacion;
    private Date fecha_desafiliacion;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private EmpresaModel empresa;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private VehiculoModel vehiculo;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getFecha_afiliacion() {
        return fecha_afiliacion;
    }
    public void setFecha_afiliacion(Date fecha_afiliacion) {
        this.fecha_afiliacion = fecha_afiliacion;
    }
    public Date getFecha_desafiliacion() {
        return fecha_desafiliacion;
    }
    public void setFecha_desafiliacion(Date fecha_desafiliacion) {
        this.fecha_desafiliacion = fecha_desafiliacion;
    }

    
}
