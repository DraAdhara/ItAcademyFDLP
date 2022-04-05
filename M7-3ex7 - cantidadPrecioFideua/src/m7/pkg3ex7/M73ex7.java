/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg3ex7;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M73ex7 {

    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Un grup d’amics ha quedat per fer una fideuà, els ingredients principals
        seran: fideus, gambes, i calamars. Saben que per cada quatre persones han 
        d’utilitzar mig quilo de fideus, 400 grams de calamars i 200 grams de gambes. 
        S’ha de fer un programa que demani per pantalla el preu per quilo de cada 
        ingredient i el nombre d’amics que seran per dinar. El programa ha de calcular 
        les quantitats necessàries de cada ingredient, el preu per persona i el preu final de la fideuà.
        */
        int nPersonas; 
        float cantidadFideos, precioFideos, cantidadCalamares, precioCalamares, cantidadGambas, precioGambas,precioTotal, precioXPersona;
        
        
        System.out.println("Cuantas personas asistirán a la fideuá?");
            nPersonas = input.nextInt();
        cantidadFideos = ((500/4) * nPersonas);   
        cantidadCalamares = ((400/4) * nPersonas);  
        cantidadGambas = ((200/4) * nPersonas);
        
        precioFideos = precioTotalFideos(cantidadFideos);
        precioCalamares = precioTotalCalamares(cantidadCalamares);
        precioGambas = precioTotalGambas(cantidadCalamares);
        
        precioTotal = precioFideos + precioCalamares + precioGambas;
        precioXPersona = (precioTotal / nPersonas);
        
        System.out.println("Se necesitaran " + cantidadFideos + " gramos de fideos, " + cantidadCalamares + " de calamares y " + cantidadGambas + " de gambas.");    
        
        System.out.println("El precio total será " + precioTotal + " €, y el precio por persona será " + precioXPersona + " €.");
        
        }
    public static float precioTotalFideos (float cantidadFideos){
        float kiloFideos, precioFideos;
        
        System.out.println("A que precio está el quilo de fideos?");
                kiloFideos = input.nextFloat();
         precioFideos = ((kiloFideos / 1000) * cantidadFideos);       
        
      return precioFideos;
    }

    public static float precioTotalCalamares (float cantidadCalamares){
       float kiloCalamares, precioCalamares;
        
        System.out.println("A que precio está el quilo de calamares?");
                kiloCalamares = input.nextFloat();
        precioCalamares = ((kiloCalamares / 1000) * cantidadCalamares);  
        
    return precioCalamares;    
    }
    
    public static float precioTotalGambas (float cantidadGambas){
        float kiloGambas, precioGambas;
        
        System.out.println("A que precio está el quilo de gambas?");
                kiloGambas = input.nextFloat();
        precioGambas= ((kiloGambas /1000) * cantidadGambas);
        
    return precioGambas;
    }
}