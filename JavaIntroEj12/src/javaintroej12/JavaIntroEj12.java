/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package javaintroej12;

import java.util.Scanner;

/**
 *
 * @author raulh
 */
public class JavaIntroEj12 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        int correcta = 0;
        int incorrecta = 0;
        
        do{
            System.out.println("Ingrese una cadena");
            cadena = leer.next();
            
            int l = cadena.length();
            
            if(l<=5 && cadena.substring(0,1).equals("X") && cadena.substring(l-1,1).equals("0")){
            correcta += 1;
            }else{
            incorrecta += 1;
            }
        }while ( 0 != cadena.compareTo("&&&&&"));
        
        System.out.println("Informe");
        System.out.println("cantidad de ingresos corrector: " + correcta);
        System.out.println("cantidad de ingresos corrector: " + incorrecta);
    } 
}
