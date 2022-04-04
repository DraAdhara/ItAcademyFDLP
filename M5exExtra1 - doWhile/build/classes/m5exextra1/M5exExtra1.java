/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5exextra1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M5exExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realitzar un joc per endevinar un nombre aleatori N, entre 1 i 500. 
        Si la distància entre el nombre a endevinar i el de l'usuari és de 50 o més, 
        el programa haurà de dir: 
        “Fred, fred: el teu número és més gran “ o “Fred, fred: el teu número és més petit “ 
        Si la distància entre el nombre a endevinar i el de l'usuari està entre 15 i 50, 
        el programa haurà de dir: 
        “Tebi, Tebi: el teu número és més gran “ o “Tebi, Tebi: el teu número és més petit “ 
        I si la distància entre el nombre a endevinar i el de l'usuari i si la distància 
        és menor a 15, el programa haurà de dir: 
        “Calent, calent: el teu número és més gran “ o “Calent, calent: el teu número és més petit “ 
       El procés acaba quan l'usuari encerta.
       */
        int numRandom = (int) Math.ceil((Math.random() * 500) + 1);
        int numUser, calculo;
        String respuesta = "";
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Indica un número entero entre el 1 y el 500.");
            numUser = entrada.nextInt();
            calculo = numRandom - numUser;
            System.out.println(numRandom); // trampa
            if(calculo != 0) {
                if(numUser <= 500 && numUser >= 1) {    
                    if(calculo >= 50) {
                        respuesta = "Frío, frío; tu número es más pequeño.";
                    } else if(calculo <= -50) {
                        respuesta = "Frío, frío; tu número es más grande";
                    } else if(calculo < 50 && calculo > 15) {
                        respuesta = "Templado, templado; tu número es más pequeño";
                    } else if(calculo > -50 && calculo < -15) {
                        respuesta = "Templado, templado; tu número es más grande";
                    } else if(calculo <= 15 && calculo > 0) {
                        respuesta = "Caliente, caliente; tu número es más pequeño";
                    } else if(calculo >= -15 && calculo < 0) {
                        respuesta = "Caliente, caliente; tu número es más grande";
                    } 

                    System.out.println(respuesta);
                } else {
                    System.out.println("El número debe estar entre el 1 y el 500.");
                }
            } else {
                System.out.println("¡Has acertado!");
            }
        } while(numUser != numRandom);
        
        
    }
    
}
