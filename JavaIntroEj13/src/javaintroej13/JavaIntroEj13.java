/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */
package javaintroej13;

import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaIntroEj13 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int N = leer.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println("   ");
            
            for (int j = 1; j <= N; j++) {
                if (i==1||i==N){
                    System.out.print("* ");
                }else if(j==1 || j==N){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            
        }
              
    }
    
}
