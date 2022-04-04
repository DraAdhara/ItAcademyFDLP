/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5ex5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M5ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Has de modificar el programa de les beques (ara el programa només ha de poder donar 5 beques). 

        El programa anirà demanant les dades dels alumnes fins que es donin aquestes 5 beques. 
        Un cop el programa hagi assignat les 5 beques s’ha de mostrar per pantalla 
        els noms dels 5 alumnes que tenen beca.
        */
        
        int edad, becas = 5;
        String tuniversitario, paro, nombre;
        ArrayList<String> becado = new ArrayList<>(5);
        Scanner entrada = new Scanner(System.in);
        
        while (becas >0){
        System.out.println("Hola, indica tu nombre");
            nombre = entrada.next();        
        System.out.println("ahora indica tu edad en números");
            edad = entrada.nextInt();
        System.out.println("Tienes titulo universitario?");
            tuniversitario = entrada.next();
        System.out.println("Estás en el paro?");
            paro = entrada.next();
            
            if ((paro.equalsIgnoreCase("si")) || (edad >= 18) && (tuniversitario.equalsIgnoreCase("si"))){
            becado.add(nombre);
            becas = becas - 1;
            //System.out.println(becas);
            System.out.println(nombre + ", se te ha asignado una beca.");
            }   else {
                    System.out.println("No se te ha asignado una beca");
                    }
    }
        if (becas == 0){
            for(String i : becado){
                System.out.println("Se le ha dado una beca a " + i);
        }
    }
}}
