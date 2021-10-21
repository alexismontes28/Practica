/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_copia_arreglos;

/**
 *
 * @author laex2
 */
public class EVA1_14_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int[] iArreglo = new int[3]; //12 bytes -->3 enteros x 4 bytes
        System.out.println("Direccion de arreglo:"+ iArreglo);
        iArreglo[0] = 100;
        iArreglo[1] = 200;
        iArreglo[2] = 300;
        for( int i = 0; i < iArreglo.length ; i++) {
         System.out.println("CUENTA(iArreglo) " + i + " =$ " + iArreglo[i]);
        }
        //CREAR UNA COPIA DEL ARREGLO
        int [] iCopia = iArreglo;
    }
    
}
