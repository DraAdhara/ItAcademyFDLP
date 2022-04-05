/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maintrabajador;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author adhara
 */
public class Trabajadores {
    String nombre;
    int sueldo;
    Date alta;
    
    //constructor
    public Trabajadores (String nombre, int sueldo, int ano, int mes, int dia){
        //atentos a como coge los datos Date alta
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(ano, mes-1,dia);//le restamos una pos a mes porque empieza desde 0
        this.alta = calendario.getTime();//getTime es metodo de GregorianCalendar
    }
    //getter
    
    public String getNombre(){
        return this.nombre;
    }
    public int getSueldo(){
        return this.sueldo;
    }
    
public Date getData(){
    return this.alta;
}
    public String getInfo(){
        return "El treballador " + this.nombre + " gana un sueldo de " + this.sueldo +
                " al mes y se dio de alta el " + this.alta + ".";
    }
public void setSueldo (int porcentaje){
    int aumento = (this.getSueldo() * porcentaje) / 100;
    this.sueldo += aumento;
}


}

