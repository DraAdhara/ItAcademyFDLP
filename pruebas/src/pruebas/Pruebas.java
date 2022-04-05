/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    
    
      public static void main(String[] args) {
        /* TODO code application logic here
        L’usuari ha d’introduir números fins que introdueixi un nombre primer. 
        En el moment que l’usuari introdueixi un nombre primer, el programa ha 
        de treure per pantalla el següent missatge: Exacte, el número “x” és primer!
        */
        
        double n;
        boolean esPrimo = false;
        Scanner input = new Scanner(System.in);
        
        
        do {

           System.out.println("Introduce un número:");
            n = input.nextDouble();
            
            for (int i = 2; i < n; i++) { 
            if (n % i == 0) {         
                esPrimo = false;
            }
        }        
        esPrimo = true;
    
            /*if (calculoPrimo(n) == true){
                esPrimo = true;
            } else {
                esPrimo = false;
            }
            */
            
            
        } while (esPrimo != true);
        
        System.out.println("Exacto! el número " + n + " es primo.");
        
}
    public static Boolean calculoPrimo(double n) {
        
        for (int i = 2; i < n; i++) { 
            if (n % i == 0) {         
                return false;
            }
        }        
        return true;
    
}
}
