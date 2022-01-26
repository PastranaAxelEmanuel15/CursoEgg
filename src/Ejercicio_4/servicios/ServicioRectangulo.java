/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4.servicios;

import Ejercicio_4.entidades.Rectangulo;
import Ejercicio_4.interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class ServicioRectangulo implements CalculosFormas{
    
    private final Scanner SC = new Scanner(System.in);
    private Rectangulo rect_1 = new Rectangulo();

    public ServicioRectangulo() {
    }

    public Rectangulo crearRectangulo(){
        
        System.out.println("--------\nCrando un rectangulo");
        rect_1.setNombre("Rectangulo");
        
        System.out.println("Ingrese la Base del Rectangulo:");
        rect_1.setBase(SC.nextDouble());
        
        System.out.println("Ingrese la Altura del Rectangulo:");
        rect_1.setAltura(SC.nextDouble());
        
        calcularArea();
        calcularPerimetro();
    
        return rect_1;
    }
    
    public void mostrarRectangulo(){
        System.out.println(rect_1.toString());
    }
    
    @Override
    public void calcularArea() {
        Double area;
        
        area = rect_1.getBase() * rect_1.getAltura();
        
        rect_1.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        Double perimetro;
        perimetro = (rect_1.getBase()+rect_1.getAltura())*2;
        rect_1.setPerimetro(perimetro);
    }
    
}
