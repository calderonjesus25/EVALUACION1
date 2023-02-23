/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_automovil;

/**
 *
 * @author yisus
 */
public class EVA1_6_AUTOMOVIL {

      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil car1 = new Automovil("FORD","F-150",2004,"Jesus Calderon","8J3-5E5");
        car1.imprimirDatos();
        car1.setAño(2010);
        car1.imprimirDatos();
    }
}