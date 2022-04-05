/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m8.pkg2mainhoteles;

/**
 *
 * @author adhara
 */
public class Hoteles {
      /*Ens demanen crear una aplicació per donar d’alta, modificar, veure i eliminar hotels.
La classe hotel haurà de tenir els següents atributs: nom, nombre d’habitacions, nombre de plantes i superfície total de l’hotel. Com a mètodes només haurà de tenir els getters i setters propis de la classe i un mètode anomenat calcularManteniment(). Aquest mètode ha de tenir en compte que cada persona del servei pot atendre 20 habitacions i haurà de mostrar quantes persones són necessàries per atendre el servei d’habitacions de l’hotel i quin és el cost total destinat al servei sabent que aquestes persones cobren 1.500€ al mes. 
El mètode crearHotel() haurà de demanar a l’usuari que introdueixi per pantalla les dades de nom,  nombre d’habitacions, nombre de plantes i superfície total de l’hotel (o haurà de rebre aquestes dades per paràmetre). Un cop hagi demanat totes aquestes dades, s’ha d’instanciar l’objecte de la classe i afegir-lo a un array d’hotels.
El mètode donarDeBaixaHotel() haurà de rebre el nom de l'hotel que es vol donar de baixa. L’usuari introduirà el nom de l’hotel i si l’hotel està dintre de l’array, l’eliminarem i mostrarem un missatge per pantalla informant l’usuari que hem eliminat l’hotel. Si no hem trobat l’hotel dintre de l’array, avisarem l’usuari dient que l’hotel no estava dintre de la nostra aplicació.
El mètode veureHotel() haurà de rebre el nom de l'hotel que vol que mostrem per pantalla, si l’hotel està a la nostra aplicació, li mostrarem l’hotel, si no hi és, informarem l’usuari dient que l’hotel que ens ha demanat no està dintre de la nostra aplicació.
Quan mostrem l’hotel, a més, de mostrar el nombre d’habitacions, nombre de plantes i superfície total de l’hotel també es cridarà al mètode calcularManteniment().
El mètode modificarHotel() haurà de rebre el nom de l'hotel que volem modificar. L’usuari introduirà el nom de l’hotel. Si el tenim a l’aplicació, li demanarem si vol modificar el nombre d’habitacions, el nombre de plantes o la superfície total de l’hotel. Farem la modificació pertinent i avisarem a l’usuari que la modificació s’ha realitzat.
*/   

//Se definen los atributos
String nombre;
int habitaciones, plantas, superficie;

//método constructor
public Hoteles (String nombre, int habitaciones, int plantas, int superficie){
    this.nombre = nombre;
    this.habitaciones = habitaciones;
    this.plantas = plantas;
    this.superficie = superficie;
}
//metodos getter

public String getNombre(){
    return this.nombre;
}
public int getHabitaciones(){
    return this.habitaciones;
}
public int getPlantas(){
    return this.plantas;
}
public int getSuperficie(){
    return this.superficie;
}

//metodos setter
 
public void setNombre(String nombre){
     this.nombre = nombre;
 }
 public void setHabitaciones(int habitaciones){
     this.habitaciones = habitaciones;
 }
 public void setPlantas(int plantas){
     this.plantas = plantas;
 }
 public void setSuperficie(int superficie){
     this.superficie = superficie;
 }
 
 // resto de metodos
 
 //Metodo para calcular el coste del servicio de habitaciones, 20 es habitaciones por persona y 1500 lo que cobra cada persona
 public String calculoMantenimiento(int habitaciones){
 int personas, costeMantenimiento;
 
 personas = (habitaciones / 20);
 costeMantenimiento = (personas * 1500);
 
 String pers = Integer.toString(personas);
 String cost = Integer.toString(costeMantenimiento);
 
 return "Se necesitan " + pers + " personas para el servicio de habitaciones del hotel, con un coste de " + cost + " de euros.";
 }
 //metodo para presentar todos los parametros de un hotel
@Override
 public String toString (){
         return ("-----\nEl hotel " + this.nombre + " tiene un total de " + this.habitaciones +
                 " habitaciones repartidas en " + this.plantas + " plantas, con una superficie total de "
                 + this.superficie + "m2. " + calculoMantenimiento(this.habitaciones));
 } 

}

