package com.mycompany.eva_1_6_automovil;

/**
 *
 * @author Alan
 */
public class EVA_1_6_AUTOMOVIL {

    public static void main(String[] args) {
        
    Car auto = new Car ();
        auto.printInfo();
    
        System.out.println("-----------------------");
     
    Car auto2 = new Car("Camaro", "A13A-123", "V22", 2015, "Adilene ruiz");
        auto2.printInfo();
    }
}
