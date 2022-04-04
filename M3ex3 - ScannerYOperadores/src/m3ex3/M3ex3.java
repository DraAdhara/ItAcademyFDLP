/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m3ex3;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M3ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo objeto y distintas variables que voy a necesitar
        Scanner entrada = new Scanner(System.in);
        int nota1 = 0, nota2 = 0, nota3 = 0; 
        double notaFinal;
        double cant = 3.0;
        double resultado = 0.0;
        
        //solicito las notas al usuario y las asigno a las variables correspondientes      
        System.out.println ("Que nota has sacado en el primer examen?");
                nota1 = entrada.nextInt();
        System.out.println ("Que nota has sacado en el segundo examen?");
                nota2 = entrada.nextInt();
        System.out.println ("Que nota has sacado en el tercer examen?");
                nota3 = entrada.nextInt();
                
        //calculo la notaFinal y el resultado tras hacer la media        
        notaFinal = nota1 + nota2 + nota3;
        resultado = notaFinal / cant;
                
         //impresión del resultado final       
        System.out.println("Tu nota media es " + resultado + ".");
    }
    
}
