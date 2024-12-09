import java.util.Scanner;

public class Fibonacci {
    //10 - Série de Fibonacci
    //● Descrição: Escreva um programa que imprima os primeiros n números da série
    //de Fibonacci.
    //● Exemplo de entrada: 5
    //● Exemplo de saída: 0, 1, 1, 2, 3

    public static void main(String args[]) {
        int n;
        int sequencia;
        int primeiroNumero = 0;
        int segundoNumero = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números da série Fibonacci: ");
        n = scanner.nextInt();

        System.out.print(primeiroNumero + ", ");
        System.out.print(segundoNumero + ", ");

        for (int i = 2; i < n; i++) {
                sequencia = primeiroNumero + segundoNumero;
                System.out.print(sequencia + ", ");

                primeiroNumero = segundoNumero;
                segundoNumero = sequencia;
        }
    }
}