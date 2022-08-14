/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package javaintroej6;

import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaIntroEj6 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un numero");
        int num = leer.nextInt();
        
        if (num%2 != 0){
            System.out.println("El numero es impar");
        }else{
            System.out.println("El numero es par");}
        
    }
    
}
