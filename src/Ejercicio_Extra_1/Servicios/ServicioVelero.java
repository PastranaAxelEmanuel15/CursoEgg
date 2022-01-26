/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra_1.Servicios;

import Ejercicio_Extra_1.entidades.Barco;
import Ejercicio_Extra_1.entidades.Velero;
import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class ServicioVelero {
    private Scanner SC = new Scanner(System.in);
    private ServicioBarco servBarco = new ServicioBarco();
    private Velero vel = new Velero();

    public ServicioVelero() {
    }
    
    
    public Velero crearVelero(){
        Barco velero = new Velero();
        
        velero = servBarco.crearBarco();
        
        System.out.println("Ingrese numero de Mastiles");
        vel.setNumeroDeMastiles(SC.nextInt());
        
        vel.setAnho(velero.getAnho());
        vel.setEslora(velero.getEslora());
        vel.setMatricula(velero.getMatricula());
        
        return vel;
    }
    
    public Double modulo(){
        Double factor;
        factor = (vel.getEslora()*10)+vel.getNumeroDeMastiles();
        
        return factor;
    }
}
