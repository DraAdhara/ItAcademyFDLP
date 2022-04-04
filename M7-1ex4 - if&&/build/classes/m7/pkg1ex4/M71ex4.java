/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg1ex4;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M71ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        L’usuari ha d’introduir dos números, el programa retornarà “Un dels dos números és negatiu”, 
        només si un dels dos números és negatiu.
        */
        
        int num1, num2;
        String respuesta = "Uno de los dos números es negativo.";
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Indicame un número:");
            num1 = entrada.nextInt();
        System.out.println("Indica otro número");
            num2 = entrada.nextInt();
        
        if ((num1 < 0 ) && (num2 >= 0)){
            System.out.println(respuesta);
        } else if ((num1 >= 0) && (num2 < 0)){
            System.out.println(respuesta);
        }
            
        
        
    }
    
}
