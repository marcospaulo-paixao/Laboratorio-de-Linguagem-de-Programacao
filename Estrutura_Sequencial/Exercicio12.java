package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio12 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, volumePiramide;

        System.out.println("Informe o valor da Base da Pirâmide:");
        base = entrada.nextDouble();

        System.out.println("Informe o valor da Altura da Pirâmide:");
        altura = entrada.nextDouble();

        volumePiramide = 0.333333333 * base * altura;

        System.out.printf("Volume da Piramide é: %.2f\n", volumePiramide);

    }
}
