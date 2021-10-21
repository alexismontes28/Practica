/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_promedios;

import java.util.Scanner;

/**
 *
 * @author laex2
 */
public class EVA1_18_PROMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREAR UN PROGRAMA QUE CALCULE PROMEDIOS
        Scanner C = new Scanner(System.in);
        int[][] aiGrupos;
        //PREGUNTAMOS AL USUARIO LOS GRUPOS
        System.out.println("Cuantos grupos son?");
        int iNoGrupos = C.nextInt();
        //LOS GRUPOS REPRESENTAN LAS FILAS
        aiGrupos = new int[iNoGrupos][];
        for(int i = 0; i < aiGrupos.length; i++){
            System.out.println("Para el grupo" + i + " Cuantos estudiantes son?");
            int iNoEstu = C.nextInt();
            aiGrupos[1] = new int[iNoEstu];
        }
        
        //VAMOS A PREGUNTAR LA EDAD
        for(int i = 0; i < aiGrupos.length; i++){ //PRIMER DIMENSION DE FILAS
            for (int j = 0; j < aiGrupos[i].length; j++) {
             System.out.print("[" + "]");   
            }
        }
        System.out.println("");
        }
    }
    

