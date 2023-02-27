package eva_1_11_return;

/**
 *
 * @author Alan
 */
public class EVA_1_11_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r;
        r = square(2);//invocación o llamada a función
        System.out.println("Resultado: " + r);
    }
    
    public static int square(int num){
        return num * num;    
    }
}
