/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg3ex2;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M73ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //En aquest programa l’usuari ha d’introduir un string i el programa ha de mostrar l’string al revés
        
        String derecho, reves = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un texto y te lo pongo al revés:");
            derecho = input.nextLine();
            
        for (int i = derecho.length() - 1; i >= 0; i--) {
            reves += derecho.charAt(i);
        }
        
        System.out.println(reves);
    
}
}