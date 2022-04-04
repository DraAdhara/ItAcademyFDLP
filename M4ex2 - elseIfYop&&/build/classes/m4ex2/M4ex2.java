/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4ex2;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Aquest programa li demana l’edat a l’usuari, en funció d’aquesta, 
        mostrarem un dels següents missatges per pantalla:
        Si té 5 anys o menys: preescolar
        Si té entre 6 i 11 anys: primària
        Si té entre 12 i 15: ESO
        Si té entre 16 i 17: Batxillerat
        Si és major d'edat: FP o Universitat
        */
        int edad;
        String ciclo = "0";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Hola, que edad tienes?");
            edad = entrada.nextInt();
        if (edad <=5 )   
            ciclo = "Preescolar";
        else if ((edad >= 6) && (edad <= 11))
            ciclo = "Primaria";
        else if (( edad >= 12) && (edad <= 15))
            ciclo = "ESO";
        else if (( edad >= 16) && (edad <= 17))
            ciclo = "Bachillerato";
        else if ( edad >= 18)
            ciclo = "FP o Universidad";
        
        System.out.println("Estás en el ciclo " + ciclo + ".");
        
    }
    
}
