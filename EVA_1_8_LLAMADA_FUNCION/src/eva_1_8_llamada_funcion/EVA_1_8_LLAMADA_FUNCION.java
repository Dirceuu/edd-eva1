package eva_1_8_llamada_funcion;

/**
 *
 * @author Alan
 */
public class EVA_1_8_LLAMADA_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INICIA main()");
        A();//llamada a la funcion
        System.out.println("TERMINA main()");
    }
    public static void A (){
        System.out.println("INICIA A ()");
        B();//llamada a la funcion
        System.out.println("TERMINA A ()");
    }
    public static void B (){
        System.out.println("INICIA B ()");
        System.out.println("TERMINA B ()");
    }
    }

