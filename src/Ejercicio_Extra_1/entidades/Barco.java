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
public class Barco {
    protected String matricula;
    protected Double eslora;
    protected Integer anho; // año de Fabricacion 

    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer anho) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anho = anho;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnho() {
        return anho;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anho=" + anho + '}';
    }
    
    
    
    
}


