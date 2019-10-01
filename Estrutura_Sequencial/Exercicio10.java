package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double custoFabrica, impostos, custoConsumidor;

        System.out.println("Qual o custo de Fabrica do Carro?");
        custoFabrica = entrada.nextDouble();

        custoConsumidor = custoFabrica + (custoFabrica * 0.12) + (custoFabrica * 0.30);

        System.out.printf("O custo do consumidor é de: R$ %.2f\n", custoConsumidor);

    }

}
