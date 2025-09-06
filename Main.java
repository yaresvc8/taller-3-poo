/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_taller3;

/**
 *
 * @author USUARIO
 */
class coche {
    
    public String marca;
    public String modelo;
    
    public static int contadorCoches = 0;

    public coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }
    
    public void mostrarInfo(){
        System.out.println("marca: " + marca + ", modelo: " + modelo);
    }
    
    public static void mostrarContador(){
        System.out.println("Coches creados: " + contadorCoches);
    }
}

public class Main { 
    public static void main(String[] args){
        
        coche c1 = new coche("Toyota", "Corolla");
        coche c2 = new coche ("mazda", "Cx-5");
        coche c3 = new coche ("Chevrolet", "Spark");
        
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
        
        coche.mostrarContador();
   }
}