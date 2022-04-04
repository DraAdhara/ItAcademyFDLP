/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class Factura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fEspana = "2021-001";
        String fRoi = "2021-024";//la genera a partir de 24 porque al profe le gusta.
        String fSRoi = "2021-037";
        String fInt = "2021-129";
        String numFactura = "";
        String[] datosF;
        int opcion = 0, numF = 0;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Escoge que tipo de factura deseas generar: \n"
                + "1. Nacional \n"
                + "2. Europa con ROI \n"
                + "3. Europa sin ROI \n"
                + "4. Internacional");
         opcion = entrada.nextInt();
         if ((opcion >= 1) && (opcion <= 4)){
             switch (opcion){
                 case 1:
                     datosF = fEspana.split("-");
                     numF = Integer.parseInt(datosF[1]);
                     numF++; //le sumas una unidad
                     //Sistema para añadir los 0 que has perdido al pasar a Int del -001
                     if(numF < 10){
                         //necesitara dos ceros
                        numFactura = datosF[0] + "-00" + String.valueOf(numF);
                     } else if (numF <100){ // el limite por debajo ya está hecho en el if
                         //necesitara un cero
                         numFactura = datosF[0] + "-0" + String.valueOf(numF);
                     } else {
                         numFactura = datosF[0] + "-" + String.valueOf(numF);
                     }
                     fEspana = numFactura;
                      break;
                 case 2:
                     datosF = fRoi.split("-");
                     numF = Integer.parseInt(datosF[1]);
                     numF++; //le sumas una unidad
                     //Sistema para añadir los 0 que has perdido al pasar a Int del -001
                     if(numF < 10){
                         //necesitara dos ceros
                        numFactura = datosF[0] + "-00" + String.valueOf(numF);
                     } else if (numF <100){ // el limite por debajo ya está hecho en el if
                         //necesitara un cero
                         numFactura = datosF[0] + "-0" + String.valueOf(numF);
                     } else {
                         numFactura = datosF[0] + "-" + String.valueOf(numF);
                     }
                     fRoi = numFactura;
                     break;
                 case 3: 
                     datosF = fSRoi.split("-");
                     numF = Integer.parseInt(datosF[1]);
                     numF++; //le sumas una unidad
                     //Sistema para añadir los 0 que has perdido al pasar a Int del -001
                     if(numF < 10){
                         //necesitara dos ceros
                        numFactura = datosF[0] + "-00" + String.valueOf(numF);
                     } else if (numF <100){ // el limite por debajo ya está hecho en el if
                         //necesitara un cero
                         numFactura = datosF[0] + "-0" + String.valueOf(numF);
                     } else {
                         numFactura = datosF[0] + "-" + String.valueOf(numF);
                     }
                     fSRoi = numFactura;
                     break;
                 case 4:
                      datosF = fInt.split("-");
                     numF = Integer.parseInt(datosF[1]);
                     numF++; //le sumas una unidad
                     //Sistema para añadir los 0 que has perdido al pasar a Int del -001
                     if(numF < 10){
                         //necesitara dos ceros
                        numFactura = datosF[0] + "-00" + String.valueOf(numF);
                     } else if (numF <100){ // el limite por debajo ya está hecho en el if
                         //necesitara un cero
                         numFactura = datosF[0] + "-0" + String.valueOf(numF);
                     } else {
                         numFactura = datosF[0] + "-" + String.valueOf(numF);
                     }
                     fInt = numFactura;
                     break;
             }
            System.out.println("El nuevo número " + numFactura + ".");
         } else {
             System.out.println("Debe indicar una opción valida.");
         }
    }
    
}
