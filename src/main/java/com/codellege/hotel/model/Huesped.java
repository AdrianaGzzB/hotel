package com.codellege.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Huesped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHuesped;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String nacionalidad;
    private Integer telefono;

    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public Integer getIdHuesped(){
        return idHuesped;
    }
    public void setIdHuesped(Integer idHuesped){
        this.idHuesped= Integer.valueOf(idHuesped);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

}
