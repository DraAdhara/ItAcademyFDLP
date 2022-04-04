/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m6ex2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M6ex2 {
static Scanner entrada = new Scanner(System.in);//práctica desaconsejada, pero entiendo que quieres que la use 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        /*Aquest programa calcula l'edat mitjana d'un número de persones introduït per teclat.
        S'ha de crear una funció que s'encarregui de demanar les edats a l'usuari
        i de calcular l'edat mitjana.
        La funció rebrà per paràmetre el nº de persones a qui ha de demanar l'edat.
        L'edat de les persones només serà vàlida si està compresa entre 0 i 120 anys.
        La mitjana de les edats introduïdes s'ha de retornar per la funció (return).
        */
        
        int numPersonas = 0, resultado;
        
        System.out.println("Cuantas personas hay?");
            numPersonas = entrada.nextInt();
            resultado = calculoMedianaEdad(numPersonas);
            
            System.out.println("La edad media de las " + numPersonas + " personas es " + resultado);
    }

   public static int calculoMedianaEdad(int numPersonas){
        
        int persona = 0, edad = 0, sumaEdades = 0, mediaEdad;
        ArrayList<Integer> edades = new ArrayList<Integer>();
        
        
        for (int i = 1; i <= numPersonas; i++){
        persona = i;
        System.out.println("Cúal es la edad de la persona " + persona + "?");
           edad = entrada.nextInt();
            if ((edad < 0) || (edad > 120)){
                System.out.println("Intoduce una edad válida entre 0 y 120:");
                i = i - 1;
                    edad = entrada.nextInt();
            } else {        
                edades.add(edad);
            }
        }
        for(int a = 0; a < edades.size(); a++){
        sumaEdades += edades.get(a);
        }
        mediaEdad = (sumaEdades / numPersonas);
        return mediaEdad;
}      
}

