/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m3ex2;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M3ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creo el objeto y las distintas variables que voy a necesitar
        Scanner entrada = new Scanner(System.in);
        int num1, num2, sum, res, multi, divi;
      
        // Le pido al usuario los dos números enteros
        System.out.println("Dime un número entero:");
            num1 = entrada.nextInt();
        System.out.println("Ahora dime otro número entero:");
            num2 = entrada.nextInt();
            
        // Ahora hago las operaciones asignandolas a las variables correspondientes
        sum = num1 + num2;
        res = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
        
        //Ahora imprimo los resultados en pantalla
        System.out.println("El resultado de la suma es " + sum + ".");
        System.out.println("El resultdo de la resta es " + res + ".");
        System.out.println("El resultado de la multiplicación es " + multi + ".");
        System.out.println("El resultado de la división es " + divi + ".");
        
             
              
            
        
        }
    
}
