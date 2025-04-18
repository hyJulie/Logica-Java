package NivelIniciante;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println(num+" é par");
        }else if (num % 2 == 1){
            System.out.println(num+" é ímpar");
        }else {
            System.out.println("número inválido");
        }

        scan.close();
    }
}
