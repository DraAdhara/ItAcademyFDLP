/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas.trabajador;

/**
 *
 * @author adhara
 */
public class Alumno extends Usuario{
    //definimos atributos
    private String curso;
    
    // constructor
    
    public Alumno (String nombre, String curso){
        super(nombre);//referencia al constructor de la superclase
        this.curso = curso;
    }
    //metodo por la descripción 
    @Override
    public String getDescripcion(){
        return "Este alumno está estudiando el curso " + this.curso + ".";
    }
}
