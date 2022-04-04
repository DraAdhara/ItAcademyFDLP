/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5ex4b;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M5ex4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Has de modificar el programa anterior per afegir una nova funcionalitat: establir un número màxim de 5 intents.
        Si l’usuari encerta el número escollit pel programa abans d'aquests 5 intents, 
        el programa mostra el següent missatge per pantalla: “Enhorabona, 
        el número és X i has necessitat Y intents per encertar-lo”. 
        Si no encerta el número abans de 5 intents, el programa mostra per pentalla:
        "Has utilitzat massa intents! El número és X ".
        */
        /* Cuando llego 5 intentos, se imprime el texto indicado en el anunciado pero vuelve a pedir otro número, 
        y el número de intentos pasa a ser 1 de nuevo.
        Le he asignado 2 a numeroAleatorio para poder hacer las pruebas correspondientes.
        */
        int numeroAleatorio = (int)Math.ceil((Math.random() * 10));
        int numeroUsuario, intentos;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Di un número entero del 0 al 10, a ver si aciertas, pero esta vez solo tienes 5 intentos:");
            numeroUsuario = entrada.nextInt();
            intentos = 1;
        if ((numeroUsuario < 0) || (numeroUsuario > 10)){
            System.out.println("He dicho entre 0 y 10, vuelve a iniciar el programa, por favor.");
        }else{ 
        while(numeroUsuario != numeroAleatorio && intentos < 5){//while ( numeroUsuario != numeroAleatorio){
            //for (int n = 0; n < 5; n++){
                 // = intentos++;
                if ( intentos != 5){ // podría usar <= 5
                System.out.println("Ese número no es, has gastado " + intentos + " intentos de 5. \n"
                        + "Di otro número:");
                    numeroUsuario = entrada.nextInt();
                } else if ( intentos == 5) {
                        System.out.println("Has utilizado demasiados intentos! el número era " + numeroAleatorio + ".");
                    }
                    //}
                    intentos++;
        }  
            
            if (numeroAleatorio == numeroUsuario){
                System.out.println("Felicidades, el número es " + numeroAleatorio + " y has necesitado " + intentos + " intentos.");
            }
    }
    }
}
