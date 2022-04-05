/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m7.pkg3ex4;


import java.util.Scanner;
        
/**
 *
 * @author adhara
 */
public class M73ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        L’usuari ha d’introduir un DNI i el programa ha de dir si la lletra és correcte 
    o no amb el nombre de DNI. Si la lletra no és correcta, ha de dir quina lletra és la correcta.
    Per calcular la lletra DNI has de prendre el número de DNI a verificar i dividir-lo entre 23. 
    La resta es reemplaça per una lletra que ja està assignada a aquest nombre mitjançant la taula adjunta:.
    */
     
    String dniN, dniL, DNI, respuesta;
    int resto;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Introduzca su DNI para comprobar si es correcto");
        DNI = input.nextLine();
        
           dniL = DNI.substring(DNI.length()-1);
           dniN = DNI.substring(0, DNI.length()-1);
        
          resto = (Integer.valueOf(dniN) % 23);
          respuesta = verificaLetra(resto, dniL);  
           
           System.out.println(respuesta);
           }
    
  public static String verificaLetra (int resto, String dniL){
       String respuesta; 
  
        switch (resto){
              case 0:
                  if ("T".equals(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra T.";
                  }
                  break;
              case 1:
                  if ("R".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra R.";
                  }
                  break;
              case 2:
                  if ("W".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra W.";
                  }
                  break;
               case 3:
                  if ("A".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra A.";
                  }
                  break;
                case 4:
                  if ("G".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra G.";
                  }
                  break;
                case 5:
                  if ("M".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra M.";
                  }
                  break;
                case 6:
                  if ("Y".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra Y.";
                  }
                  break;
                case 7:
                  if ("F".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra F.";
                  }
                  break;
                case 8:
                  if ("P".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra P.";
                  }
                  break; 
                case 9:
                  if ("D".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra D.";
                  }
                  break; 
                case 10:
                  if ("X".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra X.";
                  }
                  break;   
                case 11:
                  if ("B".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra B.";
                  }
                  break;   
                case 12:
                  if ("N".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra N.";
                  }
                  break; 
                case 13:
                  if ("J".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra J.";
                  }
                  break; 
                case 14:
                  if ("Z".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra Z.";
                  }
                  break; 
                case 15:
                  if ("S".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra S.";
                  }
                  break;  
                case 16:
                  if ("Q".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra Q.";
                  }
                  break; 
                case 17:
                  if ("V".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra V.";
                  }
                  break; 
                case 18:
                  if ("H".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra H.";
                  }
                  break; 
                case 19:
                  if ("L".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra L.";
                  }
                  break; 
                case 20:
                  if ("C".equalsIgnoreCase(dniL)){
                    respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra C.";
                  }
                  break; 
                case 21:
                  if ("K".equalsIgnoreCase(dniL)){
                         respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra K.";
                  }
                  break; 
                case 22:
                  if ("E".equalsIgnoreCase(dniL)){
                      respuesta = "El DNI es correcto.";
                  } else {
                      respuesta =  "El DNI no es correcto. Deberia acabar con la letra E.";
                  }
                  break; 
                default:
                      respuesta = "El DNI introducido no es correcto.";
                  
    }
        return respuesta;
  }
}


