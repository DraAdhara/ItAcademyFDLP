/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg1ex8;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M71ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea un programa on l’usuari introdueixi una temperatura en ºC i es mostri per pantalla la conversió en ºFahrenheit
        Fórmula
        (32 °C × 9 / 5) + 32 = 89,6 °F
        */
        
        double centi, fahr;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, indica la temperatura en grados celsius (ºC):");
            centi = entrada.nextDouble();
            
        fahr = (centi * 9 / 5) + 32;
        
        System.out.println(centi + " grados celsius son " + fahr + " grados Fahrenheit.");
        
    }
    
}
