package com.mycompany.eva_1_4_tv;

public class TV {
    private int vol;
    private int channel;
    private boolean power;
    //CONSTRUCTORES
    
    public TV(){
        vol = 0;
        channel = 0;
        power = false; //apagado
    }
    //INTERFAZ (Metodos para operar la tv)
    public void cambiarEstadoPoder (){
            
        //verificar el estado de la TV
        if(power){
           power = false;
           System.out.println("Apagado pantalla");
    }else{
           power = true;
           System.out.println("Encendido pantalla");
            }    
         
//Volumen
    }
    public void subirVol(){
        if (power == true){// la tv esta prendida.
            // El doble igual compara y chequea que el valor de power el de true.
                 if(vol < 100){
        vol = vol + 1; //acumulador
        //volumen++;
        //volumen+1;
        
        System.out.println("Volumen:" + vol);
                 }
        }
    }    
    public void bajarVol(){
        if (power == true){
        if(vol > 0){

        vol = vol - 1; //acumulador  
        // volumen = volumen -1;
        System.out.println("Volumen:" + vol);
        }
        }
    }
        //CANALES DE TV
        public void subirChannel(){
        if(power == true){
            channel++;
        if (channel > 100)
             channel = 0;
        System.out.println("Canal: " + channel);
       }
     }    
        public void bajarChannel(){
        if(power == true){
            channel--;
        if (channel < 0)
             channel = 100;
        System.out.println("Canal: " + channel);
       }
     }    
  }           

