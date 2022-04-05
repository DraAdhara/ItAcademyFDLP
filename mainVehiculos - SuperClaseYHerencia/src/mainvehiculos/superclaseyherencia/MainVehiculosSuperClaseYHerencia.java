/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainvehiculos.superclaseyherencia;

/**
 *
 * @author adhara
 */
public class MainVehiculosSuperClaseYHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Vehiculos coche1 = new Vehiculos(1500,4,"Blanco","Gasolina");
        Coches coche2 = new Coches(1500,4,"Blanco","Gasolina",4,true,"Cuero");
        Motos moto3 = new Motos(1500,4,"Blanco","Gasolina","Basico",true,false);
        Camiones camion1 = new Camiones(1500,4,"Blanco","Gasolina",3000,true);
        coche1.acelerar();
        moto3.acelerar();
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(moto3.toString());
        System.out.println(camion1.toString());
        
    }
    
}
    
    

