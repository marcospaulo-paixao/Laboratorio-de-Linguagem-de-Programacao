package estruturasequencial;

import java.util.Scanner;
/* 
 * @author Marcos Paulo
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double publicoTotal, rendaTotal, ingressoPopular, ingressoGeral, ingressoArquibancada, ingressoCadeiras;

        System.out.println("Informe o publico total do Jogo de Futebol:");
        publicoTotal = entrada.nextInt();

        ingressoPopular = (publicoTotal * 0.10) * 10;
        ingressoGeral = (publicoTotal * 0.50) * 15;
        ingressoArquibancada = (publicoTotal * 0.30) * 20;
        ingressoCadeiras = (publicoTotal * 0.10) * 30;

        rendaTotal = ingressoPopular + ingressoGeral + ingressoArquibancada + ingressoCadeiras;
        
        System.out.printf("A renda total do jogo: R$ %.2f\n",rendaTotal);
    }
}
