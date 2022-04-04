/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5ex2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M5ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        El programa demana dos números enters i llavors calcula la suma dels valors compresos entre els dos números, inclosos. 
        Exemple: 4 i 6  --> resultat = 4 + 5 + 6 = 15
        */
        int num1, num2, resultado = 0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<Integer>();
        
        
        System.out.println("Dime el primer número entero");
                num1 = entrada.nextInt();
        System.out.println("Dime el segundo número entero");
                num2 = entrada.nextInt();
         
                if (num1 <= num2){
                    for (int i = num1; i <= num2; i++){
                        valores.add(i);
                        resultado += i;
                    }
                } else if (num1 > num2){
                    for (int i = num2; i <= num1; i++){
                        valores.add(i);
                        resultado += i;
                    } 

                    
                    
                } 
                System.out.println("Ahora vamos a sumar los siguientes números " + valores);
                System.out.println("La suma de todos los valores da como resultado " + resultado);
                }
                
                


// falta codigo   
                /*else //(num1 == num2) 
                puede que no haga falta el else si en if pongo (num1 <= num2)} 
    }            */       
        //recorrer bucle desde un número hasta otro. Valor inicial. 
    }


