/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2.servicios;

import Ejercicio_2.entidades.Electrodomestico;
import java.util.Scanner;


/**
 *
 * @author AXEL
 */
public class ElecServicios {
    
    protected final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    protected Electrodomestico equipoNuevo = new Electrodomestico();

    public ElecServicios() {
    }

    public Boolean comprobarConsumoEnergetico(String letra){
        Boolean correc = false;
        
        switch(letra){
            case "A":
                correc = true;
                break;
            case "B":
                correc = true;
                break;
            case "C":
                correc = true;
                break;
            case "D":
                correc = true;
                break;
            case "E":
                correc = true;
                break;
            default:
                correc = false;
                break;
        }
        return correc;
    }
    
    public Boolean comprobarColor(String color){
        boolean valid = false;
        if(color.equalsIgnoreCase("blanco")){
            System.out.println("Color válido");
            valid = true;
        }
        if(color.equalsIgnoreCase("negro")){
            System.out.println("Color válido");
            valid = true;
        }
        if(color.equalsIgnoreCase("rojo")){
            System.out.println("Color válido");
            valid = true;
        }
        if(color.equalsIgnoreCase("azul")){
            System.out.println("Color válido");
            valid = true;
        }
        if(color.equalsIgnoreCase("gris")){
            System.out.println("Color válido");
            valid = true;
        }
        
        return valid;
    }
    
    public Electrodomestico crearElectrodomestico(){
        
        String color, consumo;
        Double precioTotal, peso;
        
        System.out.println("Ingrese el color del equipo:");
        color = SC.next();  
        System.out.println("Ingrese Consumo Energetico del equipo (A-F)");
        consumo = SC.next();
        do{
            System.out.println("Ingrese El peso del equipo(Mayor que 0):");
            peso = SC.nextDouble();
        }while(peso <= 0);
        
        if(comprobarColor(color)){
            equipoNuevo.setColor(color);
        }else{
            equipoNuevo.setColor("blanco");
        }
        
        if(comprobarConsumoEnergetico(consumo)){
            equipoNuevo.setConsumoEnergetico(consumo);
        }else{
            equipoNuevo.setConsumoEnergetico("F");
        }
        
        equipoNuevo.setPeso(peso);
        equipoNuevo.setPrecio(1000.00);
        
        //precioFinal();
        
        
        return equipoNuevo;
    }
    
    public void precioFinal(){
        Double precioF = equipoNuevo.getPrecio();

        switch(equipoNuevo.getConsumoEnergetico()){
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
        
        if(equipoNuevo.getPeso() >= 1 && equipoNuevo.getPeso() < 20.00){
            precioF = precioF + 100.00;
        }
        if(equipoNuevo.getPeso() >= 20 && equipoNuevo.getPeso() < 50.00){
            precioF = precioF + 500.00;
        }
        if(equipoNuevo.getPeso() >= 50 && equipoNuevo.getPeso() < 80.00){
            precioF = precioF + 800.00;
        }
        if(equipoNuevo.getPeso() >= 80.00){
            precioF = precioF + 1000.00;
        }
        
        equipoNuevo.setPrecio(precioF);
    }
    
    public void mostrarArticulo(){
        System.out.println(equipoNuevo.toString());
    }
    
}
