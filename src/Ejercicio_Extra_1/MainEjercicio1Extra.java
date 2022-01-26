/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra_1;

import Ejercicio_Extra_1.Servicios.ServicioAlquiler;

/**
 *
 * @author AXEL
 */
public class MainEjercicio1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlquiler nuevoAlq = new ServicioAlquiler();
        System.out.println("---------\nCreando Alquiler");
        nuevoAlq.crearAlquiler();
        System.out.println("---------\nMostando Alquiler");
        nuevoAlq.mostrarAlquiler();
    }
    
}
