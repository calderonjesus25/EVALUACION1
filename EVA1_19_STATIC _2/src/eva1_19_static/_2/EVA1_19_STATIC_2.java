/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_static._2;

/**
 *
 * @author yisus
 */
public class EVA1_19_STATIC_2 {
int x = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("x");
        //mensajeNoestatico();
        EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
        System.out.println("obj.x");
        obj.mensajeNoestatico();
    }
   public void mensajeNoestatico(){//NO EXISTE
       System.out.println("MENSAJE NO ESTATICO");
       
   }
   public void mensajeEstatico(){//EXISTE AL INICIAR EL PROGRAMA
       System.out.println("MENSAJE NO ESTATICO");
   }
}
