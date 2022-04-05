/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilesalir;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class WhileSalir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean salir = false;
        String respuesta = "";
        Scanner entrada = new Scanner (System.in);
        
        while(salir == false){
            System.out.println("Quieres salir?");
            respuesta = entrada.next();
            if(respuesta.equalsIgnoreCase("si")){
                salir = true;
            }
        }
    }
    
}
