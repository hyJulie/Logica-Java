package NivelIniciante;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("Tabuada de "+num+" :");
        for (int i = 0; i <= 10; i++){
            System.out.println(num+" x "+i+" = "+(num * i));
        }

        scan.close();
    }
}
