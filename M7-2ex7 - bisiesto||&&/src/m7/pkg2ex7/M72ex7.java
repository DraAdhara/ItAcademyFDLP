/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg2ex7;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M72ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* L’usuari introdueix un any a per teclat 
        i el programa crida a un mètode que indiqui l’any és de traspàs o no.
        */
       
       int ano;
       String respuesta;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Indica un año para saber si es bisiesto o no:");
            ano = input.nextInt();
            respuesta = bisiesto(ano);
        System.out.println(respuesta);
    }
    public static String bisiesto (int ano){
    String respuesta;
    
        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
            respuesta = ("El año " + ano + " es bisiesto.");
        } else {
            respuesta = ("El año " + ano + " NO es bisiesto.");
    }
    return respuesta;
    }
    
}
