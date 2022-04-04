/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author adhara
 */
public class operadores {
    public static void main (String[] args){
        int num1 = 12;
        int num2 = 8;
        
        //suma 
        
        int suma = num1 + num2;
        
        //resta
        int resta = num1 - num2;
        
        //multiplicación 
        int multi = num1 * num2;
        
        //división 
        int divi = num1 / num2;
        
        //módulo o resto
        int resto = num1 % num2;
        
        System.out.println("el resultado de la suma es " + suma);
        System.out.println("el resultado de la resta es " + resta);
        System.out.println("el resultado de la multiplicación es " + multi);
        System.out.println("el resultado de la división es " + divi);
        System.out.println("el resultado del módulo o resto es " + resto);
    }
}
