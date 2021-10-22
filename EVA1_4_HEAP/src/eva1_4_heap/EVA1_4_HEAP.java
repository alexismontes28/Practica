/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_heap;

/**
 *
 * @author laex2
 */
public class EVA1_4_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj);  //IMPRIMIMOS LA REFERENCIA DEL OBJETO EN EL HEAP
        MiClase obj2 = new MiClase();
        System.out.println(obj2); //IMPRIMIMOS LA REFERENCIA DEL OBJETO EN EL HEAP
        EVA1_4_HEAP objHeap = new EVA1_4_HEAP();
        System.out.println(objHeap); //IMPRIMIMOS LA REFERENCIA DEL OBJETO EN EL HEAP
    }
}

class MiClase{ //NUEVO TIPO DE DATO --> TIPO DE DATO ABSTRACTO
        String mensaje; //ATRIBUTOS  -> ESTADO DEL OBJETO
        public MiClase(){ //METODOS -> COMPORTAMIENTO
            mensaje = "Hola mundo";
        }
        
        public String getMensaje(){
            return mensaje;
        }
        
        public void setMensaje(){
            this.mensaje = mensaje; 
        }
    }
