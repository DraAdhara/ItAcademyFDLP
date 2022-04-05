/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainvehiculos.superclaseyherencia;

/**
 *
 * @author adhara
 */
public class Vehiculos {
    
    //Empezamos a definir los atributos
    int motor;
    int ruedas;
    String color;
    String combustible;
    int kmh;
    
    //Definir el metodo constructor
    public Vehiculos(int motor, int ruedas,String color,String combustible){
        this.motor = motor;
        this.ruedas = ruedas;
        this.color = color;
        this.combustible = combustible;
        this.kmh = 0;
    }
    
    //Getter
    public int getMotor(){
        return this.motor;
    }
    public int getRuedas(){
        return this.ruedas;
    }
    public String getColor(){
        return this.color;
    }
    public String getCombustible(){
        return this.combustible;
    }
    public int getKmh(){
        return this.kmh;
    }
    
    //Setters
    public void setMotor(int motor){
        this.motor = motor;
    }
    public void setRuedas(int ruedas){
        this.ruedas = ruedas;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setCombustible(String combustible){
        this.combustible = combustible;
    }
    public void setKmh(int kmh){
        this.kmh = kmh;
    }
    
    //Metodos
    public void arrancar(){
        this.kmh = 10;
        System.out.println("Brummm");
    }
    
    public void acelerar(){
        this.kmh += 10;
    }
    
    public void frenar(){
        if((this.kmh - 10) >= 0){
            this.kmh -= 10;
        }
    }
    
    @Override
    public String toString(){
        return ("Soy un vehiculo con un motor de " + this.motor + " c.c., con " 
                + this.ruedas + "ruedas, de color " + this.color + "y funciono con combustible " +
                this.combustible + " a " + this.kmh);
    }
    
}
