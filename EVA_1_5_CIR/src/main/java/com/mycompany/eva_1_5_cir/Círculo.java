package com.mycompany.eva_1_5_cir;

public class Círculo {
    
    private double radio;
    private double area;
    private double perimetro;


public Círculo (){
    radio = 6;
   
}
public Círculo(double rad2){
    radio = rad2; 
}

public double getArea (){
   area = (radio*radio)*Math.PI;
            return area;
}
public void setArea (double value){
    area = value;
    
}   
public double getPerimetro (){
    perimetro = (radio*2)*Math.PI;
        return perimetro;
}
public void setPerimetro (double value){
    perimetro = value;
}
}
