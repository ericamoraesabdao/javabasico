import java.util.Scanner;

public class MultiplosNum {
    //8 - Múltiplos de um Número
    //● Descrição: Escreva um programa que imprima todos os múltiplos de um número n
    //até um limite m.
    //● Exemplo de entrada: 3 (n), 15 (m)
    //● Exemplo de saída: 3, 6, 9, 12, 15

    public static void main(String[] args) {
        int n;
        int m;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro multiplo: ");
        n = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite um número inteiro limite: ");
        m = scanner2.nextInt();

        for (int i = n; i <= m; i++){
            if (i % n == 0) {
                System.out.println(i);
            }

        }
    }
}
