/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg3ex3;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M73ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        L’usuari ha d’introduir una frase i el programa ha de dir si la frase és un palíndrom
        */
        String derecho, derecho2, reves = "";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
            derecho = input.nextLine();
        derecho2 = derecho.replace(" ", "");  
        
        //System.out.println(derecho);
        
        for (int i = derecho2.length() - 1; i >= 0; i--) {
            reves += derecho2.charAt(i);
        }   
        if (derecho2.equalsIgnoreCase(reves)){		
            System.out.println(derecho + " es palindromo");
        } else {
            System.out.println(derecho + " no es un palindromo");  
        }
        
    }
}
        