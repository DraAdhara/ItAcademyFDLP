/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m3exextra1enclase;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M3exExtra1enclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Escriu un programa Java que llegeix un nombre enter per teclat
        i obté i mostra per pantalla el doble i el triple d'aquest número.
        */
        
        //Primero se declaran las variables y luego las clases
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indica un número entero");
        num = entrada.nextInt();
        System.out.println("El doble del número " + num + " es " + (num*2) + ". El triple es " + (num*3) + ".");
        
    }
    
}
