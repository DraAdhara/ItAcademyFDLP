/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainvehiculos.superclaseyherencia;

/**
 *
 * @author adhara
 */
public class Camiones extends Vehiculos{
    int carga;
    boolean frigorifico;
    
    //Constructor
    public Camiones(int motor, int ruedas,String color,String combustible,int carga,boolean frigorifico){
        super(motor,ruedas,color,combustible);
        this.carga = carga;
        this.frigorifico = frigorifico;
    }
    
    //Getter
    public int getCarga(){
        return this.carga;
    }
    public boolean getFrigorifico(){
        return this.frigorifico;
    }
    
    //Setter
    public void setCarga(int carga){
        this.carga = carga;
    }
    public void setFrigorifico(boolean frigorifico){
        this.frigorifico = frigorifico;
    }
    public void suspension(boolean suspension){
        String respuesta = (suspension) ? "Esta elevado" : "Esta bajo";
        System.out.println(respuesta);
    }
    public void desenganchar(boolean desenganchar){
        System.out.println("Soy libre como el aire");
    }
    @Override
    public String toString(){
        return ("Soy un camión con un motor de " + 
                this.motor + " c.c., con " + this.ruedas + ", de color " + 
                this.color + " y funciono con combustible " + 
                this.combustible + " a " + this.kmh + " kmh. También tengo carga " + 
                this.carga + " y frigorifico " + this.frigorifico);
}
}
