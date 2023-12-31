/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GranHotel_Entidades;

/**
 *
 * @author Usuario
 */
public class Huesped {
    
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private String correo;
    private int celular;
    private boolean activo;

    public Huesped() {
    }

    public Huesped(int dni, String apellido, String nombre, String domicilio, String correo, int celular, boolean activo) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.activo = activo;
    }
 

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " - " + dni;
    }
    
    
    
    
}

    

