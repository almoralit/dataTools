package com.example.demo.models;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class VehiculoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    private String motor;
    private String placa;
    private String chasis;
    private Date fecha_matricula;
    private Integer modelo;
    private Integer pasajeros_sentados;
    private Integer pasajeros_de_pie;
    private Integer peso_bruto;
    private Integer peso_seco;
    private Integer puertas;
    private String marca;
    private String linea;

    @ManyToMany(mappedBy = "vehiculo")
    private Collection<UsuarioModel> usuario;

    @OneToMany(mappedBy = "vehiculo")
    private Collection<AfiliacionModel> afiliacion;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getChasis() {
        return chasis;
    }
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    public Date getFecha_matricula() {
        return fecha_matricula;
    }
    public void setFecha_matricula(Date fecha_matricula) {
        this.fecha_matricula = fecha_matricula;
    }
    public Integer getModelo() {
        return modelo;
    }
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
    public Integer getPasajeros_sentados() {
        return pasajeros_sentados;
    }
    public void setPasajeros_sentados(Integer pasajeros_sentados) {
        this.pasajeros_sentados = pasajeros_sentados;
    }
    public Integer getPasajeros_de_pie() {
        return pasajeros_de_pie;
    }
    public void setPasajeros_de_pie(Integer pasajeros_de_pie) {
        this.pasajeros_de_pie = pasajeros_de_pie;
    }
    public Integer getPeso_bruto() {
        return peso_bruto;
    }
    public void setPeso_bruto(Integer peso_bruto) {
        this.peso_bruto = peso_bruto;
    }
    public Integer getPeso_seco() {
        return peso_seco;
    }
    public void setPeso_seco(Integer peso_seco) {
        this.peso_seco = peso_seco;
    }
    public Integer getPuertas() {
        return puertas;
    }
    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getLinea() {
        return linea;
    }
    public void setLinea(String linea) {
        this.linea = linea;
    }

    
}
