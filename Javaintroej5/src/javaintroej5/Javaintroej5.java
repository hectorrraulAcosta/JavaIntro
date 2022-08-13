/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package javaintroej5;

import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class Javaintroej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un numero");
        int num = leer.nextInt();
        
        System.out.println("El numero ingresado es: " + num);
        System.out.println("El doble del numero ingresado es: " +(2*num));
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(num));
        
    }
    
}
