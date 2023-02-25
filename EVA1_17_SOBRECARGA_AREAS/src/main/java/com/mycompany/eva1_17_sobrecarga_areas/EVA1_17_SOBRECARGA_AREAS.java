/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_sobrecarga_areas;

/**
 *
 * @author yisus
 */
public class EVA1_17_SOBRECARGA_AREAS {

    public static void main(String[] args) {
        // TODO code application logic here
        /*AREAS: 
        Circulo: pi*R*R 
        Triangulo: (B*H)/2
        Trapecio: (A+B)/2*H
        AREA()*/
        System.out.println("Area Circulo: " + Circulo (5));
        System.out.println("Area Triangulo: " + Triangulo (5,7));
        System.out.println("Area Trapecio: " + Trapecio (5,8,7));
    }
    public static double Circulo(double Radio){
        return Math.PI*(Radio*Radio);
    }
    public static double Triangulo(double base, double altura){
        return (base*altura)/2.0;
    }
    //A: area, B: base, H: altura
    public static double Trapecio(double A, double B, double H ){
        return (A+B)/2.0*H;
    }
}