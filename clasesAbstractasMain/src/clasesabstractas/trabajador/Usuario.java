/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas.trabajador;

/**
 *
 * @author adhara
 */
abstract public class Usuario {
    //definimos atributos
    private String nombre;
    
    //constructor
    
    public Usuario (String nombre){
    this.nombre = nombre;
}
    //metodo no abstracto
    public String getNombre (){
        return this.nombre;
    }
    
    //metodo abstracto
    public abstract String getDescripcion();
}
