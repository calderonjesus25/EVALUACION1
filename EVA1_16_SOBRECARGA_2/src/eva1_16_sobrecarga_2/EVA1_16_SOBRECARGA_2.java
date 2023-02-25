/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_sobrecarga_2;

/**
 *
 * @author invitado
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma: " + suma(4, 9));
        System.out.println("Suma: " + suma(4.0, 9.0));
        System.out.println("Suma: " + suma("Hola", "Mundo!!"));
        suma();
    }
    //SUMA DE DOS NUMEROS ENTEROS
                      //suma(int, int)
    public static int suma(int va11, int va12){
    return va11 + va12;
}            //suma(double, double)
    public static double suma(double va11, double va12){
    return va11 + va12;
}                  //suma(string, string)
     public static String suma(String va11, String va12){
    return va11 + va12;
}     
                     //suma()
     public static void suma(){
         System.out.println("suma: sin argumentos");
     }
}
