/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra_1.entidades;

import java.util.Date;

/**
 *
 * @author AXEL
 */
public class AlquilerBarco {
    protected String nombre;
    protected Integer documento;
    protected Date fechaDeAlquiler;
    protected Date fechaDeDevolucion;
    protected Integer posicionAmarre;
    protected Barco barco;
    protected Double PrecioAPagar; 

    public AlquilerBarco() {
    }

    public AlquilerBarco(String nombre, Integer documento, Date fechaDeAlquiler, Date fechaDeDevolucion, Integer posicionAmarre, Barco barco, Double PrecioAPagar) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.PrecioAPagar = PrecioAPagar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Date getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(Date fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public Date getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(Date fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Double getPrecioAPagar() {
        return PrecioAPagar;
    }

    public void setPrecioAPagar(Double PrecioAPagar) {
        this.PrecioAPagar = PrecioAPagar;
    }

    @Override
    public String toString() {
        return "AlquilerBarco{" + "nombre=" + nombre + ", documento=" + documento + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevolucion=" + fechaDeDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco.toString() + ", PrecioAPagar=" + PrecioAPagar + '}';
    }
    
    
}
