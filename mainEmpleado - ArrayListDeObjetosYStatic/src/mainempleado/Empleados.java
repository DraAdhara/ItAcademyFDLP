/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainempleado;

/**
 *
 * @author adhara
 */
public class Empleados {
    //definición de atributos
    int id = 1;
    static int idSiguiente = 1;//creamos una variable común para llevar el contador de usuarios
    String nombre;
    int sueldo;
    
    //Metodo constructor

public Empleados (String nombre, int sueldo){
    this.id = this.idSiguiente; //lo controlaremos por código para evitar errores humanos
    this.idSiguiente++;
    this.nombre = nombre;
    this.sueldo = sueldo;
}
   //getter
public int getId(){
    return this.id;
}

public String getNombre(){
    return this.nombre;
}

public int getSueldo(){
    return this.sueldo;
}    
    //setter
/*public void setId(int id){
    this.id = id;
*/

public void setNombre(String nombre){
    this.nombre = nombre;
}    

public void setSueldo (int sueldo){
    this.sueldo = sueldo;
}

//metodos genericos 
//subida de sueldo
public void aumento(int valor){
        int aumento =(this.getSueldo() * valor /100);
        this.sueldo = this.getSueldo() + aumento;
}
    @Override
    public String toString (){
    return "Me llamo " + this.nombre + " con id " + this.id + 
            " y tengo un sueldo de " + this.sueldo + " euros al mes.";
}

    
}
