/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4exextra2;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4exExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Demana a l'usuari un número entre 0 i 99 i mostra'l escrit 
        ex: 22 = veintidos    
        */
        
        int numero, unidades = 0, decenas = 0;
        String nStr, uStr, unidadesLetra, decenasLetra = "";
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Indica un número de 0 a 99.");
        numero = entrada.nextInt();
        if(numero > 9) { // son decenas
           nStr = String.valueOf(numero); 
           uStr = nStr.substring(1);
           unidades = Integer.parseInt(uStr);
           nStr = nStr.substring(0,1);
           decenas = Integer.parseInt(nStr);
           
          
           
           /*pendiente aplicar subString para recortar cadena de x posición a y posición
           una vez lo tengamos lo pasaremos de nuevo a Int.
           Luego crearemos dos estructuras condicionales, iuna para controlar decenas y otra unidades
           y al final haremos el montaje final
            */
        } else {
            unidades = numero;
        }
        //unidades a texto palabras 
        switch(unidades){
            case 0:
                unidadesLetra = "";
                break;
            case 1: 
                unidadesLetra = "uno";
                break;
            case 2:
                unidadesLetra = "dos";
                break;
            case 3: 
                unidadesLetra = "tres";
                break;
            case 4:
                unidadesLetra = "cuatro";
                break;
            case 5:
                unidadesLetra = "cinco";
                break;
            case 6:
                unidadesLetra = "seis";
                break;
            case 7:
                unidadesLetra = "siete";
                break;
            case 8: 
                unidadesLetra = "ocho";
                break;
            case 9:
                unidadesLetra= "nueve";
                break;
            default:
                unidadesLetra= "";
                break;
        }
         /* decenas con IF porque hay que hacer condiciones más avanzadas
        si decenas es igual a uno y unidades es 0 o unidades está entre 6 y 9.
        */
        if((decenas == 1) && ((unidades == 0 ) || ((unidades >= 6) && (unidades <= 9))) ) {
            decenasLetra = "diez";
            }else if ((decenas == 1) && (unidades == 1)){
                decenasLetra = "once";
                unidadesLetra = "";
            }else if ((decenas == 1) && (unidades == 2)){
                decenasLetra = "doce";
                unidadesLetra = "";
            }else if ((decenas == 1) && (unidades == 3)){
                decenasLetra = "trece";
                unidadesLetra = "";
            }else if ((decenas == 1) && (unidades == 4)){
                decenasLetra = "catorce";
                unidadesLetra = "";
            }else if ((decenas == 1) && (unidades ==5)){
                decenasLetra = "quince";
                unidadesLetra = "";
            }else if (decenas == 2){
                decenasLetra = "veinte";
            }else if (decenas == 3){
                decenasLetra = "treinta";
            }else if (decenas == 4){
                decenasLetra ="cuarenta";
            }else if (decenas == 5){
                decenasLetra = "cincuenta";
            }else if (decenas == 6){
                decenasLetra = "sesenta";
            }else if (decenas == 7){
                decenasLetra = "setenta";
            }else if (decenas == 8){
                decenasLetra = "ochenta";
            }else if (decenas == 9){
                decenasLetra = "noventa";
            } 
            if ((decenasLetra != "") && (unidadesLetra != "")){
                System.out.println(decenasLetra + " y " + unidadesLetra);      
            }else{
                System.out.println(decenasLetra + unidadesLetra);
            }
}
}