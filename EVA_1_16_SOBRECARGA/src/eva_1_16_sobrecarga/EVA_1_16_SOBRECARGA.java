package eva_1_16_sobrecarga;

/**
 *
 * @author Alan
 */
public class EVA_1_16_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Suma: " + suma(4,5));
        System.out.println("Suma double: " + suma(1.2,1.23));
        System.out.println("Suma String: " + suma("Dir","Adi"));
        suma();
        
    }
        //suma (int, int)
public static int suma (int val1, int val2){
    return val1 +val2;
    
}
//suma (double, double)
public static double suma (double val1, double val2){
    return val1 +val2;
  
}
public static String suma (String val1, String val2){
    return val1 +val2;
  
}
public static void suma (){
    System.out.println("Metodo que no regresa nada, void");  
}

}
