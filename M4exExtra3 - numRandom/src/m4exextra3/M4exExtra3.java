/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m4exextra3;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M4exExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Aquesta línia de codi: 
      int numRandom = (int)(Math.random() * 3) + 1; 
retorna un número entre el 1 i el 3 de forma aleatòria.

Escriu un programa que et permet jugar pedra, paper o tisora ​​amb l'ordinador.

Per a això l'ordinador haurà de generar un nombre aleatori entre 1 i 3 que representi pedra, paper o tisora 
        ​​respectivament, i l'usuari haurà de respondre al seu torn amb un un nombre entre l'1 i el 3 després de mostrar la següent pantalla:

Juguem a pedra, paper o tisora:

1. Pedra

2. Paper

3. Tisora

Tria (1-3):


Si l'usuari indica algun nombre diferent del sol·licitat, haurà d'aparèixer el següent missatge:
«Entenc que no vols jugar. Adéu» 

En cas contrari, indicar el guanyador de la següent manera:

Jo xxx i tu xxx. He guanyat! o Has guanyat!

segons sigui el cas.

Exemple:

«Jo paper i tu tisora. Has guanyat!»
        **El paper guanya la pedra perquè l’embolica; les tisores guanyen el paper perquè el tallen,
        i la pedra guanya les tisores perquè les espatllen.

*/
    int opcionUsuario, opcionOrdenador;
        String opcionUsuarioTexto = "", opcionOrdenadorTexto = "", respuesta = "", usuario;
        opcionOrdenador = (int)(Math.random() * 3) + 1; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Juguem a pedra, paper o tisora:\n" + "\n" + "1. Pedra\n" + "\n" + "2. Paper\n" + "\n" + "3. Tisora");
        opcionUsuario = entrada.nextInt();
        
        //si ponemos un numero fuera de rango
        if((opcionUsuario >=1) && (opcionUsuario <=3)){
            if(((opcionUsuario ==2) && (opcionOrdenador == 1))|| ((opcionUsuario == 3) && (opcionOrdenador == 2)) || ((opcionUsuario == 1) && (opcionOrdenador == 3))){
                //el jugador gana
                respuesta = "Has ganado";
             }else if (((opcionOrdenador ==2) && (opcionUsuario == 1))|| ((opcionOrdenador == 3) && (opcionUsuario == 2)) || ((opcionOrdenador == 1) && (opcionUsuario == 3))){
                 //el ordenador gana
                 respuesta = "Has perdido";
             }else if (((opcionUsuario ==1) && (opcionOrdenador == 1))|| ((opcionUsuario == 2) && (opcionOrdenador == 2)) || ((opcionUsuario == 3) && (opcionOrdenador == 3))){
                 //empate
                 respuesta = "Empate";
             }

            switch(opcionUsuario) {
                case 1:
                    opcionUsuarioTexto = "Piedra";
                    break;
                case 2:
                    opcionUsuarioTexto = "Papel";
                    break;
                case 3:
                    opcionUsuarioTexto = "Tijera";
                    break;
            }

            switch(opcionOrdenador) {
                case 1:
                    opcionOrdenadorTexto = "Piedra";
                    break;
                case 2:
                    opcionOrdenadorTexto = "Papel";
                    break;
                case 3:
                    opcionOrdenadorTexto = "Tijera";
                    break;
            }
            System.out.println("Yo " + opcionOrdenadorTexto + " tu " + opcionUsuarioTexto + ". " + respuesta );
           
        } else {
            System.out.println("Entiendo que no quieres jugar");   
        
    }
    
}
}
