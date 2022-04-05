/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasofunciones;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class RepasoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre ="",respuesta="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Que usuario deseas buscar?");
        nombre = entrada.next();
        respuesta = buscaDatos(nombre);
        System.out.println("El serivdor ha respondido: " + respuesta);
    }
    public static String buscaDatos(String nombre){
        String respuesta = "";
        if(nombre.equalsIgnoreCase("Oriol")){
            respuesta = "Oriol con 37 aÃ±os y trabaja de professor.";
        } else {
            respuesta = "Usuario no encontrado";
        }
        return respuesta;
    }
    
}
    
