/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package localglobal;

/**
 *
 * @author adhara
 */
public class LocalGlobal {
   static int edad = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Oriol";
        System.out.println(edad);
        saludar();
        System.out.println(edad);
    }
    
    public static void saludar(){
        //System.out.println(nombre);
        edad = 24;
    }
    
    public static void vestido(){
        
    }
}
