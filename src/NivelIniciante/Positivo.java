package NivelIniciante;

import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        if (numero > 0){
            System.out.println(numero+" é positivo");
        } else if (numero < 0) {
            System.out.println(numero+" é negativo");
        }else {
            System.out.println("é zero");
        }
    }
}
