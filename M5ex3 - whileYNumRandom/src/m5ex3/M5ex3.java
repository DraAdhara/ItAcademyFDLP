/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5ex3;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M5ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Aquesta línia de codi: Math.ceil((Math.random() * 10));
        Retorna un número entre el 0 i el 10 de forma aleatòria.
        L’exercici consisteix a què l’usuari ha d'endevinar el número
        escollit aleatòriament pel programa.
        El programa, demana números a l’usuari fins que aquest encerti 
        el número aleatori generat pel programa.
        Un cop l’usuari ha endevinat el número, es mostrarà per pantalla 
        el següent missatge: “Enhorabona, el número era X”
         */
        int numeroAleatorio = (int)Math.ceil((Math.random() * 10));
        int numeroUsuario;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Di un entero del 0 al 10, a ver si aciertas:");
            numeroUsuario = entrada.nextInt();
            if((numeroUsuario < 0) || (numeroUsuario > 10)){
                System.out.println("Vuelve a ejecutar un programa y elige un número entre el 0 y el 10, por favor.");
            }else{
                while (numeroUsuario != numeroAleatorio){
                System.out.println("Ese no es, prueba otro número:");
                    numeroUsuario = entrada.nextInt();
                if(numeroUsuario == numeroAleatorio){
                    System.out.println("Felicidades, el número era " + numeroAleatorio + "!");
                }
    }
            
        
        }
    }
    
}
