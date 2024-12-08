import java.util.Scanner;

public class ContagemDigitos {
    //3 - Contagem de Dígitos
    //● Descrição: Escreva um programa que receba um número inteiro e conte quantos
    //dígitos ele possui.
    //● Exemplo de entrada: 12345
    //● Exemplo de saída: 5
    public static void main(String[] args) {

        int n;
        String digitos;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        digitos = Integer.toString(n);
        System.out.println(digitos.length());

    }
}