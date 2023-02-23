/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_automovil;

/**
 *
 * @author yisus
 */
public class Automovil {
    private String marca;
    private String modelo;
    private String dueño;
    private String placas;
    private int año;
    //constructor
    public Automovil(){//default
        marca = "Volkswagen";
        modelo = "Vocho";
        dueño = "Sin dueño";
        placas = "973-KGB";
        año = 1960;
    }
    public Automovil(String marcaAuto, String modeloAuto, int añoAuto, String dueñoAuto, String placasAuto){//constructor con argumentos
    marca = marcaAuto;
    modelo = modeloAuto;
    año = añoAuto;
    dueño = dueñoAuto;
    placas = placasAuto;
    }
    //metodos get y set
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getDueño(){
        return dueño;
    }
    public int getAño(){
        return año;
    }
    public String getPlacas(){
        return placas;
    }
    public void setMarca (String marcaAuto){
        marca = marcaAuto;
    }
    public void setModelo (String modeloAuto){
        modelo = modeloAuto;
    }
    public void setDueño (String dueñoAuto){
        dueño = dueñoAuto;
    }
    public void setAño (int añoAuto){
        año = añoAuto;
    }
    public void setPlacas (String placasAuto){
        placas = placasAuto;
    }
    //calcular revalidación
    public int calcularRev(){
        int adeudo = 0;
        //if else anidado
        if(año <= 2000){
            adeudo = 1500;
        }
        else if((año >= 2001) && (año <= 2005)){
            adeudo = 2000;
        }
        else if((año >= 2006) && (año <= 2010)){
            adeudo = 2500;
        }
        else if((año >= 2011) && (año <= 2015)){
            adeudo = 3000;
        }
        else{
            adeudo = 4000;
        }
        return adeudo;
    }
    //imprimir datos:
    public void imprimirDatos(){
        System.out.println("ADEUDO VEHICULAR: ");
        System.out.println("DUEÑO: " + dueño);
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("PLACAS: " + placas);
        System.out.println("AÑO: " + año);
        //llamamos al método calcularRevalidación
        System.out.println("ADEUDO: " + calcularRev());
    }
}
    
