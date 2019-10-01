package estruturasequencial;

import java.util.Scanner;
/**
 *
 * @author Marcos Paulo
 */
public class Exercicio05 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        double raio,altura,area,volume;
        double pi =  3.14;
        System.out.println("Informe o valor do raio do Cilindro:");
        raio = entrada.nextDouble();
        
        System.out.println("Informe o valor da altura do Cilindro:");
        altura = entrada.nextDouble();
        
        area = 2*pi*raio*(altura+raio);
        volume = pi*(Math.pow(raio,2)*altura);
        
        System.out.printf("Area do Cilindro = %.2f\n",area);
        System.out.printf("Volume do Cilindro = %.2f\n",volume);
    
    }   
            
}
