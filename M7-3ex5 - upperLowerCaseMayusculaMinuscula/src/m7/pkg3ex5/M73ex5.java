/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg3ex5;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M73ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Comprovar si una frase introduïda per l’usuari està formada només per 
        minúscules, només per majúscules o per minúscules i majúscules
        */
        
        String frase;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca la frase a analizar:");
            frase = input.nextLine();
            
            if (esMayuscula(frase)) {
				System.out.println("Frase en mayúsculas.");
			} else if (esMinuscula(frase)) {
				System.out.println("Frase en minúsculas");
			} else {
				System.out.println("Frase con mayúsculas y minúsculas.");
			}
		}
	

	public static boolean esMayuscula (String frase) {
		
		return frase.equals(frase.toUpperCase());
	}

	public static boolean esMinuscula(String frase) {
		
		return frase.equals(frase.toLowerCase());
	}
}
    
    

