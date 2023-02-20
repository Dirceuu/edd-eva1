package com.mycompany.eva_1_5_cir;

/**
 *
 * @author Alan
 */
public class EVA_1_5_CIR {

    public static void main(String[] args) {
    Círculo cir1 = new Círculo();
        System.out.println("Area y perimetro del circulo#1:");
        System.out.println("");
        System.out.println("Area: " + cir1.getArea());
        System.out.println("Perimetro: " + cir1.getPerimetro());
    
        System.out.println("----------------------------");
        
    Círculo cir2 = new Círculo(8);
    System.out.println("Area y perimetro del circulo#2:");
        System.out.println("Area: " + cir2.getArea ());
        System.out.println("Perimetro: " + cir2.getPerimetro());
        
        System.out.println("----------------------------");
        
    Círculo cir3 = new Círculo(2);
    System.out.println("Area y perimetro del circulo#2:");
        System.out.println("Area: " + cir3.getArea ());
        System.out.println("Perimetro: " + cir3.getPerimetro());
    
        
    }
}
