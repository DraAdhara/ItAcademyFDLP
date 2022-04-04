/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4ex3a;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4ex3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Una escola d’idiomes concedeix beques a futurs estudiants si 
        compleixen una sèrie de requisits. 
        A l'alumne se li assigna una beca si és major d’edat i si té un títol universitari. 
        O també se li assigna una beca si l’alumne està a l’atur. 
        El programa demana les tres dades per pantalla i en finalitzar mostra si l’alumne té la beca o no.
        */
        int edad;
        String tuniversitario, paro;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Hola, indica tu edad en números");
            edad = entrada.nextInt();
        System.out.println("Tienes titulo universitario?");
            tuniversitario = entrada.next();
        System.out.println("Estás en el paro?");
            paro = entrada.next();
            
        if ((paro.equalsIgnoreCase("si")) || ((edad >= 18) && (tuniversitario.equalsIgnoreCase("si")))){
            System.out.println("Se te ha asignado una beca.");
        }    else {
                    System.out.println("No se te ha asignado una beca");
                    }
            
        
        /* Código que hice preguntando primero si tiene paro, 
        pero Oriol me pide que use && y ||
        
        Como si tiene paro se le asigna beca sin importar el resto de datos, es lo primero que pregunto
        System.out.println("Hola, estás en el paro? Si o No");
            paro = entrada.nextLine();
            if(paro.equalsIgnoreCase("si")){
                System.out.println("Se te ha asignado una beca.");
            } else {
                System.out.println("De acuerdo, indica tu edad en números");
                    edad = entrada.nextInt();
            
                if (edad < 18){
                    System.out.println("No se te ha asignado una beca.");  
                   //EL PROBLEMA  
                } else { 
                    System.out.println("Por último, tienes titulo universitario?");
                    tuniversitario = entrada.next();
                    if (tuniversitario.equalsIgnoreCase("si")){
                        System.out.println("Se te ha asignado una beca.");
                    } else {
                        System.out.println("No se te ha asignado una beca.");
                                }
                    }
            */
    }
}

     
       
    
    

