/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package disco;

/**
 *
 * @author adhara
 */
public class Disco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio portero de discoteca
        int edad = 21;
        String dia = "jueves";
        //condicional
        // || una de las condiciones se cumplen && todas las condiciones se cumplen
        if ((edad >=18) || (dia.equals("jueves") && edad >= 16)) {
            System.out.println("Puedes pasar");
    } 
        else if (edad == 0) {
            System.out.println("Debes indicar la edad");
            }  else {
                 System.out.println("NO puedes pasar");
             
            }
    }
    
}
