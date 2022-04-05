/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m8.pkg3;

/**
 *
 * @author adhara
 */
public class Cuentas {
    int numCuenta = 1111, saldo;
    static int sigCuenta = 1111;

//metodo constructor
public Cuentas (){
    //super(nombre,apellido);

    this.numCuenta = this.sigCuenta;
    this.sigCuenta++;
    this.saldo = 0;
}
//metodos getter
public int getNumCuenta(){
    return this.numCuenta;
}
public int getSaldo(){
    return this.saldo;
}   
//metodos setter
 

public void setNumCuenta(int numCuenta){
    this.numCuenta = numCuenta;
}
public void setSaldo(int saldo){
    this.saldo = saldo;
}


//resto de metodos

    
/*public Cuentas nuevaCuenta (){
    
    this.numCuenta = sigCuenta;
    sigCuenta++;
    this.saldo = 0;
    
    Cuentas cuenta = new Cuentas(this.numCuenta,this.saldo);
return cuenta;
}
*/
public void ingresar(int cantidad){
    this.saldo = this.getSaldo() + cantidad;
}
public void retirar(int cantidad){
    this.saldo = this.getSaldo() - cantidad;
}
}

