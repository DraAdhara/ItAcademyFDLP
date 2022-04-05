/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m8.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M83 {
static Scanner input = new Scanner(System.in);
static ArrayList<Clientes> clientes = new ArrayList<Clientes>();
static int indice;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Programa una aplicació que tingui programades totes les opcions del següent menú:

0.- Sortir de l'aplicació
1.- Crear client
2.- Eliminar client
3.- Crear compta d'un client
4.- Ingresar euros en una compta d'un client
5.- Retirar euros en una compta d'un client
A tenir en compte:
- El saldo inicial de totes les comptes ha de ser 0€
- Al crear un client, no haurà de tenir cap compte "associada"
- El diagrama UML mostrà les propietats i mètodes mínims que han de tenir les classes, però pots crear-ne més si és necessari.
*/
        
        //clientes.add(new Clientes("Han", "Solo"));//cliente de prueba
        //ArrayList<Cuentas> cuentas = new ArrayList<Cuentas>();
        int opcion = 0;
        
        
        System.out.println("Bienvenido a GESTBANK 2000");
            
        do{
            System.out.println("-----\nIndca una de las siguientes opciones:\n0. -Salir de la aplicación"
                    + "\n1. -Crear cliente\n2. -Eliminar cliente\n3. -Crear cuenta de cliente"
                    + "\n4. -Ingresar € en una cuenta de un cliente\n5. -Retirar € de una cuenta de un cliente. ");
            opcion = input.nextInt();
         
            switch (opcion){
                case 0:
                    System.out.println("-----\nGracias por utilizar GESTBANK 2000.\n-----");
                    break;
                case 1:
                    crearCliente();
                    break;
                case 2:
                   eliminarCliente();
                    break;
                case 3: 
                    crearCuenta();
                    break;
                case 4:
                    ingresarDinero();
                    break;
                case 5:
                    retirarDinero();
                    break;
                default: 
                    System.out.println("Opción no válida.");
                    break;
            }
                
        }while (opcion != 0);
        
        
        }
  //Creamos un metodo para buscar objetos cliente dentro del ArrayList clientes
  public static Clientes buscarCliente(){
   String nombre, apellido;
   Clientes c = null;
   boolean clienteEncontrado = false;
    //Se pide el nombre del cliente
    System.out.println("Indica el nombre del cliente:");
            nombre = input.next();
    System.out.println("Indica ahora el apellido del cliente:");
                apellido = input.next();
    //recorremos el ArraList clientes en busqueda del cliente indicado por el usuario
    for (int i = 0; i < clientes.size() && clienteEncontrado == false ; i++) {
            c = clientes.get(i);
            
        //Si coinciden nombre y apellido del cliente
        if ((c.getNombre().equalsIgnoreCase(nombre)) && (c.getApellido().equalsIgnoreCase(apellido))){
            indice = i;
           clienteEncontrado = true;
                
        }else {              
     
           c = null;       
        }
        
    }
  
      return c; 
  }
  public static boolean crearCliente(){  
    String nombre, apellido;
    Clientes cliente = new Clientes();//pendiente 
    //se piden los datos necesarios para crear el nuevo objeto Cliente
    System.out.println("Indica el nombre del nuevo cliente:");
        nombre = input.next();
    cliente.setNombre(nombre);
    System.out.println("Indica el apellido del nuevo cliente:");
        apellido = input.next();
    cliente.setApellido(apellido);
    System.out.println("-----\nEl cliente " + nombre + " " + apellido + " ha sido añadido al sistema correctamente.");
    
    //Se añade el nuevo objeto cliente al ArrayList Clientes con los parametros introducidos por el usuario.
  return clientes.add(cliente);  
}  
  public static void eliminarCliente(){
    
        if (buscarCliente() == null){
            System.out.println("-----\nEl cliente no ha sido encontrado.");
        }else{
        System.out.println("-----\nEl cliente " + clientes.get(indice).getNombre() + " " + clientes.get(indice).getApellido() +
                " ha sido eliminado del sistema");
        clientes.remove(indice);
        
        }
        }
public static void crearCuenta(){
    
         Clientes c = buscarCliente();
        if (c == null){
            System.out.println("-----\nEl cliente no ha sido encontrado.");
        }else{
            
        Cuentas cuenta1 = new Cuentas();  
        c.setCuenta(cuenta1);
        
        System.out.println("Nueva cuenta creada para el cliente " +  c.getNombre() + " " + c.getApellido() + ".");
        }
       
        
}

   
public static void ingresarDinero(){
     int cantidad, cuenta;
     Cuentas c;
     Clientes cc = buscarCliente();
     
     if (cc == null){
         System.out.println("El cliente no ha sido encontrado");
     }else{
     System.out.println("Indica el numero de cuenta en la que deseas ingresar:");
        for (Cuentas x : cc.getCuentas()){
            System.out.println("Numero de cuenta: " + x.getNumCuenta());
        }
    
            cuenta = input.nextInt();
            
            for (int i = 0; i < cc.getCuentas().size(); i++) {
                 c = cc.getCuentas().get(i);
            
                //si la cuenta introducida coincide con una cuenta del cliente
                if ((c.getNumCuenta()) == cuenta){ 
                     System.out.println("Indica la cantidad de que deseas retirar:");
                            cantidad = input.nextInt();
                     cc.getCuentas().get(i).ingresar(cantidad);
                    System.out.println("El saldo de la cuenta es " + cc.getCuentas().get(i).getSaldo());
                } else{
                    System.out.println("Cuenta no localizada");
                }      
            }
    }
}
 public static void retirarDinero(){
     int cantidad, cuenta;
     Cuentas c;
     Clientes cc = buscarCliente();
     
     if (cc == null){
         //si el cliente no ha sido encontrado
         System.out.println("El cliente no ha sido encontrado");
     }else{
     System.out.println("Indica el numero de cuenta en la que deseas ingresar:");
        for (Cuentas x : cc.getCuentas()){
            System.out.println("Numeros de cuenta: " + x.getNumCuenta());
        }
    
            cuenta = input.nextInt();
            
            for (int i = 0; i < cc.getCuentas().size(); i++) {
                 c = cc.getCuentas().get(i);
            
                //si la cuenta introducida coincide con una cuenta del cliente
                if ((c.getNumCuenta()) == cuenta){ 
                     System.out.println("Indica la cantidad de que deseas ingresar:");
                            cantidad = input.nextInt();
                     cc.getCuentas().get(i).retirar(cantidad);
                    System.out.println("El saldo de la cuenta es " + cc.getCuentas().get(i).getSaldo());
                } else{
                    System.out.println("Cuenta no localizada");
                }      
            }
 }
 }
}
  
  

