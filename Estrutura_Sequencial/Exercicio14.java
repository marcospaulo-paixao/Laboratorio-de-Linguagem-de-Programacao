package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio14 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double distancia, tempoViagem, velocidadeMedia, quantidadeLitros;

        System.out.println("Informe o tempo de de viagem:");
        tempoViagem = entrada.nextDouble();

        System.out.println("Iforme a velocidade Media do veículo:");
        velocidadeMedia = entrada.nextDouble();

        distancia = tempoViagem * velocidadeMedia;
        quantidadeLitros = distancia / 12;

        System.out.printf("A quantidade de litros a ser gasto é: R$ %.2f\n", quantidadeLitros);

    }
}
