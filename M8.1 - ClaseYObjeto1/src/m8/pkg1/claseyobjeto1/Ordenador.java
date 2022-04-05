/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m8.pkg1.claseyobjeto1;

/**
 *
 * @author adhara
 */
public class Ordenador {
    
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
// Defino los atributos
String marca;
String modelo;
String procesador;
/* genero el parámetro RAM con int para usar otro tipo de dato, aunque en realidad usaria 
String para poder poner por ejemplo 16gb. Lo pondré como texto 
*/
int RAM;
String DiscoDuro;

//Defino metodo constructor 1
public Ordenador (String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
    this.procesador = "";
    this.RAM = 0;
    this.DiscoDuro = "";
}
//Defino metodo constructor 2
public Ordenador (String marca, String modelo, String procesador, int RAM, String DiscoDuro){
    this.marca = marca;
    this.modelo = modelo;
    this.procesador = procesador;
    this.RAM = RAM;
    this.DiscoDuro = DiscoDuro;
}   
//Defino metodos getter

public String getMarca (){
    return this.marca;
}
public String getModelo (){
    return this.modelo;
}
public String getProcesador(){
    return this.procesador;
}
public int getRAM (){
    return this.RAM;
}
public String getDiscoDuro (){
    return this.DiscoDuro;
}
//Defino metodos setter

/*public void setMarca (String marca){
    this.marca = marca;
}

public void setModelo (String modelo){
    this.modelo = modelo;
}
*/

public void setProcesador (String procesador){
    this.procesador = procesador;
}

public void setRAM (int RAM){
    this.RAM = RAM;
}

public void setDiscoDuro (String DiscoDuro){
    this.DiscoDuro = DiscoDuro;
}

//Defino los restantes métodos

@Override //indica sobreescritura
public String toString (){
    
    return ("Hola, soy un ordenador " + this.marca + " modelo " + this.modelo + ", con procesador "
    + this.procesador + ", una memoria RAM de " + this.RAM + "GB y un disco duro de " + this.DiscoDuro + ".");
}

public String ejecutando (String programa){
    return ("En este momento se está ejecutando: " + programa + ".");
}
}
