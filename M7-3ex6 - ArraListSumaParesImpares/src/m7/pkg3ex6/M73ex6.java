/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg3ex6;

import java.util.ArrayList;

/**
 *
 * @author adhara
 */
public class M73ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dona’t un array de números, el programa ha de mostrar la suma de tots 
        els números parells i la suma de tots els números imparells.
        */
        
        int par = 0, impar = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(28);
        numeros.add(27);
        numeros.add(16);
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(13);
        
        for (int i : numeros){
            if(i % 2 == 0){
                par += i;
            } else{
                impar += i;
            }
        }
        
        System.out.println("La suma de los pares es " + par + ".");
        System.out.println("La suma de los impares es " + impar + ".");
        
        
    }
    
}
