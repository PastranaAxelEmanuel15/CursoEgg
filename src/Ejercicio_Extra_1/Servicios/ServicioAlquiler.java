/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Extra_1.Servicios;

import Ejercicio_Extra_1.entidades.AlquilerBarco;
import Ejercicio_Extra_1.entidades.BarcoAMotor;
import Ejercicio_Extra_1.entidades.Velero;
import Ejercicio_Extra_1.entidades.Yate;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author AXEL
 */
public class ServicioAlquiler {

    AlquilerBarco nuevoAlquiler = new AlquilerBarco();
    private ServicioBarco servBarc = new ServicioBarco();
    private ServicioVelero servVelero = new ServicioVelero();
    private ServicioBarcoaMotor servMotor = new ServicioBarcoaMotor();
    private ServicioYate servYate = new ServicioYate();
    private final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public void crearAlquiler() {
        Integer mes, dia, diaMax, anho, opcn;
        Date fechaDeAlquiler = new Date(), fechaDevolucion = new Date();
        System.out.println("Ingrese Nombre del Cliente");
        nuevoAlquiler.setNombre(SC.next());

        System.out.println("Ingrese DNI del Cliente:");
        nuevoAlquiler.setDocumento(SC.nextInt());

        System.out.println("Ingrese la fecha del Alquiler:");
        System.out.println("Ingrese año:");
        anho = SC.nextInt();
        fechaDeAlquiler.setYear(anho-1900);
        do {
            System.out.println("Ingrese mes:");
            mes = SC.nextInt();

            switch (mes) {
                case 2:
                    diaMax = 28;
                    break;
                case 4:
                    diaMax = 30;
                    break;
                case 6:
                    diaMax = 30;
                    break;
                case 9:
                    diaMax = 30;
                    break;
                case 11:
                    diaMax = 30;
                    break;
                default:
                    diaMax = 31;
            }
        } while (mes < 1 || mes > 12);
        fechaDeAlquiler.setMonth(mes-1);
        do {
            System.out.println("Ingrese dia:");
            dia = SC.nextInt();

        } while (dia < 1 || dia > diaMax);
        fechaDeAlquiler.setDate(dia);

        nuevoAlquiler.setFechaDeAlquiler(fechaDeAlquiler);

        System.out.println("\nIngrese la fecha de Devolucion:");
        
            System.out.println("Ingrese año:");
            anho = SC.nextInt();
            fechaDevolucion.setYear(anho-1900);
            
      
        do {
            System.out.println("Ingrese mes:");
            mes = SC.nextInt();

            switch (mes) {
                case 2:
                    diaMax = 28;
                    break;
                case 4:
                    diaMax = 30;
                    break;
                case 6:
                    diaMax = 30;
                    break;
                case 9:
                    diaMax = 30;
                    break;
                case 11:
                    diaMax = 30;
                    break;
                default:
                    diaMax = 31;
            }
        } while (mes < 1 || mes > 12);
        fechaDevolucion.setMonth(mes-1);
        do {
            System.out.println("Ingrese dia:");
            dia = SC.nextInt();
        } while (dia < 1 || dia > diaMax);
        fechaDevolucion.setDate(dia);

        nuevoAlquiler.setFechaDeDevolucion(fechaDevolucion);

        System.out.println("Ingrese posicion del Amarre:");
        nuevoAlquiler.setPosicionAmarre(SC.nextInt());
        
        do{
            System.out.println("Seleccione El tipo de Barco a Alquilar: \n1.Velero \n2.Barco A Motor \n3.Yates \n4.Normal");
            opcn = SC.nextInt();
        }while(opcn < 1|| opcn>4);
        
        switch (opcn) {
            case 1:
                nuevoAlquiler.setBarco(servVelero.crearVelero());
                break;
            case 2:
                nuevoAlquiler.setBarco(servMotor.crearBaM());
                break;
            case 3:
                nuevoAlquiler.setBarco(servYate.crearYate());
                break;
            case 4:
                nuevoAlquiler.setBarco(servBarc.crearBarco());
                break;
        }
        
        calcularAlquiler();
        

    }
    
    
    private void calcularAlquiler(){
        
        
        Long diasDeOcupacion = calcularDias(nuevoAlquiler.getFechaDeAlquiler(),nuevoAlquiler.getFechaDeDevolucion());
        Double modulo;
        
        if(nuevoAlquiler.getBarco() instanceof Velero){
            modulo = servVelero.modulo();
        } else if(nuevoAlquiler.getBarco() instanceof BarcoAMotor){
            modulo = servMotor.modulo();
        }else if(nuevoAlquiler.getBarco() instanceof Yate){
            modulo = servYate.modulo();
        } else{
            modulo = servBarc.modulo();
        }
        
        nuevoAlquiler.setPrecioAPagar(diasDeOcupacion * modulo);
        
    }
    
    private Long calcularDias(Date fechaAlquiler, Date fechaDevolucion){
        LocalDate fa = LocalDate.of(fechaAlquiler.getYear(), Month.values()[fechaAlquiler.getMonth()], fechaAlquiler.getDate());
        LocalDate fd = LocalDate.of(fechaDevolucion.getYear(), Month.values()[fechaDevolucion.getMonth()], fechaDevolucion.getDate());
        
        Long dias = DAYS.between(fa, fd);
        
        return dias;
    }
    
    public void mostrarAlquiler(){
        System.out.println(nuevoAlquiler.toString());
    }
}
