/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_4_dimensiones;

/**
 *
 * @author laex2
 */
public class EVA1_20_4_DIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][][][] iTese = new int [5][3][2][6];
        //CUANTO ALMACENA? = 180 ENTEROS
        for (int i = 0; i < iTese.length; i++) { //primera dimension
            for (int j = 0; j < iTese[i].length; j++) { //segunda
                for (int k = 0; k < iTese[i][j].length; k++) { //tercera
                    for (int l = 0; l < iTese[i][j][k].length; l++) { // cuarta
                        iTese[i][j][k][l]= 100;
                        
                    }
                    
                }
                
            }
            
        }
    }
    
}
