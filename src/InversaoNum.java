import java.util.Scanner;

public class InversaoNum {
    //5 - Inversão de Número
    //● Descrição: Escreva um programa que inverta os dígitos de um número inteiro.
    //● Exemplo de entrada: 12345
    //● Exemplo de saída: 54321

    public static void main(String[] args){
        int n;
        String converteString;
        String inverteNum = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n = scanner.nextInt();

        converteString = Integer.toString(n);

        for (int i = converteString.length(); i > 0; i--){
            inverteNum = inverteNum + converteString.substring(i - 1, i);
        }
        System.out.println("O número invertido é: " + inverteNum);
    }
}
