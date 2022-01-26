/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2.entidades;

/**
 *
 * @author AXEL
 */
public class Television extends Electrodomestico{
    protected Double resolucion;
    protected Boolean sintonizadorTdt;

    public Television() {
    }

    public Television(Double resolucion, Boolean sintonizadorTdt, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(Boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    @Override
    public String toString() {
        return "Television{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", resolucion=" + resolucion + ", sintonizadorTdt=" + sintonizadorTdt + '}';
    }

    
    
    
    
}
