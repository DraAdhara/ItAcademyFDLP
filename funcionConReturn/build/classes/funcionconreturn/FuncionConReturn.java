/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionconreturn;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class FuncionConReturn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0, num2 = 0, resultado = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Indica un número");
            num1 = entrada.nextInt();
        System.out.println("Indica otro número");
            num2 = entrada.nextInt();
        resultado = suma(num1, num2);
        
        System.out.println("El resultado de la operación es: " + resultado + ".");
               
    }
    public static int suma (int num1, int num2){
      int respuesta =  num1 + num2;
      return respuesta;
        
    }
}
