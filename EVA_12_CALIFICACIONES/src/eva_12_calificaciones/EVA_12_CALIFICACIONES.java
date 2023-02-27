package eva_12_calificaciones;

/**
 *
 * @author Alan
 */
public class EVA_12_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cali;
        cali = calificaciones (90); //almaceno el resultado en una variable
        System.out.println("Califa para 90: " + cali );
        System.out.println("Califa para 80: " + calificaciones(80)); //invoco dentro de otra funcion
        System.out.println("Califa para 70: " + calificaciones(70)); //invoco dentro de otra funcion

    }
    public static String calificaciones (int num){
        /*if ((num >= 91) && (num <= 100)){//A
            return "A";
            
        }else if ((num >= 81) && (num <= 90)){
            return "B";
            
        }else if((num >= 71) && (num <= 80)){
            return "C";
            
        }else{
            return "D";
*/
        String resu = "";   
             if ((num >= 91) && (num <= 100)){//A
            resu = "A";
            
        }else if ((num >= 81) && (num <= 90)){
            resu = "B";
            
        }else if((num >= 71) && (num <= 80)){
            resu = "C";
            
        }else{
            resu = "D";
        }
        return resu;
            
        
    }  
}
