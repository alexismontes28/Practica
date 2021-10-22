/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_lenght;

/**
 *
 * @author laex2
 */
public class EVA1_10_LENGHT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiDatos = new int[100];
        System.out.println("Tamano de arreglo: " + aiDatos.length);
        System.out.println(aiDatos);
        for (int i = 0; i < aiDatos.length; i++) {
        }
        
        for (int i = 0; i < aiDatos.length; i++) {    
            aiDatos[i] = (int)(Math.random() * 100); 
            System.out.print("[" + aiDatos[i] + "]");
        }
    }
    
}
