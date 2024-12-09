import java.util.Scanner;

public class ConverteBinarioDec {
    //9 - Conversão de Binário para Decimal
    //● Descrição: Escreva um programa que converta um número binário (representado
    //como uma string) para decimal.
    //● Exemplo de entrada: 1010
    //● Exemplo de saída: 10

    public static void main(String args[]){
        String numeroBinario;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número Binário: ");
        numeroBinario = scanner.next();

        int numeroDecimal = Integer.parseInt(numeroBinario,2);

        System.out.println(numeroDecimal);
    }

}
