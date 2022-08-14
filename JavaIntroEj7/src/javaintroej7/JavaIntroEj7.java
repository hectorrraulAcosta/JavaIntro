/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package javaintroej7;

import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaIntroEj7 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese una frase");
        String frase = leer.nextLine();
        
        if (frase.equals("Eureka")){
            System.out.println("La frase es correcta");
        }else{
            System.out.println("La frase es incorrecta");
        }   
    }
}
