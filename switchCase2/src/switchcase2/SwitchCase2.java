/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcase2;

/**
 *
 * @author adhara
 */
public class SwitchCase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("linea 18");
        int ascensor = 2;
        String respuesta = "";
        switch(ascensor) {
        case 0: //en caso que el valor coincida con 0
                respuesta = "Menage";
                //System.out.println(ascensor);
                break; //con break indicamos que salimos de case 0
            case 1:
                respuesta = "Deporte";
                break;
            case 2:
                respuesta = "Moda invierno";
                break;
            case 3:
                respuesta = "Muebles";
                break;
            default:
                respuesta = "Indica otra opción";
                break;
        }
        System.out.println(respuesta);
    }
    
}
