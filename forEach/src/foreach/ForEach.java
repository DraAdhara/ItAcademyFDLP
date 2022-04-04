/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foreach;

import java.util.ArrayList;

/**
 *
 * @author adhara
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nombres = new ArrayList<String>();
        
        nombres.add("Pepe");
        nombres.add("Ricardo");
        nombres.add("Lucía");
        nombres.add("Josefa");
        
        /* En el primer ciclo guardará Pepe dentro de la variable nombre, en el 
        ciclo siguiente guardará Ricardo, etc
        */
        for (String nombre : nombres){
            System.out.println(nombre);
        }}
    
}
