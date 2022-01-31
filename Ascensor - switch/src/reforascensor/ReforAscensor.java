/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reforascensor;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class ReforAscensor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Instanciar i definir les variables
        int pis = 0;
        String resposta = "";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indica un piso");
        pis = entrada.nextInt();
        //Estructura switch
        switch(pis){
            case 1:
                resposta = "Moda joven";
            break;
            case 2:
                resposta = "Lenceria";
            break;
            case 3:
                resposta = "Juguetes";
            break;
            case 4:
                resposta = "Aventura";
            break;
            default:
                resposta = "Escolleix una opciÃ³ correcta entre 1 i 4.";
            break;
        }
        System.out.println(resposta);
    }
    
}
    
    

