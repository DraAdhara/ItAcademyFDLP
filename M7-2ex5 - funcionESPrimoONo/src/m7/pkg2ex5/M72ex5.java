/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg2ex5;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M72ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //L’usuari introdueix un nombre per teclat i el programa crida a un mètode que indiqui si el número és primer o no.
        int n;
        String respuesta;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dame un número entero y te digo si es primo o no.");
            n = input.nextInt();
         
        respuesta = primo(n);
            System.out.println(respuesta);
            
    }
    
    public static String primo (int n){
        int i = 1, nDivisores = 0;
        String respuesta = "";
        
        if (n <= 0) {
            respuesta = ("El número debe ser mayor que cero");
        } else {
            while (i <= n) {
                if (n % i == 0) {
                    nDivisores++;
                }
                i++;
            }
            if (nDivisores == 2) {
                respuesta = ("El número " + n + " es primo");
            } else {
                respuesta = ("El número " + n + " no es primo");
            }
        }
        return respuesta;
    }
} 
        
      