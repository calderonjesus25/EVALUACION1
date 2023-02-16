/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_3_constructores;

/**
 *
 * @author yisus
 */
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        
        cuenta1.setNomCliente("Carlos silm");
        cuenta1.setNumCuenta("1");
        cuenta1.setSaldo(4000000);
        
        System.out.println("DATOS DEL CLIENTE:");
        String nombre = cuenta1.getNomCliente();
        System.out.println(nombre);
        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta1.getSaldo());
        
        
        //----------------------------------------------------
        System.out.println(" ");
        CuentaBancaria cuenta2 = new CuentaBancaria("2",4444,"Jesus Calderon");
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta2.getNomCliente());
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());
        
        //-----------------------------------------------------
        System.out.println(" ");
        CuentaBancaria cuenta3 = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta3.getNomCliente());
        System.out.println(cuenta3.getNumCuenta());
        System.out.println(cuenta3.getSaldo());
    }
}
