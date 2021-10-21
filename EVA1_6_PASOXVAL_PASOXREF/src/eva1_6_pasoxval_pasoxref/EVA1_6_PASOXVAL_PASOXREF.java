/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_pasoxval_pasoxref;

/**
 *
 * @author laex2
 */
public class EVA1_6_PASOXVAL_PASOXREF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 int valorig = 5;
System.out.println("Valorig en el main = "+ valorig); 
incrementa(valorig);
System.out.println("Valorig desoues de llamar a incrementa = " + valorig); 

Prueba objPrueba = new Prueba();
    System.out.println("Valor de la x =  " + objPrueba.x);
        System.out.println("objPrueba en el main = "+ objPrueba);
        incrementaobj (objPrueba);
        System.out.println("Valor de x despues de la incrementa = "+ objPrueba.x);
    }
//paso por valor  --> pasamos una copia del valor en una variable (variales locales primitivas)
public static void incrementa (int val) {
    val++;
    System.out.println("Valor en incrementa =  " + val);
}
public static void incrementaobj (Prueba val){
    System.out.println("Objeto en incremento ="+val);
    val.x++;
}
public static int incrementaquesifunciona(int val){
    val++;
    return val;
}
//Paso por referencia --> pasan la direccion en memoria del objeto(objetos)
    }
    class Prueba{
        public int x = 10;
    }

