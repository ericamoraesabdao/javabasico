import java.util.Scanner;

public class ContagemNumPrimos {
    //4 - Números Primos
    //● Descrição: Escreva um programa que verifique se um número inteiro é primo.
    //● Exemplo de entrada: 29
    //● Exemplo de saída: true

    public static void main(String[] args){
        int n = 0;
        boolean primo = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n = scanner.nextInt();

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                primo = false;
            }
        }

        System.out.println(primo);



    }
}
