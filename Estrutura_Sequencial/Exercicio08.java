package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double i, p, n;

        System.out.println("Informe o valor da Aplicação Mensal:");
        p = entrada.nextDouble();

        System.out.println("Informe a taxa:");
        i = entrada.nextDouble();

        System.out.println("Informe o numero de meses:");
        n = entrada.nextDouble();

        double valorAcumulado = (((Math.pow((1 + i), n) - 1)) / i) * p;
        System.out.printf("O valor acumulado é: R$ %.2f\n", valorAcumulado);
    }
}
