/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4ex6;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Fer un programa que demani a l’usuari quin dia i quin mes va néixer, 
        amb aquesta informació el programa mostra per pantalla, de quin signe del zodíac és.
        Àries-Aries (21.03 — 19.04)
        Taure-Tauro (20.04 — 20.05)
        Bessons-Géminis (21.05 — 20.06)
        Cranc-Cáncer (21.06 — 22.07)
        LLeó-Leo (23.07 — 22.08)
        Verge-Virgo (23.08 — 22.09)
        Balança-Libra (23.09 — 22.10)
        Escorpi-Escorpio (23.10 — 21.11)
        Sagitario-Sagitario (22.11 — 21.12)
        Capricorn-Capricornio (22.12 — 19.01)
        Aquari-Acuario (20.01 — 18.02)
        Peixos-Piscis (19.02 — 20.03)
        */
        
        int dia = 0, mes = 0;
        String signo = "";
        Scanner entrada = new Scanner(System.in);
               
        System.out.println("Cuál es tu día de nacimiento?");
            dia = entrada.nextInt();
                if ((dia < 1) || ( dia > 31)){
                 System.out.println("Error en la introducción de los datos.");
                } else {
                 System.out.println("Indica en números tu mes de nacimiento?");
                    mes = entrada.nextInt();   
                } if ((mes < 1) || (mes > 12)){
                   System.out.println("Error en la introducción de los datos."); 
                } else{             
       
        switch (mes){
            case 1:
                    if (dia <= 19){
                        signo = ("capricornio");
                    } else {
                        signo = ("acuario");
                    } break;
            case 2:
                    if (dia <= 18){
                        signo = ("acuario");
                    } else {
                        signo = ("piscis");
                    } break;
            case 3:
                    if (dia <= 20){
                       signo = ("piscis");
                    } else {
                        signo = ("aries");
                    } break;
            case 4: 
                    if (dia <= 19){
                        signo = ("aries");
                    } else {
                        signo = ("tauro");
                    } break;
            case 5:
                    if (dia <= 20){
                        signo = ("tauro");
                    } else {
                        signo = ("géminis");
                    } break;
            case 6: 
                    if (dia <= 20){
                        signo = ("géminis");
                    } else {
                        signo = ("cáncer");
                    } break;
            case 7:
                    if (dia <= 22){
                        signo = ("cáncer");
                    } else {
                        signo = ("leo");
                    } break;
            case 8: 
                    if (dia <= 22){
                        signo = ("leo");
                    } else {
                        signo = ("virgo");
                    } break;
            case 9:
                    if (dia <= 22){
                        signo = ("virgo");
                    } else {
                        signo = ("libra");
                    } break;
            case 10: 
                    if (dia <= 22){
                        signo = ("libra");
                    } else {
                        signo = ("escorpio");
                    } break;
            case 11:
                    if (dia <= 21){
                        signo = ("escorpio");
                    } else {
                        signo = ("sagitario");
                    } break;
            case 12:
                    if (dia <= 21){
                        signo = ("sagitario");
                    } else {
                        signo = ("capricornio");
                    } break;
            default:
                    signo = ("NO CREO EN EL HOROSCOPO");
                    }            
                    
        
        
            System.out.println("Tu signo del zodiaco es " + signo + ".");
        
     
                        }   
        }
}