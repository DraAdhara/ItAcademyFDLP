/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg1ex5;

/**
 *
 * @author adhara
 */
public class M71ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mostra per pantalla els nombres parells compresos entre el 100 i el 0 en ordre descendent.
        
        
        int numero = 100;
        
        do{
            System.out.println(numero);
            numero = numero - 2;
        } while (numero >= 0);
    }
    
}
