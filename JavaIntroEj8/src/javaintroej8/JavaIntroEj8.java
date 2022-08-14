/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package javaintroej8;

import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeString;
import sun.security.util.Length;

/**
 *
 * @author raulh
 */
public class JavaIntroEj8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la frase");
        String frase = leer.nextLine();
        
        if(frase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");}
        
    }
    
}
