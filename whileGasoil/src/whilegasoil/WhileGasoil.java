/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilegasoil;

/**
 *
 * @author adhara
 */
public class WhileGasoil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gasoil = 24;// por poner un número
        
        while(gasoil > 0){
            System.out.println("Estoy circulando");
            gasoil -= 2;//quita dos unidades a cada ciclo
        }
    }
    
}
