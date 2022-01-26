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
public class Yate extends Barco{
    protected Double potenciaCV;
    protected Integer numCamarotes;

    public Yate() {
    }

    public Yate(Double potenciaCV, Integer numCamarotes, String matricula, Double eslora, Integer anho) {
        super(matricula, eslora, anho);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + super.toString() + "potenciaCV=" + potenciaCV + ", numCamarotes=" + numCamarotes + '}';
    }
    
    
}
