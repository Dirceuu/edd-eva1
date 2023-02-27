package com.mycompany.eva_1_6_automovil;

    /*
    MARCA, MODELO, PLACAS, AÑO Y DUEÑO
    GET Y SET
    CONSTRUCTORES DEFAULT Y CON ARGUMENTOS
    IMPRIMIR DATOS
    CALCULARADEUDO
    2000 Y ANTERIORES 1500, 2001-2005 (2000) , 2006-2012 (2500) , 2011-2015 (3000), 2016-2023(4000)
    DENTRO DE IMPRIMIR DATOS CALCULAR ADEUDO
    
    */
public class Car {
    
    private String brand;
    private String plates;
    private String name;
    private int year;
    private String owner;
    
//CONSTRUCTORES DEFAULT Y CON ATRIBUTOS
public Car(){
    brand = "Benz";
    plates = "LIL-PEP999";
    name = "Benz truck amg";  //Datos de arranque
    year = 2002;
    owner = "Gustav Ahr";
    
}

public Car(String brand2, String plates2, String name2, int year2, String owner2){
    brand = brand2;
    plates = plates2;
    name = name2;
    year = year2;
    owner =owner2;
    
}
//METODOS GET Y SET PARA LOS OBJETOS

public String getOwner(){
    return owner;
}
public void setOwner(String value){ //metodos set transfieren la info de owner ingresada por un usuario
    owner = value;
}
public String getBrand(){
    return brand;
}
public void setBrand(String value){
    brand = value;
}
public String getPlates(){
    return plates;
}
public void setPlates(String value){
    plates = value;
}
public String getName(){
    return name;
}
public void setName(String value){
    name = value;
}
public int getYear(){
    return year;
}
public void setYear(int value){
    year = value;
}

//Calculo de revalidación
public int calculoDeAdeudo(){
    int adeudo = 0;
    if (year <= 2000){
            adeudo = 1500;
    }else if ((year >=2001) && (year <= 2005)){
        adeudo = 2000;
        
    }else if ((year >=2006) && (year <= 2010)){
        adeudo = 2500;
    }else if ((year >=2011) && (year <= 2015)){
        adeudo = 3000;
    }else if ((year >=2016) && (year <= 2020)){
        adeudo = 3500;
    }else if ((year >=2021) && (year <= 2025)){
    }else{
        adeudo = 4000;
    }
    return adeudo;
        
}
public void printInfo(){
    System.out.println("Adeudo vehicular: ");
    System.out.println("Owner: "+ owner);
    System.out.println("Brand: "+ brand);
    System.out.println("Name: "+ name);
    System.out.println("Plates: "+ plates);
    System.out.println("Year: "+ year);
    //
    System.out.println("Adeudo: "+ calculoDeAdeudo());
}
}

