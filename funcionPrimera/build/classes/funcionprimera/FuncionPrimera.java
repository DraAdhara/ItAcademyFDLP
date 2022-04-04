/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionprimera;

/**
 *
 * @author adhara
 */
public class FuncionPrimera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here. 
        // invocamos la función dentro del metodo main
        String nombre = "Ricardo";
        String apellido = "Perez";
        int edad = 28;
        saludar(nombre, apellido, edad, "Barcelona");
        /*saludar cinco veces
        saludar();
        saludar();
        saludar();
        saludar();
        */
       
    }
    //Definición a partir del metodo main
    public static void saludar (String nombre, String apellido, int edad, String ciudad){
        //lógica básica
        System.out.println("Hola " + nombre + " " + apellido + ", tienes " + edad + " años y vives en " + ciudad + ".");
    }
}
