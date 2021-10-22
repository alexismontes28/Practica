/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author laex2
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PRIMERO PREGUNTAR EL TAMA;O DEL GRUPO:
        Scanner C = new Scanner(System.in);
        System.out.println("Indica el tamano del grupo: ");
        int iTama = C.nextInt();
        int aiEdades[] = new int[iTama]; //DECLARAR EL ARREGLO DE TAMA;O iTama
        for (int i = 0; i < aiEdades.length; i++) { //DESDE EL PRIMER ELEMENTO(CERO) AL ULTIMO (N-1)
            System.out.println("Edad: ");
            aiEdades[i] = C.nextInt();            
        }
        for (int i = 0; i < aiEdades.length; i++) { 
            System.out.print("[ " + aiEdades[i] + "]");
            
        }
    }
    
}
