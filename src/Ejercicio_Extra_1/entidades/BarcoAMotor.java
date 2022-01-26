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
public class BarcoAMotor extends Barco{
    protected Double potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(Double potenciaCV, String matricula, Double eslora, Integer anho) {
        super(matricula, eslora, anho);
        this.potenciaCV = potenciaCV;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" + super.toString() + "potenciaCV=" + potenciaCV + '}';
    }
    
    
}
