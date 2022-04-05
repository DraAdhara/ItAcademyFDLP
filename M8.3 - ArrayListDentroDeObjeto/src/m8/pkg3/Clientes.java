/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m8.pkg3;

import java.util.ArrayList;

/**
 *
 * @author adhara
 */
public class Clientes {
    //declaramos atributos de la clase Clientes
 String nombre, apellido;
 ArrayList<Cuentas> cuentas = new ArrayList<Cuentas>();
 //Cuentas nuevasCuentas;
 //metodo constructor, aunque no es necesario para el ejercicio. 
 /*public Clientes (String nombre, String apellido){
     this.nombre = nombre;
     this.apellido = apellido;
     ArrayList<Cuentas> cuentas = new ArrayList<Cuentas>();
 }*/ 
 
 //metodos getter
 public String getNombre (){
     return this.nombre;
 }
 public String getApellido (){
     return this.apellido;
 }
 public ArrayList<Cuentas> getCuentas() {
    return this.cuentas;
 }   
//metodos setter
 
 public void setNombre (String nombre){
     this.nombre = nombre;
 }
 public void setApellido (String apellido){
     this.apellido = apellido;

 }
 public void setCuenta (Cuentas cuenta){
     
     this.cuentas.add(cuenta);
    
 }

    
    }
 
 