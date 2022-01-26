/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import Ejercicio_1.entidades.Animal;
import Ejercicio_1.entidades.Caballo;
import Ejercicio_1.entidades.Gato;
import Ejercicio_1.entidades.Perro;

/**
 *
 * @author AXEL
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        
        Perro perro1 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();
        
        Animal gato = new Gato("Pelusa","Galletas",15,"Slames");
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
        
    }
    
}
