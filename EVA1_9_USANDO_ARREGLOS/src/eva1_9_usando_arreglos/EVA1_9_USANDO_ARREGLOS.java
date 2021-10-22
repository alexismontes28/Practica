 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_usando_arreglos;

/**
 *
 * @author laex2
 */
public class EVA1_9_USANDO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.UN ARREGLO DE ENTEROS
        int[] aiDatos = new int[10];
        //2. LLENAR CON VALORES
        //ARREGLO: ESTRUCTURA DE ACCESO ALEATORIO
        //INDICE
        //PRIMER ELEMENTO DEL ARTREGLO: 0 
        //ULTIMO ELEMENTO DE; ARREGLO: N-1 (N ES EL TAMA;O DEL ARREGLO)
        //ACCESO A VALORES
        
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 100);
        }
        /* aiDatos[0] = 50;
        aiDatos[1] = 200;
        aiDatos[2] = 100;
        System.out.println(aiDatos[0]); */ 
        //3. IMPRIMIR LOS VALORES
        for (int i = 0;  i < 10;  i++) {
            System.out.print("[" + aiDatos[i] + "]");
            
        }
    }
    
}
