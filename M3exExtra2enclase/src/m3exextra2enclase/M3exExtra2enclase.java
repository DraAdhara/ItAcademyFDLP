/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m3exextra2enclase;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M3exExtra2enclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Un programa que pregunta el nombre del alumno y el aula. 
        
    String nombre, aula;
    Scanner entrada = new Scanner(System.in);  
    
    System.out.println("Cúal es tu nombre?");
        nombre = entrada.nextLine();
    System.out.println("Que nombre más bonito, " + nombre + ". En que aula estás?");
    aula = entrada.nextLine();
    System.out.println("Vale, " + nombre + ", estás en el aula " + aula + ".");
    }
    
}
