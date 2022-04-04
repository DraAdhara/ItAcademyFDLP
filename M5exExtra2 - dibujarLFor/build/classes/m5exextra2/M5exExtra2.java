/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5exextra2;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M5exExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realitza un programa que pinti la lletra L per pantalla feta amb asteriscs.   
        El programa demanarà l'altura. 
        El pal horitzontal de la L tindrà una longitud de la meitat (divisió entera entre 2) de l'altura més un. (Recordar println i print) 
        Exemple: 
        Introduïu l'alçada de la L : 5 
        La base serà  la divisió del nombre entre 2 : (5 / 2) + 1 = 3
        *
        * 
        * 
        *
        * * *
        */
         String caracter ="* ";
        int y, x;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica la altura con un numero entero");
        y = entrada.nextInt();
        
        for (int i = 0; i < y; i++){
            
            
            if(i == (y-1)){
                x = (y / 2) + 1;
        
                for (int j = 0; j < x; j++){
                    System.out.print(caracter);
                }
            }else {
                System.out.println(caracter);
                }
        } 
    }
    
}
