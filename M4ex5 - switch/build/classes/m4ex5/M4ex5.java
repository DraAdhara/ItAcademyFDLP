/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4ex5;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Fer un programa que demani dos números i un operador(+,-,*,/). 
        Al final, el programa ha d'imprimir per pantalla el resultat de fer 
        l’operació que contingui la variable operador.
        */    

        
        int num1, num2, operador; 
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Hola, soy tu calculadora de números enteros, indica el primer número que quieras calcular:");
            num1 = entrada.nextInt();
        
        System.out.println("Ahora, indicame que tipo de calculo quieres realizar, teniendo en cuenta que debes indicar: \n1 para sumar\n2 para restar\n3 para multiplicar\n4 para dividir" );
            operador =entrada.nextInt();
            if ((operador > 4) || (operador < 1)){
                System.out.println("Error al indicar el operador.");
            } else {
                 System.out.println("Por último, el último número que quieras calcular:");
            num2 = entrada.nextInt();
            
        switch(operador){
            case 1:
                operador = (num1 + num2);
                break;
            case 2:
                operador = (num1 - num2);
                break;
            case 3:
                operador = (num1 * num2);
                break;
            case 4:
                operador = (num1 / num2);
            default:
                /* Ya he hecho el filtro de operador incorrecto arriba para que no salte la 3ª pregunta si en la segunda
                se introduce un dato incorrecto
                */
                System.out.println("");
                break;
                 }
                
        System.out.println(operador);
        }
        
    }

}