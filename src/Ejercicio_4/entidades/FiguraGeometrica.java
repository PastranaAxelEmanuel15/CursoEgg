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
public class FiguraGeometrica {
    
    protected String nombre;
    protected Double area;
    protected Double perimetro;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String nombre, Double area, Double perimetro) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
    
}
