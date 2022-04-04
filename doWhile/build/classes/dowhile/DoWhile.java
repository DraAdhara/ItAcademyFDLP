/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner entrada = new Scanner (System.in);
        //instrucciones previas a la condición
        do{
          System.out.println("Elige una opción:\n1. Crear factura\n2. Anular factura"
                  + "\n3. Abonar factura\n4. Salir");
          opcion = entrada.nextInt();
        }while (opcion < 4);
        System.out.println("Adiós!!!");
    }
    
}
