/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maintrabajador;

/**
 *
 * @author adhara
 */
public class MainTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encargados jefeRRHH = new Encargados("Jordi", 28000, 2018, 03, 15);
        
        jefeRRHH.setIncentivo(2570);
        
        Trabajadores[] trabajadores = new Trabajadores[4];
    trabajadores [0] = new Trabajadores ("Josep", 2700, 2016,10,2);
    trabajadores[1] = jefeRRHH; //puedes meter un encargado dentro de un array de trabajadores: POLIMORFISMO
    trabajadores [2] = new Trabajadores("Anna", 3200, 2014, 11, 25);
    trabajadores [3] = new Encargados("Lidia", 5200,2012,12,26);//se pasa un Encargados a Array de Trabajadores, pasa a ser Trabajadores
    
    Encargados jefeContabilidad = (Encargados) trabajadores[3];  //cast de objeto Trabajadores a Encargados
    
    
    for (Trabajadores j: trabajadores){
        j.setSueldo(5);
        System.out.println(j.getInfo());
    }
    }
    
    
}
