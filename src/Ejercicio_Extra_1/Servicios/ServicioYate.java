/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra_1.Servicios;

import Ejercicio_Extra_1.entidades.Barco;
import Ejercicio_Extra_1.entidades.Yate;
import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class ServicioYate {
    private Scanner SC = new Scanner(System.in);
    private ServicioBarco servBarco = new ServicioBarco();
    private Yate yate = new Yate();
    
    
    public Yate crearYate(){
        Barco yateero = new Yate();
        
        yateero = servBarco.crearBarco();
        
        System.out.println("Ingrese numero de Camarotes");
        yate.setNumCamarotes(SC.nextInt());
        
        System.out.println("Ingrese Potencia en CV");
        yate.setPotenciaCV(SC.nextDouble());
        
        yate.setAnho(yateero.getAnho());
        yate.setEslora(yateero.getEslora());
        yate.setMatricula(yateero.getMatricula());
        
        return yate;
    }
     public Double modulo(){
        Double factor;
        factor = (yate.getEslora()*10)+ yate.getPotenciaCV()+ yate.getNumCamarotes();
        
        return factor;
    }
}
