/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4.entidades;

/**
 *
 * @author AXEL
 */
public class Circunferencia extends FiguraGeometrica {
    protected Double radio;

    public Circunferencia() {
    }

    public Circunferencia(Double radio, String nombre, Double area, Double perimetro) {
        super(nombre, area, perimetro);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + super.nombre + ", area=" + super.area + ", perimetro=" + super.perimetro + ", radio=" + radio + '}';
    }
    
    
    
    
    
}
