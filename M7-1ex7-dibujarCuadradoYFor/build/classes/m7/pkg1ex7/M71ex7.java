/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg1ex7;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M71ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Fer un programa on l’usuari introdueix per pantalla un caràcter i 
        un número. El programa imprimeix per pantalla un quadrat amb la mida i
        el caràcter introduïts per l’usuari.
        */
        int numero;
        String caracter;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un caracter: ");
            caracter = entrada.next();
        System.out.println("Ahora introduce un número y verás que bonito:");
             numero = entrada.nextInt();
             
             
             for (int i = 1; i <= numero; i++) {
                for (int a = 1; a <= numero; a++) {
                    System.out.print(caracter + " ");
                }
                System.out.println("");
           
            }
                   
        } 
 }
 
