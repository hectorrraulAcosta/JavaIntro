/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaintroej2;

import java.util.Scanner;


/**
 *
 * @author raulh
 */
public class JavaIntroEj2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String nombre;  
      System.out.println("Ingrese su Nombre");
      nombre = leer.nextLine();
        System.out.println("Mi nombre es: " + nombre);
    }
}    
