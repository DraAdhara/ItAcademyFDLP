/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg2ex8;


import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M72ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        L’usuari introdueix un nombre per teclat i el programa crida a un mètode 
        que ha de mostrar la successió de Fibonacci.
        */
        
        int n;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Indica hasta que posición de la sucesión de Fibonacci deseas ver:");
            n = input.nextInt();
         fibonacci(n);   
    }
    public static int fibonacci (int n){
       int anterior = 0, actual = 1, siguiente; 
       //Le he dado muchas vueltas y es la mejor solución que se me ocurre
        if (n <= 0) {
            System.out.printf("Debe ingresar un número mayor que cero");
        } else if (n >= 1) {
             System.out.printf("0,");
            }
            if (n >= 2) {
                System.out.printf("1");
            }
           
            for (int i = 3; i <= n; i++) {
                siguiente = actual;
                actual = actual + anterior;
                anterior = siguiente;
                System.out.printf("," + actual);
                        
            }
            return actual;
           //Pongo int en lugar de void para que imprima, le doy un return para que no se queje. HELP.
        }
    }

       
               