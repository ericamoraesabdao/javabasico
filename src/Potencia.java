import java.util.Scanner;

public class Potencia {
    //6 - Potência
    //● Descrição: Escreva um programa que calcule a potência de um número base
    //elevado a expoente usando um loop for.
    //● Exemplo de entrada: 2 (base), 3 (expoente)
    //● Exemplo de saída: 8 (2^3)

    public static void main(String[] args) {
        int base;
        int expoente;
        int resultado = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        base = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o expoente: ");
        expoente = scanner2.nextInt();

        for (int i = 1; i <= expoente ; i++) {
           resultado = resultado * base;
        }

        System.out.println(resultado);
    }
}
