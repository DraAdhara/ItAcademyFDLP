/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainvehiculos.superclaseyherencia;

/**
 *
 * @author adhara
 */
public class Motos extends Vehiculos{

    //definimos parametros
    String manillar;
    boolean cajon;
    boolean piton;
    
    //Constructor
    public Motos(int motor, int ruedas,String color,String combustible,String manillar,boolean cajon,boolean piton){
        super(motor,ruedas,color,combustible);
        this.manillar = manillar;
        this.cajon = cajon;
        this.piton = piton;
    }
    
    //Getter
    public String getManillar(){
        return this.manillar;
    }
    public boolean getCajon(){
        return this.cajon;
    }
    public boolean getPiton(){
        return this.piton;
    }
    
    //Setter
    public void setManillar(String manillar){
        this.manillar = manillar;
    }
    public void setCajon(boolean cajon){
        this.cajon = cajon;
    }
    public void setPiton(boolean piton){
        this.piton = piton;
    }
    
    //Metodos
    public void caballito(){
        System.out.println("Estoy en el aire");
    
}
    @Override
    public String toString(){
        return ("Soy una moto con un motor de " + 
                this.motor + " c.c., con " + this.ruedas + ", de color " + 
                this.color + " y funciono con combustible " + 
                this.combustible + " a " + this.kmh + " kmh. Tambien tengo un manillar " + 
                this.manillar + ", y cajon " + this.cajon + " y piton " + this.piton);
}
    @Override
    public void acelerar(){
        int velocidad = super.getKmh();
        velocidad += 20;
        super.setKmh(velocidad);
    }
}
