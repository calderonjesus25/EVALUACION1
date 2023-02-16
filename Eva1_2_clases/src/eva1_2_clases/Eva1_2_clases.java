/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases;

/**
 *
 * @author yisus
 */
public class Eva1_2_clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Clase es la receta
        //objeto es el platillo
        //instanciacion
        //1. declarar e identificador
        //2. asignar memoria con new
        //3. invocar su constructor
        //persona() --> metodo
        Persona perso1 = new Persona();
        //system.out.println(perso1)
        perso1.nombre= "Jesus";
        perso1.Apellido= "Calderon";
        perso1.edad= 18;
        perso1.estadoCivil= true; //true es casado
        
        System.out.println(perso1.nombre);
        System.out.println("Jesus Calderon");
        System.out.println(perso1.getNombre());
        perso1.imprimirDatos();
        
        //perso2
        Persona perso2 = new Persona();
        perso2.setNombre("Ludim");
        perso2.setApellido("Rios");
        perso2.setEdad(19);
        perso2.setEstadoCivil(true);
        perso2.imprimirDatos();
    }
}
