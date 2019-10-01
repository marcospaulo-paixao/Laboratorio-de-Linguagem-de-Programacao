package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioFixo, comi1, comi2, comi3, tvLCD = 50, tvLED = 60, tvPlasma = 55, comissao;

        System.out.println("Informe o valor do Salario Fixo:");
        salarioFixo = entrada.nextDouble();

        System.out.println("Quantas Tv LCD vendidas?");
        comi1 = entrada.nextDouble();
        System.out.println("Quantas Tv LED vendidas?");
        comi2 = entrada.nextDouble();
        System.out.println("Quantas Tv Plasma vendidas?");
        comi3 = entrada.nextDouble();

        comissao = salarioFixo + (comi1 * tvLCD) + (comi2 * tvLED) + (comi3 * tvPlasma);
        System.out.printf("Salario do Empregado é: R$ %.2f\n", comissao);
    }

}
