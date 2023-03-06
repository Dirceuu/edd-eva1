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
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
       // objA.defaultA;
       // objA.publicA
                
        ClaseB objB = new ClaseB();
        //objB.defaultB;
        //objB.publicB 
        
        ClaseC objC = new ClaseC();
        //objC.privateC(); Se puede el private porque esta adentro de la clase
        //objC.publicC
        //objC.defaultC
        ClaseD objD = new ClaseD();
        //objD.publicD():
        //objD.defaultD();
        //No se puede el privateD porque este no esta dentro de la clase C
     
       
        
       
       //ClaseE esta en otro paquete y archivo hay que agregar el import
       ClaseE objE = new ClaseE();
       //objE.publicE;
           
    }
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;


}
