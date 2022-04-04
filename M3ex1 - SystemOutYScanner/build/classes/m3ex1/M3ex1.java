/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m3ex1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M3ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo el objeto y las distintas variables
        Scanner entrada = new Scanner(System.in);
        String nom;
        String cog;
        Byte edad;
        //Pongo en marcha las preguntas 
        System.out.println("Hola, como te llamas?");
            nom = entrada.nextLine();
        System.out.println("Me gusta ese nombre. Y cúal es tu apellido?");
            cog = entrada.nextLine();
        System.out.println("De acuerdo. Por último, me puedes indicar tu edad con números?");
            // He tenido que buscar como hacer que me aceptara Byte como entrada. 
            edad = entrada.nextByte();
        System.out.println("Entonces, si he entendido bien,te llamas " + nom +" " +  cog + " y tienes " + edad + " años, es correcto?");
    }
    
}
