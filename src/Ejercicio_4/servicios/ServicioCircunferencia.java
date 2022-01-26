/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4.servicios;

import Ejercicio_4.entidades.Circunferencia;
import Ejercicio_4.interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class ServicioCircunferencia implements CalculosFormas {

    private final Scanner SC = new Scanner(System.in);
    private Circunferencia circ_1 = new Circunferencia();

    public ServicioCircunferencia() {
    }

    public Circunferencia crearCircunferencia() {

        System.out.println("---------\nCreando Una Circunferencia");
        circ_1.setNombre("Circunferencia");
        System.out.println("Ingrese el radio de la circunferencia:");
        circ_1.setRadio(SC.nextDouble());

        calcularArea();
        calcularPerimetro();

        return circ_1;
    }

    public void mostrarCircunferencia() {
        System.out.println(circ_1.toString());
    }

    @Override
    public void calcularArea() {
        Double area;

        area = (VALORPI * Math.pow(circ_1.getRadio(), 2));

        circ_1.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        Double perimetro;

        perimetro = VALORPI * (2 * circ_1.getRadio());

        circ_1.setPerimetro(perimetro);
    }
}
