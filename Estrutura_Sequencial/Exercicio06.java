package estruturasequencial;

import java.util.Scanner;
/**
 *
 * @author Marcos Paulo
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double consumoMedio, distancia, volume;

        System.out.println("Informe a distancia percorrida:");
        distancia = entrada.nextDouble();

        System.out.println("Informe o volume de combustivel consumido:");
        volume = entrada.nextDouble();

        consumoMedio = distancia / volume;

        System.out.printf("Consumo Medio = %.2fkm/l\n", consumoMedio);

    }
}
