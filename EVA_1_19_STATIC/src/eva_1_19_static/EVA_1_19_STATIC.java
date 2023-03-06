/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_19_static;

/**
 *
 * @author Alan
 */
public class EVA_1_19_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI: " +Math.PI);//STATIC alogo que podemos usar sin crear instancias
        System.out.println("Num. Aleatorio: " +Math.random());
        
    Utilities utileria = new Utilities();
    utileria.Salute();
    Utilities.otherSalute();
    //Salute2();// SI NO ES STATIC, Y NO SE HA CREADO UN OBJETO, EL METODO NO EXISTE.
    }
    public void Salute2(){
        System.out.println("HI againx2");
    }
    
}

class Utilities{
    public void Salute(){
        //Este metodo existe hasta que se crea un objeto de la 
        //clase solo se usa a traves un objeto.
        System.out.println("Hi");
    }   //otroSaludo(); Este metodo existe en el momento en el que el programa inicia su ejecucio. no necesita que se cree un objeto de la clase para poder utilizarlo. Se usa através de un objeto
    
    public static void otherSalute(){
        System.out.println("Hi again");
    }
    
}
