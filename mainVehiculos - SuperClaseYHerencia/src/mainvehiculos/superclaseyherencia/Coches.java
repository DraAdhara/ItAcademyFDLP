/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainvehiculos.superclaseyherencia;

/**
 *
 * @author adhara
 */
public class Coches extends Vehiculos{
    // definimos atributos
int maletero;
    boolean deportivo;
    String tapiceria;
    boolean autopilot;
    
    //constructor
    public Coches(int motor, int ruedas,String color,String combustible,int maletero,boolean deportivo,String tapiceria){
        super(motor,ruedas,color,combustible);
        this.maletero = maletero;
        this.deportivo = deportivo;
        this.tapiceria = tapiceria;
        this.autopilot = false;
    }
    
    //Getter
    public int getMaletero(){
        return this.maletero;
    }
    public boolean getDeportivo(){
        return this.deportivo;
    }
    public String getTapiceria(){
        return this.tapiceria;
    }
    
    //Setter
    public void setMaletero(int maletero){
        this.maletero = maletero;
    }
    public void setDeportivo(boolean deportivo){
        this.deportivo = deportivo;
    }
    public void setTapiceria(String tapiceria){
        this.tapiceria = tapiceria;
    }
    
    //MÃ©todos
    public void descapotarse(){
        System.out.println("He quitado la capota.");
    }
    public void autopilot(boolean autopilot){
        if(autopilot){
            System.out.println("Autopilot encendido");
        } else {
            System.out.println("Autopilot apagado");
        }
    }
    
    @Override
    public String toString(){
        return ("Soy un coche con un motor de " + 
                this.motor + " c.c., con " + this.ruedas + ", de color " + 
                this.color + " y funciono con combustible " + 
                this.combustible + " a " + this.kmh + " kmh. También dispongo de maletero de " + 
                this.maletero + " m3, deportivo " + this.deportivo + 
                " y tengo una tapiceria de " + this.tapiceria);
}
}