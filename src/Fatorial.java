import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Fatorial {
//    2 - Fatorial
//    ● Descrição: Escreva um programa que receba um número inteiro n e calcule o
//    fatorial de n usando um loop while.
//    ● Exemplo de entrada: 5
//    ● Exemplo de saída: 120 (5 * 4 * 3 * 2 * 1)
    public static void main(String[] args){
        int n;
        int fatorial = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = scanner.nextInt();

        while (n>0){
            fatorial = fatorial * n;
            n --;
        }

        System.out.println(fatorial);
    }




}
