/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_television;

/**
 *
 * @author yisus
 */
public class EVA1_4_TELEVISION {


public class EVA1_4_tv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //método() --> llamada a función
        Television miTv = new Television();//La Tv empieza apagada
        miTv.bajarCanal();
        miTv.cambiarEstadoPoder();//la encendemos
        miTv.subirCanal();
        miTv.subirCanal();
        miTv.bajarCanal();
        miTv.bajarCanal();
        miTv.bajarCanal();
        miTv.bajarCanal();
    }
}
}  