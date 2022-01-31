/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialogo1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class Dialogo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String clima;
        
        System.out.println("Hace frio? si o no.");
        clima = entrada.nextLine();
        System.out.println("Hoy en la calle " + clima + " hace frio.");
               
        // TODO code application logic here
    }
    
}
