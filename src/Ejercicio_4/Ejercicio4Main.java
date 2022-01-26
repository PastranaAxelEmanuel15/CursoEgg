/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

import Ejercicio_4.entidades.Circunferencia;
import Ejercicio_4.entidades.Rectangulo;
import Ejercicio_4.servicios.ServicioCircunferencia;
import Ejercicio_4.servicios.ServicioRectangulo;

/**
 *
 * @author AXEL
 */
public class Ejercicio4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRectangulo forma1 = new ServicioRectangulo();
        ServicioCircunferencia forma2 = new ServicioCircunferencia();

        System.out.println("Creando Las Figuras");

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1 = forma1.crearRectangulo();

        Circunferencia circunferencia1 = new Circunferencia();
        circunferencia1 = forma2.crearCircunferencia();

        System.out.println("--------\nMostrando Las Figuras");

        forma1.mostrarRectangulo();

        forma2.mostrarCircunferencia();
    }

}
