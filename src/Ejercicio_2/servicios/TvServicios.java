/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2.servicios;

import Ejercicio_2.entidades.Television;

/**
 *
 * @author AXEL
 */
public class TvServicios extends ElecServicios{
    
    private Television tele = new Television();

    public TvServicios() {
    }

    public void crearTelevisor(){
        String afir;
        System.out.println("Television");
        
        do{
            System.out.println("Ingrese Resolucion del Televisor:");
            tele.setResolucion(SC.nextDouble());
        }while(tele.getResolucion()<0.00);
        
        
            System.out.println("¿Tiene Sintonizador TDT? s/n");
            afir = SC.next();
        
        if(afir.equalsIgnoreCase("s")){
            tele.setSintonizadorTdt(true);
        }else{
            tele.setSintonizadorTdt(false);
        }
        
        super.crearElectrodomestico();
        tele.setColor(equipoNuevo.getColor());
        tele.setConsumoEnergetico(equipoNuevo.getConsumoEnergetico());
        tele.setPeso(equipoNuevo.getPeso());
        tele.setPrecio(equipoNuevo.getPrecio());
        
        //precioFinal();
    }
    
    @Override
    public void precioFinal(){
        Double precioF = tele.getPrecio();

        switch(tele.getConsumoEnergetico()){
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
        
        if(tele.getPeso() >= 1 && tele.getPeso() < 20.00){
            precioF = precioF + 100.00;
        }
        if(tele.getPeso() >= 20 && tele.getPeso() < 50.00){
            precioF = precioF + 500.00;
        }
        if(tele.getPeso() >= 50 && tele.getPeso() < 80.00){
            precioF = precioF + 800.00;
        }
        if(tele.getPeso() >= 80.00){
            precioF = precioF + 1000.00;
        }
        
        if(tele.getResolucion()>40){
            precioF = precioF + (precioF*30/100);
        }
        if(tele.getSintonizadorTdt()){
            precioF = precioF + 500.00;
        }
        
        tele.setPrecio(precioF);
    }
    
    
    @Override
    public void mostrarArticulo(){
        System.out.println(tele.toString());
    }
    
    public void precioFinal(Television tele){
        Double precioF = tele.getPrecio();

        switch(tele.getConsumoEnergetico()){
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
        
        if(tele.getPeso() >= 1 && tele.getPeso() < 20.00){
            precioF = precioF + 100.00;
        }
        if(tele.getPeso() >= 20 && tele.getPeso() < 50.00){
            precioF = precioF + 500.00;
        }
        if(tele.getPeso() >= 50 && tele.getPeso() < 80.00){
            precioF = precioF + 800.00;
        }
        if(tele.getPeso() >= 80.00){
            precioF = precioF + 1000.00;
        }
        
        if(tele.getResolucion()>40){
            precioF = precioF + (precioF*30/100);
        }
        if(tele.getSintonizadorTdt()){
            precioF = precioF + 500.00;
        }
        
        tele.setPrecio(precioF);
    }
    
    public void mostrarArticulo(Television tv){
        System.out.println(tv.toString());
    }
    
}
