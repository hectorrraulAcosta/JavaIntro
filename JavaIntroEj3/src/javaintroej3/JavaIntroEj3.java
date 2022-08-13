/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package javaintroej3;

import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaIntroEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println("" + frase.toUpperCase());
        System.out.println("" + frase.toLowerCase());
        
    }
    
}
