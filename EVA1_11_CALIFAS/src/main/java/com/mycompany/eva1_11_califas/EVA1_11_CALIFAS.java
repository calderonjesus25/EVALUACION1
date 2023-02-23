/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_califas;

/**
 *
 * @author yisus
 */
public class EVA1_11_CALIFAS {

    public static void main(String[] args) {
        // TODO code application logic here
     String cali;
        cali = califas(75);//almaceno el resultado en una variable
        System.out.println("Califa para 75: " + cali);
        System.out.println("Califa para 91: " + califas(91)); 
        califas(100);//ignoro el resultado
    }
    public static String califas (int califa){
        String resu = "B";
        if((califa >=91)&&(califa <= 100)){
            resu = "A";
        }
        else if((califa >= 81) && (califa <= 90)){
            resu = "B";
        }
        else if((califa >= 71) && (califa <= 80)){
            resu = "C";
        }
        else{
            resu = "D";
        }
        return resu;
    }
}