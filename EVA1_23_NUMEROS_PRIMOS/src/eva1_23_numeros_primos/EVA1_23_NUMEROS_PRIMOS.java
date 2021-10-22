/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author laex2
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner C = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int iVal = C.nextInt();
        for (int i = 2; i < iVal; i++) {
            //Division entre iVal/i
            //Si la division es exacta --> terminamos no es primo
            //si terminamos el for sin dividir exactamente es: primo
            int iDivision = iVal%i;
            if (iDivision == 0)
                System.out.println("El numero es primo.");
            else if(i%iVal ==2)
                System.out.println("El numero no es primo");   
        //imprimir si es primo o no
        }
    }
    
}
