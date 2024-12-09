import java.util.Scanner;

public class Palindromo {
    //7 - Palíndromo
    //● Descrição: Escreva um programa que verifique se um número inteiro é um
    //palíndromo (lê-se da mesma forma de trás para frente).
    //
    //● Exemplo de entrada: 1221
    //● Exemplo de saída: true

    public static void main(String[] args){
        int n;
        String converteString;
        String inverteNum = "";
        boolean palindromo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n = scanner.nextInt();

        converteString = Integer.toString(n);

        for (int i = converteString.length(); i > 0; i--){
            inverteNum = inverteNum + converteString.substring(i - 1, i);
        }

        if (converteString.equals(inverteNum)) {
            palindromo = true;
        }
        else {
            palindromo = false;
        }

        System.out.println(converteString);
        System.out.println(inverteNum);
        System.out.println(palindromo);
    }
}
