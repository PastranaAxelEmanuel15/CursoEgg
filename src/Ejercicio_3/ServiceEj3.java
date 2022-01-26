/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

import Ejercicio_2.entidades.Electrodomestico;
import Ejercicio_2.entidades.Lavadora;
import Ejercicio_2.entidades.Television;
import Ejercicio_2.servicios.ElecServicios;
import Ejercicio_2.servicios.LavadoraServicio;
import Ejercicio_2.servicios.TvServicios;
import java.util.ArrayList;

/**
 *
 * @author AXEL
 */
public class ServiceEj3 {

    private ElecServicios serElec = new ElecServicios();
    private LavadoraServicio serLav = new LavadoraServicio();
    private TvServicios serTV = new TvServicios();
    
    public ServiceEj3() {
    }
    
    public void calcularPrecios(ArrayList<Electrodomestico> lista){
        Double sumaTotal = 0.0, sumaLav = 0.0, sumaTv = 0.0;
        for (Electrodomestico aux : lista) {
            if(aux instanceof Lavadora){
                Lavadora lav = (Lavadora) aux;
                
                serLav.precioFinal(lav);
                sumaLav = sumaLav + aux.getPrecio();
            }
            if(aux instanceof Television){
                Television tele =  (Television) aux;
                
                serTV.precioFinal(tele);
                sumaTv = sumaTv + aux.getPrecio();
            }
            
        }
        sumaTotal = sumaTv + sumaLav;
        System.out.println("La SUMA DE TODOS LOS ELECTRODOMESTICOS ES : $" +sumaTotal);
        System.out.println("LA SUMA DE TV es de = $" + sumaTv);
        System.out.println("LA SUMA DE LAVADORAS es de = $" + sumaLav);
        
    }
    
    public void mostrarLista(ArrayList<Electrodomestico> lista){
        
        for (Electrodomestico aux : lista) {
            if(aux instanceof Lavadora){
                Lavadora lav = (Lavadora) aux;
                serLav.mostrarArticulo(lav);
            }
            if(aux instanceof Television){
                Television tele =  (Television) aux;
                serTV.mostrarArticulo(tele);
            }
        }
        
    }
}
