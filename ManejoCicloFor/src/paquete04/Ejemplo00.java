/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejemplo00 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

       
        System.out.print("Ingresa el límite para generar las tablas de multipli"
                + "car: ");
        int limite = entrada.nextInt();
        System.out.println("Ingrese el número hasta el cual se va a multiplicar"
                + ":");
        int numero1=entrada.nextInt(); 

       
        int numero = 1;

        while (numero <= limite) {
            System.out.println("Tabla del " + numero + ":");
            int multiplicador = 1; 
            while (multiplicador <= numero1) {
                System.out.println(numero + " x " + multiplicador + " = " + 
                        numero * multiplicador);
                multiplicador++;
            }
            System.out.println();
            numero=numero+1;
            multiplicador=1;
        }
    
    }
}

