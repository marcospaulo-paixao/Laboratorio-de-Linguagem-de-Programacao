package estruturasequencial;

import java.util.Scanner;
/*
 *
 * @author marcos
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorPrestacao, prestacaoAtualizada, tempoAtraso, taxaJuros;

        System.out.println("Informe o Valor da Prestação:");
        valorPrestacao = entrada.nextDouble();

        System.out.println("Informe a taxa de juros(%):");
        taxaJuros = entrada.nextDouble();

        System.out.println("Informe o tempo de atraso:");
        tempoAtraso = entrada.nextDouble();

        prestacaoAtualizada = valorPrestacao + (valorPrestacao * (taxaJuros / 100) * tempoAtraso);

        System.out.printf("Valor da Prestação Atualizada: R$ %.2f\n", prestacaoAtualizada);

    }
}
