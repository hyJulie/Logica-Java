package NivelIntermediario;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números: ");


        for (int i = 0; i < 10;i++){
            System.out.println("Número "+(i + 1)+" :");
            numeros[i] = scan.nextInt();
        }

        int soma = 0;
        for (int i = 0;i < 10;i++){
            soma += numeros[i];
        }

        double media = soma / 10.0;

        System.out.println("\nNúmeros maiores que a média (" + media + "):");
        for (int i =0; i<10;i++){
            if (numeros[i] > media){
                System.out.println(numeros[i]);
            }
        }

        scan.close();
    }
}
