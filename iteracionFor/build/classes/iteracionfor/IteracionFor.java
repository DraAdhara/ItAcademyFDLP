/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteracionfor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class IteracionFor {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        boolean salir = false ; //para usarla como variable de control para salir del bucle j
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> alumnos = new ArrayList<String>();
        //para que se repitiese 10 veces
        for (int j = 0; (j < 10) && (salir == false); j++){
        
            System.out.println("Que alumno deseas añadir? O indica 'true' si deseas finalizar el programa");
            nombre = entrada.nextLine();
            if (nombre.equalsIgnoreCase("true")){
                salir = true;
            } else {
                alumnos.add(nombre);
        }
        /* Aqui añadiamos elementos a la array
        alumnos.add("Jose");
        alumnos.add("Laura");
        alumnos.add("Rita");
        alumnos.add("Ruben");
        */
        System.out.println(alumnos);
        /*para imprimir todos y cada uno de los nombres
        usas alumnos.size() para que se repita tantas veces como posiciones tenga la array
        */
        for(int i = 0; i < alumnos.size(); i++){
            System.out.println(alumnos.get(i));
            
        }
    }
    
}
}
