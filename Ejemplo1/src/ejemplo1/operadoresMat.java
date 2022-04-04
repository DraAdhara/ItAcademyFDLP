/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author adhara
 */
public class operadoresMat {
    public static void main(String[] args){
        int num1  = 8;
        int num2 = 2;
        //num1 = num1 + 2; le pongo // para que no lea el código
        //ahora num1 es 10, pero puedes usar el operador matematico compuesto
        num1 += 2;
        //utilizamos ++ como incrementador unitario
        // num1++; puesto como comentario para que no lo lea
        //al poner ++ después de num1, se incrementará después de usar la variable.
        // int  num3 = num1++ + num2; puesto como comentario para que no lo lea
        
        System.out.println(num1);
        //int num3 = num1++ + num2; incrementa posterior al ir ++ despues del num1
        int num3 = ++num1 + num2; //incremento anterior ya que ++ va antes del num1
        System.out.println(num3);
        System.out.println(num1);
    }
    
}
