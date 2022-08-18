/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaintroej17;

/**
 *
 * @author raulh
 */
public class JavaIntroEJ17 {

    public static void main(String[] args) {
        int[] Vector = new int[5];
        
        IniciarVector(Vector);
        ContarDigitos(Vector);
    }
    public static void IniciarVector(int[] Vector){
    Vector[0] =1;
    Vector[1] =10;
    Vector[2] =100;
    Vector[3] =1000;
    Vector[4] =10000;
    }
    
    public static void ContarDigitos(int[] Vector){
    String aux;
    int dig1 =0;
    int dig2 =0;
    int dig3 =0;
    int dig4 =0;
    int dig5 =0;
    
        for (int i = 0; i < 5; i++) {
            aux = Integer.toString(Vector[i]);
            switch(aux.length()){
        
            case 1:
            dig1 +=1;
            break;
            case 2:
            dig2 +=1;
            break;
            case 3:
            dig3 +=1;
            break;
            case 4:
        }
      }
    }
}
