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
public class Rectangulo extends FiguraGeometrica{
    
    protected Double base;
    protected Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura, String nombre, Double area, Double perimetro) {
        super(nombre, area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", area=" + area + ", perimetro=" + perimetro + ", base=" + base + ", altura=" + altura + '}';
    }

    
    
    
    
}
