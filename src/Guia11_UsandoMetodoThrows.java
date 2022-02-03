/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11_usandometodothrows;

import java.util.Scanner;

public class Guia11_UsandoMetodoThrows {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        double resultado;
        System.out.println("Ingrese un numerador: ");
        num1 = leer.nextDouble();
        System.out.println("Ingrese un denominador: ");
        num2 = leer.nextDouble();

        try {
            resultado = dividir(num1, num2);
            System.out.println("resultado: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }

    public static double dividir(double num1, double num2) throws Exception {
        double division = 0;
        try {
            if (num1 > num2) {
                division = ((int)num1 / (int)num2);
            }else{
                division = (num1 / num2);
            }
            

            System.out.println("hola");
        } catch (Exception e) {

            throw new Exception("No se puede dividir en 0", e);
        }

        return division;
        

    }

}
