/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg1ex1;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class M71ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea un programa on l’usuari introdueix tres notes i el programa 
        calcula la mitja. Si la mitja és inferior a 5 ha de mostrar el següent 
        missatge per pantalla: “No has superat el curs. Has de recuperar”, 
        si la mitja està entre 5 i 7 ha de mostrar: “Enhorabona! Has aprovat
        però hauries de seguir practicant”, si la mitja és superior a 7 ha de mostrar: 
        ”Enhorabona! Has superat el curs! Passa ja al següent nivell!
        */
        
        int nota1, nota2, nota3, notaMedia;
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota:");
            nota1 = entrada.nextInt();
        System.out.println("Introduce la segunda nota:");
            nota2 = entrada.nextInt();
        System.out.println("Introduce la tercera nota:");
            nota3 = entrada.nextInt();
        
        notaMedia = ((nota1 + nota2 + nota3) / 3);
        
        if (notaMedia < 5){
            respuesta = ("No has superado el curso, tienes que recuperar.");
        } else if ((notaMedia >=5) && (notaMedia <= 7)){
            respuesta = ("Enhorabuena, has superado el curso pero tendrías que seguir practicando.");
        } else {
            respuesta = ("Enhorabuena, has superado el curso! Pasa al siguiente nivel.");
        }
        
        System.out.println(respuesta);
    }
    
}
