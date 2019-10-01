package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        System.out.println("Informe o valor de A:");
        a = entrada.nextDouble();
        System.out.println("Informe o valor de B:");
        b = entrada.nextDouble();
        System.out.println("Informe o valor de C:");
        c = entrada.nextDouble();

        delta = (Math.pow(b, 2)) - 4 * a * c;

        x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
        x2 = ((b * -1) - Math.sqrt(delta) )/ (2 * a);

        System.out.printf("Delta = %.2f\n", delta);
        System.out.printf("x1 = %.2f\n", x1);
        System.out.printf("x2 = %.2f\n", x2);

    }
}
