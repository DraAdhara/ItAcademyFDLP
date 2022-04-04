/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M5ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*El programa demana quantes paraules vol introduir l'usuari. Aquest, 
        introdueix el número i llavors apareix el següent missatge: "Introdueix la paraula". 
        Aquest missatge es mostra tantes vegades com número de paraules ha dit l'usuari que volia introduir. 
        Les paraules es guarden en un arrayList i un cop han sigut totes introduïdes, es mostren per pantalla.
        */
        int repeticion;
        String palabra;
        Scanner entrada = new Scanner(System.in);    
        ArrayList<String> listaPalabras = new ArrayList<String>();
        
        System.out.println("Indica en números cuantas palabras deseas introducir");
            repeticion = entrada.nextInt();
            
        for(int i = 0; i < repeticion; i++){
            System.out.println("Introduce la palabra");
                palabra = entrada.next();
                listaPalabras.add(palabra);
        }
            System.out.println(listaPalabras);
           
        for(int j = 0; j < listaPalabras.size(); j++){
            System.out.println(listaPalabras.get(j));
    }
    
}
}

