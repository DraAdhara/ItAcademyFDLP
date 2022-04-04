/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4exextra1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4exExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Fes un programa que pregunti a l'usuari dos nombres enters al qual anomenaràs dividend 
           i divisor respectivament.
            El divisor haurà d'estar comprès entre 2 i 7.
            En cas contrari, el programa haurà de mostrar un missatge d'error.
            Si el divisor és correcte (2-7) mostra en pantalla si el dividend és múltiple del divisor, o no.
        */    
        int divisor, dividendo;
        float resultado;
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime el valor del divisor entre 2 y 7");
        divisor = entrada.nextInt();
        
        
        
        if((divisor >= 2) &&(divisor <= 7)){
             System.out.println("Dime el valor del dividendo");
             dividendo = entrada.nextInt();     
             resultado = dividendo % divisor;
             if(resultado == 0) {
                respuesta = "Es multiple";
             } else {
                respuesta = "No es multiple";
             }
        } else {
            respuesta = "Error";
        }
        
        System.out.println(respuesta);
    }
    
    
}
