/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;


import Ejercicio_2.entidades.Electrodomestico;
import Ejercicio_2.entidades.Lavadora;
import Ejercicio_2.entidades.Television;
import Ejercicio_2.servicios.ElecServicios;
import Ejercicio_2.servicios.LavadoraServicio;
import Ejercicio_2.servicios.TvServicios;
import Ejercicio_3.ServiceEj3;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AXEL
 */
public class Ejercicio2Main {

/*
//EJERCICIO 2
    public static void main(String[] args) {
        // TODO code application logic here
        // ElecServicios nuevoService = new ElecServicios();
        LavadoraServicio lavadora1 = new LavadoraServicio();
        TvServicios tel_1 = new TvServicios();
        
        //nuevoService.crearElectrodomestico();
        
        lavadora1.crearLavadora();
        System.out.println("");
        tel_1.crearTelevisor();
        
        System.out.println("\nMOSTRANDO APARATOS CREADOS");
        // nuevoService.mostrarArticulo();    
        lavadora1.mostrarArticulo();
        tel_1.mostrarArticulo();
        
        System.out.println("Precio Final");
        lavadora1.precioFinal();
        lavadora1.mostrarArticulo();
        
        tel_1.precioFinal();
        tel_1.mostrarArticulo();
        
    }
}
*/
  //EJERCICIO 3
    public static void main(String[] args) {
       
        ArrayList<Electrodomestico> equipos = new ArrayList<>();
        ServiceEj3 serEquipos = new ServiceEj3();
        
        Lavadora lav_1 , lav_2;
        Television tv_1 , tv_2;
        
        lav_1 = new Lavadora(19, 1000.00 , "rojo", "A", 30.0);
        equipos.add(lav_1);
        lav_2 = new Lavadora(35, 1000.00 , "gris", "D", 46.5);
        equipos.add(lav_2);
        
        tv_1 = new Television(24.0, false, 1000.0, "negro", "F", 14.5);
        equipos.add(tv_1);
        tv_2 = new Television(18.0, true, 1000.0, "blanco", "B", 3.8);
        equipos.add(tv_2);
        System.out.println("LISTA:");
        serEquipos.mostrarLista(equipos);
        
        System.out.println("---------\n----CALCULANDO----");
        serEquipos.calcularPrecios(equipos);
        System.out.println("----------\n-----LISTA FINAL----");
        serEquipos.mostrarLista(equipos);
        
    }
}
//*/
