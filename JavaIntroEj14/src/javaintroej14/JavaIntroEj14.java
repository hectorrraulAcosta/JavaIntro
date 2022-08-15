/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package javaintroej14;

import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaIntroEj14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros");
        int Euros = leer.nextInt();
        
        System.out.println("¿A que moneda desea convertir?");
        System.out.println("libras");
        System.out.println("dolares");
        System.out.println("yenes");
        String Moneda = leer.next();
        
        ConverMoneda(Euros,Moneda);
    }
    
    public static void converMoneda(int Euros, String Moneda){
    switch(Moneda){
        case "libras":
            System.out.println("Euros * 0.86");
            break;
        case "dolares":
            System.out.println("Euros * 1.28611");
            break;
        case "yenes":
            System.out.println("Euros * 129.852");
            break;
        default:
            System.out.println("Moneda equivocada");
    }
    }    
}
 