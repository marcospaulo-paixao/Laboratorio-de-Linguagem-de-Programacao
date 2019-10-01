package estruturasequencial;

import java.util.Scanner;
/**
 *
 * @author Marcos Paulo
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float l1, l2, l3,t;

        System.out.println("Informe o Lado 1 do Triangulo:");
        l1 = entrada.nextInt();

        System.out.println("Informe o Lado 2 do Triangulo:");
        l2 = entrada.nextInt();

        System.out.println("Informe o Lado 3 do Triangulo:");
        l3 = entrada.nextInt();
        
        t = (l1+l2+l3)/2;
        double area =  Math.sqrt((t*(t-l1)*(t-l2)*(t-l3)));
        
        System.out.printf("AREA = %.2f",area);
    }
}
