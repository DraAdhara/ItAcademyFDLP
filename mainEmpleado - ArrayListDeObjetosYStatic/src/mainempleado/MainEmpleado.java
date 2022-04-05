/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainempleado;

import java.util.ArrayList;

/**
 *
 * @author adhara
 */
public class MainEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleados> empleados = new ArrayList<Empleados>(); //ponemos clase Empleados como tipo
        empleados.add(new Empleados("Marc", 1200));
        empleados.add(new Empleados("Laura", 1800));
        empleados.add(new Empleados("Aina", 1300));
        /*Empleados empleado1 = new Empleados("Marc", 1200);
        Empleados empleado2 = new Empleados("Laura", 1800);
        Empleados empleado3 = new Empleados("Aina", 1300);
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        */
        //for each para recorrer el arrayList
        for(Empleados empleado : empleados){
            empleado.aumento(5); //aumentamos 5%
        }
        
        for(Empleados empleado : empleados){//ponemos primero el tipo (nombre clase
            System.out.println(empleado.toString());
        }
        
        
    }
    
}
