/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete05;

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
        
        int numero = 1;
        int numero2 = 1;
        int limite = 4;
        
        while (numero2 <=3){
            while(numero <= limite) {
                System.out.println(numero2 + " * " + numero + " = " 
                        + numero2 * numero);
                numero = numero + 1;
            }
            numero = 1;
            numero2 = numero2 + 1;
        }
        
    }

}
