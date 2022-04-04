/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4ex4a;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4ex4a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*L’usuari introdueix un mes per pantalla i mitjançant un switch amb els 12 mesos de l’any,
        el programa calcula els dies del mes i mostra el següent: 
        Exemple: Si el número introduït és 1, llavors ha d'aparèixer per pantalla: 
        “El mes de gener té 31 dies”
        */   
        
        int mes;
        String dias = "";
        Scanner entrada = new Scanner(System.in);   
        
        
        //System.out.println(mes);
               
            System.out.println("Cuál es el número del mes del que deseas saber la cantidad de días?");
            mes = entrada.nextByte();
            
       
            switch(mes) {
            case 1: 
                dias = "El mes de enero tiene 31 días.";
                break;
            case 2:
                dias = "El mes de febrero tiene 28 días.";
                break;
            case 3:
                dias = "El mes de marzo tiene 31 días.";
                break;
            case 4:
                dias = "El mes de abril tiene 30 días.";
                break;
            case 5: 
                dias = "El mes de mayo tiene 31 días.";
                break;
            case 6: 
                dias = "El mes de junio tiene 30 días.";
                break;
            case 7: 
                dias = "El mes de julio tiene 31 días.";
                break;
            case 8:
                dias = "EL mes de agosto tiene 31 días.";
                break;
            case 9:
                dias = "El mes de septiembre tiene 30 días.";
                break;
            case 10:
                dias = "El mes de octubre tiene 31 días.";
                break;
            case 11: 
                dias = "El mes de noviembre tiene 30 días.";
                break;
            case 12:
                dias = "El mes de diciembre tiene 31 días.";
                break;
            default:
                dias = "Ese mes no existe en el calendario gregoriano.";
                break;
    }
    System.out.println(dias);
}
}