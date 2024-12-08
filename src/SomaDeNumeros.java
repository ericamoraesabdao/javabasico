import java.util.Scanner;

public class SomaDeNumeros {
    //● Descrição: Escreva um programa que receba um número inteiro n e calcule a
    //soma dos números de 1 a n usando um loop for.
    //        ● Exemplo de entrada: 5
    //        ● Exemplo de saída: 15 (1 + 2 + 3 + 4 + 5)

    public static void main(String[] args) {
        int n;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            soma = soma +i;

        }

        System.out.println(soma);
    }
}
