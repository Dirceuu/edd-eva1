/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // CLASE ES LA RECETA:
        // OBJETO ES EL PLATILLO
        // INSTANCIACION: 1. DECLARAR LA IDENTIFICADOR PARA EL OBJETO. 2. ASIGNAR MEMORIA CON NEW. 3. INVOCAR SU CONSTRUCTOR;
        // PERSONA () -- CONTRUCTOR;
        // CONTRUCTOR -- METODO.
      Persona person1 = new Persona();
      Persona person2 = new Persona();

        //System.out.println(Persona);
      
      //ESTA SECCION ES PORQUE INICIAMOS CON LOS ATRIBUTOS CON MODIFICADOR DEFAULT
      /*person1.nombre = "Dirceu";
      person1.apellido = "Rivas";
      person1.age = 19;
      person1.estadoCiv = true; // True es casado.
      
      System.out.println(person1.nombre);*/
      person1.setNombre("Dirceu");
      person1.setApeliido("Rivas");
      person1.setAge(19);
      person1.setEstadociv(true);

      person2.setNombre("Danna");
      person2.setApeliido("tysh4l");
      person2.setAge(20);
      person2.setEstadociv(false);
      /*System.out.println(person1.getNombre());
        System.out.println(person1.getApellido());
        System.out.println(person1.getAge());
        System.out.println(person1.getEstadociv());*/
       
        person1.imprimirDatos();
        
        person2.imprimirDatos();
    }
    
}
