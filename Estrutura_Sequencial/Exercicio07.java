package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double compraDolar, compraReais, taxaDolar, icms, lucroEmpresa, taxaLucroEmpresa;

        System.out.println("Informe o valor da Compra em Dolar:");
        compraDolar = entrada.nextDouble();

        System.out.println("Informe o valor da taxa do Dolar atual:");
        taxaDolar = entrada.nextDouble();

        System.out.println("Informe a taxa de ICMS atual:");
        icms = entrada.nextDouble();

        taxaLucroEmpresa = 96;
        compraReais = compraDolar * taxaDolar;
        lucroEmpresa = compraReais - (compraReais * (icms / 100));

        System.out.printf("Valor compra em Dolar: US$ %.2f\n", compraDolar);
        System.out.printf("Taxa Dolar atual: R$ %.2f\n", taxaDolar);
        System.out.printf("Taxa ICMS atual: %.2f%%\n", icms);
        System.out.printf("Taxa de Lucro da empresa: %.2f%%\n", taxaLucroEmpresa);
        System.out.printf("Lucro da empresa: R$ %.2f\n", lucroEmpresa);
        System.out.printf("Valor compra em Reais: R$ %.2f\n", compraReais);

    }
}
