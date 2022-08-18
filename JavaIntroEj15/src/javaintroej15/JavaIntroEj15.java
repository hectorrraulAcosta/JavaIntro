/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package javaintroej15;

import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaIntroEj15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] Vector;
        Vector = new int[100];
        
        for (int i = 0; i < 99; i++) {
            Vector[i] = i+1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println("[");
            System.out.println(Vector[i]);
            System.out.println("]");
        }
    }
}
