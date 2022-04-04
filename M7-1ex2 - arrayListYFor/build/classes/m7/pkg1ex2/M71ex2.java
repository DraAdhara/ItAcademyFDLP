/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg1ex2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M71ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Un professor vol calcular les mitges de les notes de tota la classe. Crea una aplicació on l'usuari 
        introduirà un número per pantalla (el número correspon al número de notes 
        que vol introduir) i el programa li demanarà que introdueixi les notes de tots els alumnes.
        Un cop les notes han sigut introduides, el programa retorna el següent:
        Si la nota mitjana és menor que 5: "La nota mitjana de la classe està suspesa. 
        Els alumnes haurien de preguntar els seus dubtes i treballar més".
        Si la nota és inferior a 7: "La nota mitjana de la classe és bona, 
        però els alumnes haurien de millorar el treball personal".
        Per la resta de casos, el missatge ha de ser: "Enhorabona! La nota mitjana 
        de la classe es correspon amb l'esforç realitzat".
        *Les notes han d'estar compreses entre 0 i 10.
        */
        
        int numNotas, cantNotas, sumaNotas = 0, nota, mediaNotas;
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<Integer>();
        
        System.out.println("Indica en números cuantas notas quieres introducir.");
            numNotas = entrada.nextInt();
            
        for (int i = 1; i <= numNotas; i++){
            cantNotas = i;
            System.out.println("Introduce la nota " + cantNotas + ":");
                nota = entrada.nextInt();
                if ((nota < 0) || (nota >10)){
                    System.out.println("La nota debe estar entre 0 y 10.");
                    i = i - 1;
                } else {
                    notas.add(nota);
                }
        }
        for(int a = 0; a < notas.size(); a++){
        sumaNotas += notas.get(a);
        }
        mediaNotas = (sumaNotas / numNotas);
        
               
        if (mediaNotas < 5){
            respuesta = ("La nota media de la clase está suspendida, los alumnos deberían preguntar sus dudas y trabajar más.");
        } else if (mediaNotas < 7){
            respuesta = ("La nota media de la clase es buena, pero los alumnos deberían mejorar el trabajo personal.");
        } else {
            respuesta = ("Enhorabuena, la nota media de la clase se corresponde con el esfuerzo realizado.");
        }
        
        System.out.println(respuesta);
    }
    
      
}
