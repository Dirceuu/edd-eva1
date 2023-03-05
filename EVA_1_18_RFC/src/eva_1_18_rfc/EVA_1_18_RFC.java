package eva_1_18_rfc;

/**
 Primera  y segunda letra del 1er apellido
 primera  segundo y segunda letra del apellido
 inicial primer nombre
 año
 mes
 dia
 
 generar rfc
 nombre
 apellidos paterno
 apellido materno
 año
 mes
 dia
 x
 */
public class EVA_1_18_RFC {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        String rfc = generarRFC("Alan", "Rivas", 2003, 12, 24);
        System.out.println(rfc);
        String rfcOption1 = generarRFC("Alan", "Rivas", 2003,02, 23);
        System.out.println(rfcOption1);
        String rfcOption2 = generarRFC("Alan", 2003,02, 23);
        System.out.println(rfcOption2);
    }
    public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia ){
        String apP = apPat.charAt(0) + "";
        String apP2 = apPat.charAt(1) + "";
        String apM = apMat.charAt(0) + "";
        String nom = nombre.charAt(0) + "";
        String rfc = apP + apP2 + apM + nom + año + mes + dia + "";
        return rfc;
    }
    public static String generarRFC(String nombre, String apPat, int año, int mes, int dia ){
        String apP = apPat.charAt(0) + "";
        String apP2 = apPat.charAt(1) + "";
        String nom = nombre.charAt(0) + "";
        String rfcOption1 = apP + apP2 + "X" + nom + año + mes + dia + "";
        return rfcOption1;
    }
    public static String generarRFC(String nombre, int año, int mes, int dia ){
        String nom = nombre.charAt(0) + "";
        String rfcOption2 =  "XX" + nom + año + mes + dia + "";
        return rfcOption2;
    }
}