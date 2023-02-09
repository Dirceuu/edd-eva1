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
public class Persona {
        //ATRIBUTOS DE LA CLASE
    private String nombre; 
    private String apellido;
    private int age;
    private boolean estadoCiv;
        // METODOS COMPORTAMIENTO
        // LECTURA Y ESCRITURA DE ATRIBUTOS:
        // METODOS get -- LEER, METODO SET -- ESCRIBIR
        // METODOS SINTAXIS:
        // MODIFICADOR VALOR DE RETORNO NOMBRE (ARGUMENTOS) (IMPLEMENTACION)
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String value){
            nombre = value;
            
        }
        public String getApellido(){
            return apellido;
        }
        public void setApeliido(String value){
            apellido = value;
            
        }
        public int getAge(){
            return age;
        }
        public void setAge(int value){
            age = value;
            
        }
        public boolean getEstadociv(){
            return estadoCiv;
        }
        public void setEstadociv (boolean value){
            estadoCiv = value;
        }
            public void imprimirDatos(){
                System.out.println("Datos almacenados:");
                System.out.println("Nombre completo: " + nombre + " " + apellido);
                System.out.println("Edad " + age );
                if(estadoCiv)
                    System.out.println("Estado civil: Solter@.");
                else
                    System.out.println("Estado civil: Casad@.");
            }
             
        }
    
