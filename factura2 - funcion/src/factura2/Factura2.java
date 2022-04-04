/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura2;

import java.util.Scanner;

/**
 *
 * @author adhara
 */
public class Factura2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
        String[] numerosF = {"2021-001","2021-024","2021-037","2021-129"};
        String numFactura = "";
        String[] datosF;
        int opcion = 0,numF=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escoge que tipo de factura deseas generar: \n "
                + "1. Nacional \n"
                + "2. Europea con ROI \n"
                + "3. Europea sin ROI \n"
                + "4. Internacional");
        opcion = entrada.nextInt();
        if((opcion >= 1) && (opcion <= 4)){
            switch(opcion){
                case 1:
                    numFactura = calcularFactura(opcion,numerosF);
                    break;
                case 2:
                    numFactura = calcularFactura(opcion,numerosF);
                    break;
                case 3:
                    numFactura = calcularFactura(opcion,numerosF);
                    break;
                case 4:
                    numFactura = calcularFactura(opcion,numerosF);
                    break;
            }
            System.out.println("El nuevo numero és " + numFactura);
        } else {
            System.out.println("Debe indicar una opción valida");
        }
    }
    
    public static String calcularFactura(int opcion,String[] numerosF){
        String[] datosF;
        String numFactura;
        int numF;
        datosF = numerosF[(opcion - 1)].split("-");
        numF = Integer.parseInt(datosF[1]);
        numF++;
                    
        //Sistema para añadir ceros a la izquierda
        if(numF < 10){
            //necesitara dos ceros
            numFactura = datosF[0] + "-00" + String.valueOf(numF);
        } else if(numF < 100){
            //necesitara un cero
            numFactura = datosF[0] + "-0" + String.valueOf(numF);
        } else {
            numFactura = datosF[0] + "-" + String.valueOf(numF);
        }
        return numFactura;
    }
}