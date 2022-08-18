/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package javaintroej16;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaIntroEj16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("ingrese el tamaño del vector");
        int N = leer.nextInt();
        
        System.out.println("ingrese el numero a encontrar");
        int num = leer.nextInt();
        
        int[] Vector;
        Vector = new int[N];
        int i;
        
        for ( i = 0; i <= N-1; i++) {
            Vector[i]=random.nextInt(10);
            if(Vector[i]==num){
                System.out.println("el numero ingresado se encuentra en " + i+1);
            }  
        }
        for ( i = 0; i <= N-1; i++) {
            System.out.println("[");
            System.out.println(Vector[i]);
            System.out.println("]");
        }
    }
}
