/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m8.pkg1.claseyobjeto1;

/**
 *
 * @author adhara
 */
public class M81ClaseYObjeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    /*Crea un nou projecte Java amb una classe anomenada "Ordinador", a més a més de la classe que conté el main. 

Aquesta classe tindrà com a atributs la marca, el model, el processador, la quantitat de memòria RAM i la capacitat del disc dur.

L'aplicació ha de poder generar ordinadors de diferents maneres: 

Només a partir de la marca i el model

Indicant tots els atributs.

La classe Ordinador ha de disposar dels següents mètodes:

mètodes que permetin consultar cadascun dels atributs
mètodes que permetin modificar el processador, la quantitat de memòria ram i la capacitat del disc dur
un mètode que rebrà un string per paràmetre i retornarà un string que digui: "En aquests moments s'està executant: 'X'" (X és el paràmetre rebut pel mètode i que normalment serà el nom d'un programa) Exemple: "En aquests moments sèstà executant: Eclipse" 
un mètode que retornarà una descripció completa de l'ordinador (toString()).
Al main del projecte crea ordinadors de les 2 maneres possibles i comprova que els mètodes creats funcionen correctament.
*/
        
Ordenador ordenador1 = new Ordenador ("Apple", "Macbook Air");
Ordenador ordenador2 = new Ordenador ("HP", "Inventado", "Intel Core i5", 16, "1TB");

//Imprimo la marca del objeto ordenador1 para probar getMarca
System.out.println(ordenador1.getMarca());

//Modifico el parametro RAM del objeto ordenador2
ordenador2.setRAM(8);
//Imprimo la descripcion del objeto ordenador2 usando el metodo descripcion, vemos el nuevo valor de RAM
System.out.println(ordenador2.toString());

//Llamamos al método ejecutando pasandole el parametro "Apache NetBeans"
System.out.println(ordenador1.ejecutando("Apache NetBeans"));
}
    
}
    
   
    
