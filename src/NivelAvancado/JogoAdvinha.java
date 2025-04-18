package NivelAvancado;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        int randomNumber = r.nextInt(100) + 1; //para ir de 1 até 100

        int tentativas = 0;
        while (true) {
            System.out.println("tente advinhar um número aleatório de 1 a 100: ");
            int playerGuess = scan.nextInt();
            tentativas++;

            if (playerGuess == randomNumber) {
                System.out.println("Você acertou o número, ganhou!");
                System.out.println("O número aleatório era: "+randomNumber);
                System.out.println("Você tentou : "+tentativas+" vezes");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("O número é maior, tente de novo");
            } else {
                System.out.println("O número é menor, tente de novo");
            }
        }
    }
}
/*
        Random r = new Random();
        int numero = r.nextInt(101);
        System.out.println("Números aleatórios: "+numero);
 */