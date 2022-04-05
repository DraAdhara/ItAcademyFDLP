/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String respuesta, answer;
        boolean resBoolean;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Te gusta el color amarillo?");
        respuesta = entrada.nextLine();
        
        /*if(respuesta.equalsIgnoreCase("si")){
            respuestaBoolean = true;
        }*/
        //Operador ternario
        resBoolean = (respuesta.equalsIgnoreCase("si")) ? true : false;
        if(resBoolean){
            answer = "Te gusta el color amarillo";
        } else {
            answer = "No te gusta el color amarillo";
        }
        
        System.out.println(answer);
    }
    
}
    

