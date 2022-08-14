/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package javaintroej10;

import java.util.Scanner;

/**
 *
 * @author raulh 
 */
public class JavaIntroEj10 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int suma;
        
        suma = 0;
        
        System.out.println("Ingrese un valor el cual sera el limite");
        int limite = leer.nextInt();
        
        do{
            System.out.println("Ingrese numeros");
            int num = leer.nextInt();
            suma+=num;
        }while(suma<limite);
    }
}
