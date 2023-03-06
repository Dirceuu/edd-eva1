package eva_1_20_static_2;

/**
 *
 * @author Alan
 */
public class FormulasGeo {
    
    
    public static final double PI = 3.14159;
    //final --significado para clase, significado para variables: Solo pueden asignar una vez un valor a la variable
    //Area
    public static double areaTriangulo(double base, double altura){
        return (base * altura)/2;
    }
    public static double areaCirculo (double radio){
        return PI * radio * radio;
    }
    //Perimetro
    public static double perimetroCirculo (double diametro){
        return PI * (diametro * 2);
    }
    public static double volumenEsfera (double radio){
        return (4.0/3.0)*PI*(radio * radio * radio);
    }
    //Volumen
    
    
}
