/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra_1.entidades;

/**
 *
 * @author AXEL
 */
public class Velero extends Barco {
    protected Integer numeroDeMastiles;

    public Velero() {
    }

    public Velero(Integer numeroDeMastiles, String matricula, Double eslora, Integer anho) {
        super(matricula, eslora, anho);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public Integer getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(Integer numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + super.toString() + "numeroDeMastiles=" + numeroDeMastiles + '}';
    }
    
    
    
}
