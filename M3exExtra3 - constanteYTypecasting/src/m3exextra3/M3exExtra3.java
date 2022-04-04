/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m3exextra3;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M3exExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Escriu un programa Java que calculi els litres de pintura necessaris 
        per a pintar una paret rectangular.
        Un litre de pintura cobreix aproximadament, 12m2 en una sola mà.
        Crea una constant anomenat coberturaLitro per a guardar la dada de cobertura de la pintura (12m2)
        Hauràs de demanar a l'usuari:
        - L'alt i ample de la paret ( multiplicant sabràs l'àrea de la mateixa )
        - El nombre de mans a aplicar
        Mostra en pantalla els litres de pintura a utilitzar.
        */
        
        final int coberturaLitro = 12; // final para determinar que es una constante
        int alto, ancho, area, manos;
        double litros;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuál es el alto en metros?");
        alto = entrada.nextInt();
        System.out.println("Cuál es el ancho en metros?");
        ancho = entrada.nextInt();
        area = alto * ancho;
        System.out.println("Cuántas manos quieres aplicar?");
        manos = entrada.nextInt();
        area = area * manos;
        
       //Fuerzo a area convertise en double
        litros = (double) area / coberturaLitro;
        
        
        System.out.println("El número total de litros a utilizar será aproximadamente " + litros + ".");
    }
    
}
