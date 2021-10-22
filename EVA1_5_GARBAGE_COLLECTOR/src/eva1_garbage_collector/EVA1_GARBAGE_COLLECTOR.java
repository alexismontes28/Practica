/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_garbage_collector;

/**
 *
 * @author laex2
 */
public class EVA1_GARBAGE_COLLECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj);
        //ELIMINAMOS EL OBJETO
        obj = null;
        System.out.println(obj);
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