/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2.servicios;

import Ejercicio_2.entidades.Electrodomestico;
import Ejercicio_2.entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class LavadoraServicio extends ElecServicios{
    //private final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private Lavadora lav = new Lavadora();

    public LavadoraServicio() {
    }

    
    public void crearLavadora(){
        
        
        System.out.println("LAVADORA");
        
        do{
            System.out.println("Ingrese la carga:");
            lav.setCarga(SC.nextInt());
        }while(lav.getCarga()<0);
        
        
        super.crearElectrodomestico();
        
        lav.setColor(equipoNuevo.getColor());
        lav.setConsumoEnergetico(equipoNuevo.getConsumoEnergetico());
        lav.setPeso(equipoNuevo.getPeso());
        lav.setPrecio(equipoNuevo.getPrecio());
        
        //precioFinal();        
    } 
    
    @Override
    public void precioFinal(){
        
        Double precioF = lav.getPrecio();

        switch(lav.getConsumoEnergetico()){
            case "A":
                precioF = precioF + 1000.00;
                break;
            case "B":
                precioF = precioF + 800.00;
                break;
            case "C":
                precioF = precioF + 600.00;
                break;
            case "D":
                precioF = precioF + 500.00;
                break;
            case "E":
                precioF = precioF + 300.00;
                break;
            case "F":
                precioF = precioF + 100.00;
                break;
        }
        
        if(lav.getPeso() >= 1 && lav.getPeso() < 20.00){
            precioF = precioF + 100.00;
        }
        if(lav.getPeso() >= 20 && lav.getPeso() < 50.00){
            precioF = precioF + 500.00;
        }
        if(lav.getPeso() >= 50 && lav.getPeso() < 80.00){
            precioF = precioF + 800.00;
        }
        if(lav.getPeso() >= 80.00){
            precioF = precioF + 1000.00;
        }
        
        if(lav.getCarga()>30){
            precioF = precioF + 500.00;
        }
        
        lav.setPrecio(precioF);
        
    }
    
    @Override
    public void mostrarArticulo(){
        System.out.println(lav.toString());
    }
    
    public void precioFinal(Lavadora lavadora){
        
        Double precioF = lavadora.getPrecio();

        switch(lavadora.getConsumoEnergetico()){
            case "A":
                precioF = precioF + 1000.00;
                break;
            case "B":
                precioF = precioF + 800.00;
                break;
            case "C":
                precioF = precioF + 600.00;
                break;
            case "D":
                precioF = precioF + 500.00;
                break;
            case "E":
                precioF = precioF + 300.00;
                break;
            case "F":
                precioF = precioF + 100.00;
                break;
        }
        
        if(lavadora.getPeso() >= 1 && lavadora.getPeso() < 20.00){
            precioF = precioF + 100.00;
        }
        if(lavadora.getPeso() >= 20 && lavadora.getPeso() < 50.00){
            precioF = precioF + 500.00;
        }
        if(lavadora.getPeso() >= 50 && lavadora.getPeso() < 80.00){
            precioF = precioF + 800.00;
        }
        if(lavadora.getPeso() >= 80.00){
            precioF = precioF + 1000.00;
        }
        
        if(lavadora.getCarga()>30){
            precioF = precioF + 500.00;
        }
        
        lavadora.setPrecio(precioF);
        
    }
    
    public void mostrarArticulo(Lavadora lav){
        System.out.println(lav.toString());
    }
}
