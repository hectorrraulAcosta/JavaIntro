/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaintroej1;

import java.util.Scanner;

/**
 * @author raulh
 */
public class JavaIntroEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los dos numeros necesarios para realizar la operacion Suma");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("el resultado es: " + (num1+num2));
        
    
    }
} 