/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg2ex2;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M72ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Fes un programa que mostri el següent per pantalla:

* * * * * *

* * * * *

* * * *

* * *

* *

*

El nombre de línies formades per “*” vindrà donat per un número que l’usuari introduirà per consola.

Condició: En tot el codi del programa només hi pot haver un *

També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la classe String
*/
        int numero;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cuantas lineas de asteriscos quieres hacer?");
                numero = input.nextInt();
                
        for (int i = numero; i >= 1; i--){
        
            for (int a = 1; a <= i; a++){
                System.out.print("* ");
            }    
            System.out.println("");
        }
    }
    
}
   
   
