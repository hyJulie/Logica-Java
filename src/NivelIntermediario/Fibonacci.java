package NivelIntermediario;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //A sequência de Fibonacci é uma sequência de números inteiros em que cada número (a partir do terceiro) é a soma dos dois anteriores.
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de termos que quer mostrar: ");
        int num = scan.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < num;i++){
            System.out.println(a+ "");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
