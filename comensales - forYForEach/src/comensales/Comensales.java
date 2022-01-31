/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comensales;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class Comensales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int comensales, numeroplatos;
        String plato;
        ArrayList<String> platos = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Cuantos comensales tiene la mesa?");
                comensales = entrada.nextInt();
                
         for (int i = 1; i <= comensales; i++){
             System.out.println("Que desea de primer plato?");
                plato = entrada.next();
                platos.add(plato);
             System.out.println("Que desea de segundo plato?");
                plato = entrada.next();
                platos.add(plato);
             System.out.println("Que desea de postre?");
                plato = entrada.next();
                platos.add(plato);
         }
         numeroplatos = platos.size();
         System.out.println("El número total de platos es " + numeroplatos + ".");
         System.out.println("Los platos de esta mesa son:");
         for (String a : platos){
             System.out.println( a);
         }
         
    }
    
}
