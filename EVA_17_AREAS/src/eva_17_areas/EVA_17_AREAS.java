/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_17_areas;

/**
 *
 * @author Alan
 */
public class EVA_17_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Area de un circulo: " +area(3.5));
        System.out.println("Area de un traingulo: " +area(4.2, 3.2));
        System.out.println("Area de un trapecio: " +area(2.2,1.3,1.7));
    }
    public static double area(double radio){
        return radio*Math.PI;
        
    }
    public static double area(double base, double altura){
        return (base*altura)/2;
        
    }
    public static double area(double bmayor, double bmenor, double altura){
        return ((bmayor+bmenor)*altura)/2;
        
    }
    
}
