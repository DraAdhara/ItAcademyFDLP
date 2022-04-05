/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m8.pkg2mainhoteles;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M82mainHoteles {

    static Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Ens demanen crear una aplicació per donar d’alta, modificar, veure i eliminar hotels.
La classe hotel haurà de tenir els següents atributs: nom, nombre d’habitacions, nombre de plantes i superfície total de l’hotel. Com a mètodes només haurà de tenir els getters i setters propis de la classe i un mètode anomenat calcularManteniment(). Aquest mètode ha de tenir en compte que cada persona del servei pot atendre 20 habitacions i haurà de mostrar quantes persones són necessàries per atendre el servei d’habitacions de l’hotel i quin és el cost total destinat al servei sabent que aquestes persones cobren 1.500€ al mes. 
El mètode crearHotel() haurà de demanar a l’usuari que introdueixi per pantalla les dades de nom,  nombre d’habitacions, nombre de plantes i superfície total de l’hotel (o haurà de rebre aquestes dades per paràmetre). Un cop hagi demanat totes aquestes dades, s’ha d’instanciar l’objecte de la classe i afegir-lo a un array d’hotels.
El mètode donarDeBaixaHotel() haurà de rebre el nom de l'hotel que es vol donar de baixa. L’usuari introduirà el nom de l’hotel i si l’hotel està dintre de l’array, l’eliminarem i mostrarem un missatge per pantalla informant l’usuari que hem eliminat l’hotel. Si no hem trobat l’hotel dintre de l’array, avisarem l’usuari dient que l’hotel no estava dintre de la nostra aplicació.
El mètode veureHotel() haurà de rebre el nom de l'hotel que vol que mostrem per pantalla, si l’hotel està a la nostra aplicació, li mostrarem l’hotel, si no hi és, informarem l’usuari dient que l’hotel que ens ha demanat no està dintre de la nostra aplicació.
Quan mostrem l’hotel, a més, de mostrar el nombre d’habitacions, nombre de plantes i superfície total de l’hotel també es cridarà al mètode calcularManteniment().
El mètode modificarHotel() haurà de rebre el nom de l'hotel que volem modificar. L’usuari introduirà el nom de l’hotel. Si el tenim a l’aplicació, li demanarem si vol modificar el nombre d’habitacions, el nombre de plantes o la superfície total de l’hotel. Farem la modificació pertinent i avisarem a l’usuari que la modificació s’ha realitzat.
*/ 
        
       
        ArrayList<Hoteles> hoteles = new ArrayList<Hoteles>();
        hoteles.add(new Hoteles("Kirk",80,3,1000));
        hoteles.add(new Hoteles("Picard",100,5,1500));
        hoteles.add(new Hoteles("Janeway",140,4,2225));
        hoteles.add(new Hoteles("Archer",20,2,750));
        hoteles.add(new Hoteles("Sisko",60,5,1000));
        int opcion = 0;
        
        System.out.println("HOLA, BIENVENIDO A GESTORHOTEL 2000.");
        
        do{ 
            
            System.out.println("----- \nIndica que deseas realizar a continuación:"
                + "\n 1. Introducir un hotel"
                + "\n 2. Eliminar un hotel"
                + "\n 3. Ver los datos de un hotel"
                + "\n 4. Modificar un hotel"
                + "\n 5. Salir de GestorHotel 2000.");
                opcion = input.nextInt();
                
        switch (opcion){
            case 1:
                crearHotel(hoteles);
                break;
            case 2:
                bajaHotel(hoteles);
                break;
            case 3:
                verHotel(hoteles);
                break;
            case 4:
                modificarHotel(hoteles);
                break;
            case 5:
                System.out.println("----- \nGRACIAS POR UTILIZAR GESTORHOTEL 2000, HASTA PRONTO.");
        }
        }while (opcion != 5);
        //crearHotel(hoteles);
        //System.out.println(hoteles.get(1));
        //verHotel(hoteles);
        
        //bajaHotel(hoteles);
        //modificarHotel(hoteles);
        /*for(Hoteles hotel : hoteles){
        System.out.println(hotel.toString());
        */
        }
        
        
       //verHotel(hoteles);
       
       
public static boolean crearHotel(ArrayList<Hoteles> hoteles){  
    String nombre;
    int habitaciones, plantas, superficie;
    //se piden los datos del hotel que el usuario desea introducir
    System.out.println("Indica el nombre del hotel que deseas introducir en el sistema:");
        nombre = input.next();
    
    System.out.println("Indica el número de habitaciones:");
        habitaciones = input.nextInt();
    
    System.out.println("Indica el número de plantas:");
        plantas = input.nextInt();
    System.out.println("Indica la superficie del hotel:");
        superficie = input.nextInt();
        
    System.out.println("-----\nEl hotel " + nombre + " ha sido añadido al sistema correctamente.");
    
    //Se añade el nuevo objeto hotel al ArrayList Hoteles pasando los parametros introducidos por el usuario.
  return hoteles.add(new Hoteles(nombre,habitaciones,plantas,superficie));  
}

public static boolean bajaHotel(ArrayList<Hoteles> hoteles){
  String nombreHotel;
  boolean existe = false;  
   
    //Se pide el nombre del hotel que el usuario desea eliminar
    System.out.println("Indica el nombre del hotel que deseas eliminar:");
            nombreHotel = input.next();
    //recorremos el ArraList hoteles en busqueda del hotel indicado por el usuario
    for (int i = 0; i < hoteles.size(); i++) {
            Hoteles h = hoteles.get(i);
        //si existe ese hotel, lo eliminamos del ArrayList
        if (h.getNombre().equalsIgnoreCase(nombreHotel)) {
        existe = true;
        hoteles.remove(i);
        System.out.println("-----\nEl hotel " + nombreHotel +  " ha sido eliminado del sistema");
        }
        
        }
    //Se informa al usuario que no se localiza el nombre del hotel en ArrayList hoteles.
   if (!existe){
     System.out.println("-----\nEl hotel indicado no ha sido encontrado en el sistema.");
   }
    return existe;
    } 

public static void verHotel(ArrayList<Hoteles> hoteles){   
    String nombreHotel;
    boolean existe = false;  
    int p = 0; 
    //Solicitamos el nombre del hotel que el usuario desea ver
    System.out.println("Indica el nombre del hotel que estás buscando:");
            nombreHotel = input.next();
    //recorremos el ArraList hoteles en busqueda del hotel indicado por el usuario	    
    for (int i = 0; i < hoteles.size(); i++) {
            Hoteles h = hoteles.get(i);
        //Si se localiza el hotel, pasamos el valor a p y existe es true
        if (h.getNombre().equalsIgnoreCase(nombreHotel)) {
        existe = true;
        p = i;
        }
    }
    //Enseñamos los datos si el hotel se encuentra o le indicamos al usuario que no ha sido encontrado.
    if (existe){
     System.out.println(hoteles.get(p).toString());   
    }else
     System.out.println("-----\nEl hotel indicado no ha sido encontrado en el sistema.");
    }

 public static boolean modificarHotel(ArrayList<Hoteles> hoteles){
     String nombreHotel, nuevoNombre;
     boolean existe = false;
     int opcion = 0, nuevoHabitaciones, nuevoPlantas, nuevoSuperficie;
     //Solicitamos el nombre del hotel a modificar
     System.out.println("Indica el nombre del hotel que deseas modificar:");
            nombreHotel = input.next();
        //recorremos el ArrayList hoteles en busqueda del hotel
        for (int i = 0; i < hoteles.size(); i++) {
            Hoteles h = hoteles.get(i);
        //si el hotel existe, se le pregunta al usuario que desea modificar hasta que quiera salir
        if (h.getNombre().equalsIgnoreCase(nombreHotel)) {
        existe = true;
        do{
            System.out.println("-----Indica que parametro deseas modificar de " + nombreHotel + ":\n"
                    + " 1. Nombre \n 2. Número de habitaciones \n 3. Número de plantas \n 4. Superficie"
                    + "\n 5. Salir.");
                    opcion = input.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Indica el nuevo nombre de " + hoteles.get(i).getNombre()+ ":");
                            nuevoNombre = input.next();
                            nombreHotel =nuevoNombre;
                    hoteles.get(i).setNombre(nuevoNombre); 
                    break;
                case 2: 
                    System.out.println(hoteles.get(i).getNombre() + " tiene " + hoteles.get(i).getHabitaciones() + " habitciones actualmente.\n"
                            + "Indica el nuevo número de habitaciones:");
                            nuevoHabitaciones = input.nextInt();
                    hoteles.get(i).setHabitaciones(nuevoHabitaciones);
                    break;
                case 3:
                    System.out.println(hoteles.get(i).getNombre() + " tiene " + hoteles.get(i).getPlantas() + " plantas actualmente.\n"
                    + "Indique el nuevo número de plantas:");
                        nuevoPlantas = input.nextInt();
                    hoteles.get(i).setPlantas(nuevoPlantas);
                    break;
                case 4:
                    System.out.println(hoteles.get(i).getNombre() + " tiene " + hoteles.get(i).getSuperficie() + "m2 actualmente. \n"
                            + "Indique el nuevo número de superficie en metros cuadrados:");
                        nuevoSuperficie = input.nextInt();
                    hoteles.get(i).setSuperficie(nuevoSuperficie);
                    break;
                case 5:
                    System.out.println("-----");
                    break;
            }
                
            
        }while (opcion != 5);
        }
    }
        //Se informa al usuario si el hotel no ha sido encontrado
        if (!existe){
          System.out.println("-----\nEl hotel indicado no ha sido encontrado en el sistema.");
        }
        return existe;
    }
 
 }
 

 



