package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, aux1 ;

        System.out.println("Informe o valor de A");
        a = entrada.nextInt();
        System.out.println("Informe o valor de B:");
        b = entrada.nextInt();
        
        aux1 = a;
        a = b;
        b = aux1;
        
        System.out.printf("A = %d\n",a);
        System.out.printf("B = %d\n",b);
        
        
    }
}
