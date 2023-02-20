/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_circulo;

/**
 *
 * @author yisus
 */
public class Circulo {
    private double perimetro;
    private double area;
    private double radio;
    
    public Circulo(){
        radio = 0;
        area = 0;
        perimetro = 0;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double valor){
        radio = valor;
    }
    public double getPerimetro(){
        return perimetro;
    }
    public void setPerimetro(double valor){
        perimetro = 2 * Math.PI * radio;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double valor){
        area = Math.PI * Math.pow(radio, 2);
    }
    public void imprimirDatos(){
        System.out.println("Datos del circulo:");
        System.out.println("Radio: " + radio);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }   
}
