/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

/**
 *
 * @author Alan
 */
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE;
    public void prubea(){
        ClaseA objA = new ClaseA();
        //objA.publicA;
        
        //ClaseB objB = new ClaseB(); //NO SE PUEDE ACCEDER DEBIDO A QUE ESTA AFUERA DEL PAQUETE
        /*objB.publicB;  attibutos visibles
        objB.defaultB;*/
        
        
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC
        
        //ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;
        ClaseF objF = new ClaseF();
       // objF.privateF;
        //objF.privateE;
        //objF.publicF
        
}
class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
}
}
