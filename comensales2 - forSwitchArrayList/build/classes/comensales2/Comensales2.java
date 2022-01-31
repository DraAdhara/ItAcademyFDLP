/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comensales2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class Comensales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int comensales, numeroplatos, platoA = 0, platoB = 0, platoP = 0;
        String sPlatoA = "", sPlatoB = "", sPlatoP = "";
        ArrayList<String> platos = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Cuantos comensales tiene la mesa?");
                comensales = entrada.nextInt();
                
         for (int i = 1; i <= comensales; i++){
            System.out.println("Que desea de primer plato?\n"
                     + "1. Plato A1\n"
                     + "2. Plato A2\n"
                     + "3. Plato A3\n"
                     + "4. Plato A4.");
            platoA = entrada.nextInt();
            
                switch (platoA) {
                    case 1:
                     sPlatoA = "Plato A1";
                        break;
                    case 2:
                     sPlatoA = "Plato A2";
                        break;
                    case 3:
                     sPlatoA = "Plato A3";
                        break;
                    case 4:
                     sPlatoA = "Plato A4";
                        break;
             }
            platos.add(sPlatoA);
                
            System.out.println("Que desea de segundo plato?\n"
                     + "1. Plato B1\n"
                     + "2. Plato B2\n"
                     + "3. Plato B3\n"
                     + "4. Plato B4.");
            platoB = entrada.nextInt();
            
                switch (platoB){
                    case 1:
                        sPlatoB = "Plato B1";
                        break;
                    case 2:
                        sPlatoB = "Plato B2";
                        break;
                    case 3:
                        sPlatoB = "Plato B3";
                        break;
                    case 4:
                        sPlatoB = "Plato B4";
                        break;
                }
                platos.add(sPlatoB);
             System.out.println("Que desea de postre?\n"
                     + "1. Postre P1\n"
                     + "2. Postre P2\n"
                     + "3. Postre P3\n"
                     + "4. Postre P4.");
                platoP = entrada.nextInt();
                
                switch(platoP){
                    case 1:
                        sPlatoP = "Postre P1";
                        break;
                    case 2:
                        sPlatoP = "Postre P2";
                        break;
                    case 3:
                        sPlatoP = "Postre P3";
                        break;
                    case 4:
                        sPlatoP = "Postre P4";
                        break;
                }
                platos.add(sPlatoP);
         }
         numeroplatos = platos.size();
         System.out.println("El número total de platos es " + numeroplatos + ".");
         System.out.println("Los platos de esta mesa son:");
         for (String a : platos){
             System.out.println( a);
         }
    }
    
}
