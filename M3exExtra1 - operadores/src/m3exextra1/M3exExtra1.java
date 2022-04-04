/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m3exextra1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M3exExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    int num1;
    int numx2;
    int numx3;
    
    
    System.out.println("Dame un número entero, por favor");
            num1 = entrada.nextInt();
    numx2 = num1 * 2;
    numx3 = num1 * 3;
    
      
    System.out.println("El doble de " + num1 + " es " + numx2 + " y el triple es " + numx3 + ".");
    }
    
}
