package NivelIntermediario;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        palavra = palavra.toLowerCase().replaceAll("[^a-z0-9]", ""); //vai remover tudo que não é número ou plavra

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(palavraInvertida)){
            System.out.println(palavra+" é um palíndromo");
        }else {
            System.out.println(palavra+" não é um palíndromo");
        }

        scan.close();
    }
}
