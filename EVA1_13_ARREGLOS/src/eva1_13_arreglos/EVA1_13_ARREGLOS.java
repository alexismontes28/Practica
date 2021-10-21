/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_arreglos;

/**
 *
 * @author laex2
 */
public class EVA1_13_ARREGLOS {

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
         System.out.println("CUENTA " + i + " =$ " + iArreglo[i]);
        }
        
        //CREAMOS UNA NUEVA VARIABLE TIPO ARREGLO
        int[] iCopia = iArreglo;
    System.out.println("Direccion de iCopia" + iCopia);
    
    iArreglo = new int[2];
       System.out.println("Direccion de arreglo modificado= " +iArreglo );
       for (int i = 0; i < iArreglo.length ; i++) {
           System.out.println("Cuenta modificada"+ iArreglo );
       }
    } 
    
}
