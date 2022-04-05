/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg2ex4;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M72ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realitzar un programa on l’usuari introdueix un número i el programa crida 
        a un mètode que retorna el factorial del número introduit.
        El factorial d'un nombre n (enter, no negatiu) és el producte de tots els nombres 
        enters positius inferiors o iguals a n. 
        */
        
        int n, resultado;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un número para ver su factorial:");
            n = input.nextInt();
            
            resultado = factorial(n);
            
            System.out.println("El factorial de " + n + " es " + resultado + ".");
            
    }
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
}
