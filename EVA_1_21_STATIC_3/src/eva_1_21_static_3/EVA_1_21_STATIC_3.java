/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_21_static_3;

/**
 *
 * @author Alan
 */
public class EVA_1_21_STATIC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(prueba.valor);
        prueba.valor++;
        System.out.println(prueba.valor);
        
        System.out.println("Ahora con objetos:");
        PruebaObjetos obj = new PruebaObjetos ();
        System.out.println(obj.valor);
           obj.valor++;
     
        PruebaObjetos obj2 = new PruebaObjetos ();
        System.out.println(obj2.valor);
           obj2.valor++;
           
    }
      
    }
    class prueba{
        public static int valor = 100;
    }
    class PruebaObjetos{
        public int valor = 100;//si se modifico
    }
    