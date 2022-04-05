/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasowhile;

/**
 *
 * @author adhara
 */
public class RepasoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int clave = 123, intentos = 0, claveGenerada = 0;
        //int claveGenerada = (int) Math.ceil((Math.random() * 999)); 
        
        do{
            claveGenerada = (int) Math.ceil((Math.random() * 999));
            intentos++;
        }while(clave != claveGenerada && intentos <= 50);
        System.out.println("La clave es: " + clave + " en " + intentos + " intentos.");

    }
    
}
