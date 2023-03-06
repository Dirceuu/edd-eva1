/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author Alan
 */
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prubea(){
        ClaseA objA = new ClaseA();
        //objA.privateA
        //objA.defaultA
        //objA.publicA
        
        ClaseB objB = new ClaseB();
        /*objB.publicB;  attibutos visibles
        objB.defaultB;*/
        
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC
        
        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;
        
        
        
        
        //ClaseE esta en otro paquete y archivo hay que importarla del paquete 2
        ClaseE objE = new ClaseE();
        //objE.publicE, Clases entre distintos paquetes, solo se pueden ver lo publico
        
        //ClaseF es default y es invisible para las clases de este paquete
        //ClaseF objF = new ClaseF();
    }
}
class ClaseB {
    public int publicB;
    int defaultB;
    private int privateB;
    
}
