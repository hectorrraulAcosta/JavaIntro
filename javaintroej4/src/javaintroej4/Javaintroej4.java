/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaintroej4;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class Javaintroej4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados a transformar");
        int grados = leer.nextInt();
        System.out.println("la temperatura es " + grados +" en grados centigrados, en grados Fahrenheit es " + (32+(9*grados/5))); 
        
        
        
    }
    
}
