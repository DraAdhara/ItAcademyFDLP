/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintrabajador;

/**
 *
 * @author adhara
 */
final public class Encargados extends Trabajadores {//al tener final no se pueden hacer más clases por debajo
    //definimos atributos
    int incentivo;
    
    //constructor
    public Encargados(String nombre, int sueldo, int ano, int mes, int dia){
        super(nombre,sueldo,ano,mes,dia);
        
    }
    //setter
    public void setIncentivo(int extra){
        this.incentivo = extra;
    }
    
    @Override
    public int getSueldo(){
        int sueldoJefe = super.getSueldo();
        return sueldoJefe + this.incentivo;
    }
    
}
