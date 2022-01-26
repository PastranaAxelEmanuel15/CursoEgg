/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra_1.Servicios;

import Ejercicio_Extra_1.entidades.Barco;
import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class ServicioBarco {
    private final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    protected Barco bc = new Barco();
    
    public Barco crearBarco(){
        
        
        System.out.println("Ingrese la Matricula del Barco");
        bc.setMatricula(SC.next());
        
        System.out.println("Ingrese El año de Fabricacion del Barco:");
        bc.setAnho(SC.nextInt());
        
        System.out.println("Ingrese la eslora del Barco:");
        bc.setEslora(SC.nextDouble());
        
        return bc;
    }
    
    public Double modulo(){
        Double factor;
        
        factor = (bc.getEslora()*10);
        
        return factor;
    }
}
