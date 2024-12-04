/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete05;

import java.util.Locale;
import java.util.Scanner;
import paquete01.*;

/**
 *
 * @author reroes
 */
public class EjemploTablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero = 1;
        int numero2 = 1;
        int limite;
        int limite2;
        
        System.out.println("Ingrese el numero de la tablas a generar:");
        limite = entrada.nextInt();
        
        System.out.println("Ingrese el limite:");
        limite2 = entrada.nextInt();
        
        while (numero2 <= limite){
            while(numero <= limite2) {
                System.out.println(numero2 + " * " + numero + " = " 
                        + numero2 * numero);
                numero = numero + 1;
            }
            numero = 1;
            numero2 = numero2 + 1;
        }
        
    }

}
