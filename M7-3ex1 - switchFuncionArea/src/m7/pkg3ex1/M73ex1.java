/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg3ex1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M73ex1 {
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realitzar un programa que tingui un menú on se li mostraran 4 opcions a l’usuari per pantalla:

        1.- Quadrat

        2.- Triangle

        3.- Rectangle

        4.- Cercle

        0.- Sortir del programa

        Segons l’opció escollida haurà d’introduir unes dades o altres perquè el 
        programa mostri per pantalla l’àrea (el valor) del polígon escollit.
        */
        int opcion;
        float area = 0;
        
        
        System.out.println("Elige una de las siguientes formas geométricas para calcular su area:\n"
                + "1. Cuadrado\n2. Triangulo\n3. Rectangulo\n4. Circulo\n0. Salir del programa");
                opcion = input.nextInt();
        
        switch (opcion){
            case 0:
                System.out.println("Hasta pronto.");
                break;
            case 1: 
                area = cuadrado(opcion);
                break;
            case 2: 
                area = triangulo(opcion);
                break;
            case 3:
                area = rectangulo(opcion);
                break;
            case 4:
                area = circulo(opcion);
                break;
            default:
                System.out.println("Vuelve a iniciar el programa y elige una opción correcta.");
        }
        
        if ((opcion >= 1) && (opcion <= 4)){
        System.out.println("El area es " + area + ".");
    }
    }
    public static float cuadrado (int opcion){
        float lado, area;
        
        System.out.println("Indica cuanto mide uno de los lados del cuadrado:");
            lado = input.nextFloat();
        
        area = (lado * lado);
        
        return area;    
    }
    public static float triangulo (int opcion){
        float base, altura, area;
        
        System.out.println("Indica cuanto mide la base del triangulo:");
            base = input.nextFloat();
        System.out.println("Indica ahora cuanto mide la altura del triangulo:");
            altura = input.nextFloat();
            
        area = ((base * altura) / 2);
        
        return area;
    }
public static float rectangulo (int opcion){    
     float base, altura, area;
     
     System.out.println("Indica cuanto mide la base del rectangulo:");
        base = input.nextFloat();
     System.out.println("Indica ahora cuanto mide la altura del rectangulo:");
        altura = input.nextFloat();
        
     area = (base * altura);
     
     return area;
    }
public static float circulo (int opcion){ 
       float pi = (float) 3.14, radio, area; 
       
       System.out.println("Indica el radio del circulo:");
            radio = input.nextFloat();
        
            area = ((radio * radio) * pi);
            
            return area;
}
}

