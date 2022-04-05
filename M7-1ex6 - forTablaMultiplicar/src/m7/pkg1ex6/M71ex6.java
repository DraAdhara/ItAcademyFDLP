/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg1ex6;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M71ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Taula de multiplicar. L’usuari introduirà un número (del 1 al 10) 
        per pantalla, i utilitzant un bucle, el programa li mostrarà la taula de multiplicar d’aquell número.
        */
        int numero, multi;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Indica un número del 1 al 10 y te mostraré la tabla de multiplicar de ese número:");
                numero = entrada.nextInt();
        for (int i = 1; i <= 10; i++){
            if ((numero < 1) || (numero > 10)){
            System.out.println("TE HE DICHO QUE UN NÚMERO DEL 1 AL 10.");
                numero = entrada.nextInt();
            i = i - 1;
        }else {
            
                multi = (numero * i);
                System.out.println(numero + " x " + i + " = " + multi);
            }
        }
    }
    
}
