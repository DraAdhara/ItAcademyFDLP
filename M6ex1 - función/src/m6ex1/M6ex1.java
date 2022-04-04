/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m6ex1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M6ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Calculadora arcaica. El programa demana a l’usuari que introdueixi dos números i 
        l’operació que desitja realitzar. Cada operació (suma, resta, multiplicació, 
        divisió i mòdul) estarà programada en una funció diferent.
*/      int num1, num2, resultado = 0, calculo = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenide a la calculadora arcaica.\n"
                + "Introduce el primer número que deseas calcular: ");
                   num1 = entrada.nextInt();
        System.out.println("Ahora introduce el segundo número que quieras calcular:");
                    num2 = entrada.nextInt();
        System.out.println("Que tipo de calculo deseas realizar?:\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. División\n"
                + "5. módulo");
                calculo = entrada.nextInt();
                
            switch (calculo) {
                case 1:
                    resultado = suma(num1,num2);
                    break;
                case 2:
                    resultado = resta(num1,num2);                                               
                    break;
                case 3:resultado = multi(num1,num2);   
                    break;
                case 4:
                    resultado = divi(num1,num2);
                    break;
                case 5: 
                     resultado = modu(num1,num2);
                        break;
                default:
                        System.out.println("Datos introducidos incorrectos");
                        break;
                      
                }
                    
            System.out.println("El resutlado es " + resultado + ".");  
    }
    public static int suma (int num1, int num2){
      int resultado =  num1 + num2;
      return resultado;
    }
    public static int resta (int num1, int num2){
      int resultado =  num1 - num2;
      return resultado;
    }
    public static int multi (int num1, int num2){
      int resultado =  num1 * num2;
      return resultado;
    }
    public static int divi (int num1, int num2){
      int resultado =  num1 / num2;
      return resultado;
    }
    public static int modu (int num1, int num2){
      int resultado =  num1 % num2;
      return resultado;
    }
}