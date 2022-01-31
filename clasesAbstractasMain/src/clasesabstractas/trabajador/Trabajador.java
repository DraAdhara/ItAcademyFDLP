/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesabstractas.trabajador;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author adhara
 */
public class Trabajador extends Usuario {
    private int sueldo;
    private String nombre;
    private Date alta;
    
//Construcor
    public Trabajador (String nombre, int sueldo, int ano, int mes, int dia){
        super(nombre);
        //this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(ano,mes-1,dia);
        this.alta = calendario.getTime();
    }
    public int getSueldo(){
        return this.sueldo;
    }
    public String getInfoUser(){
        return "El trabajador se llama " +  super.getNombre() 
                + " y gana un sueldo de " + this.sueldo + ".";
    }
    public Date getData(){
        return this.alta;
    }
    //setter
    public void setSueldo(int porcentaje){
        int aumento = ((porcentaje*this.sueldo) /100);
        this.sueldo *= aumento;
    }
    //metodo abstracto
    @Override
    public String getDescripcion(){
        return "Este trabajador se llama " + super.getNombre() + " y gana un sueldo de " + this.sueldo + ".";
    }
}
