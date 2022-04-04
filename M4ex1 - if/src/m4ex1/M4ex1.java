/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4ex1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Modifica l’exercici 1 del mòdul 3. Un cop introduïdes les dades, el programa ha de mostrar el següent per pantalla:
        - Si l’usuari té 18 anys o més: “Nom Cognom, ets MAJOR d’edat”  
        - Si l’usuari és menor de 18 anys: “Nom Cognom, ets MENOR d’edat”.
        */
        Scanner entrada = new Scanner(System.in);
        String nom;
        String cog;
        Byte edad;
        //Pongo en marcha las preguntas 
        System.out.println("Hola, como te llamas?");
            nom = entrada.nextLine();
        System.out.println("Me gusta ese nombre. Y cúal es tu apellido?");
            cog = entrada.nextLine();
        System.out.println("De acuerdo. Por último, me puedes indicar tu edad con números?");
            // He tenido que buscar como hacer que me aceptara Byte como entrada. 
            edad = entrada.nextByte();
        if (edad < 18){
            System.out.println(nom + " " + cog + " eres menor de edad.");
        } else {
        System.out.println(nom + " " + cog + " eres mayor de edad.");
    }
    
}}
