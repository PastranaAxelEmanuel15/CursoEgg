/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra_1.Servicios;

import Ejercicio_Extra_1.entidades.Barco;
import Ejercicio_Extra_1.entidades.BarcoAMotor;
import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class ServicioBarcoaMotor {
    private Scanner SC = new Scanner(System.in);
    private ServicioBarco servBarco = new ServicioBarco();
    private BarcoAMotor bam = new BarcoAMotor();

    public ServicioBarcoaMotor() {
    }
    
    
    public BarcoAMotor crearBaM(){
        Barco barc = new BarcoAMotor();
        
        barc = servBarco.crearBarco();
        
        System.out.println("Ingrese Potencia en CV");
        bam.setPotenciaCV(SC.nextDouble());
        
        bam.setAnho(barc.getAnho());
        bam.setEslora(barc.getEslora());
        bam.setMatricula(barc.getMatricula());
        
        return bam;
    }
     public Double modulo(){
        Double factor;
        factor = (bam.getEslora()*10)+bam.getPotenciaCV();
        
        return factor;
    }
}
