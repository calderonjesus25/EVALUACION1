/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_static;

/**
 *
 * @author yisus
 */
public class EVA1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        prueba obj = new Prueba();
        obj.mensajeEstatico();
        System.out.println("PI" + Math.PI);
    }
    
}
class Prueba{
    public void mensaje(){//SOLO AL CREAR OBJETOS
        System.out.println("Hola!!");
    }
    public static void mensajeEstatico(){//DIRECTAMENTE DE LA CLASE
        System.out.println("Hola (estatico)!!!");
    }
}

