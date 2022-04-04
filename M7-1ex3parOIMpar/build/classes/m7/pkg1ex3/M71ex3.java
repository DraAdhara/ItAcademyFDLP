/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg1ex3;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M71ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*L’usuari ha d'introduir un número i el programa ha de mostrar 
        per pantalla si el número és parell o imparell.
        */
        int numero;
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indica un número entero:");
            numero = entrada. nextInt();
            
        if(numero % 2 == 0) {
       respuesta = (numero +" es un número par.");
        }else {
            respuesta = (numero + " es un número impar.");
        }
        System.out.println(respuesta);
    
}
}