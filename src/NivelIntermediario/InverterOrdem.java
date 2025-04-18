package NivelIntermediario;

import java.util.Scanner;

public class InverterOrdem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra para inverter: ");
        String palavra = scan.nextLine();

        char[] letras = palavra.toCharArray(); //array de caracteres


        int inicio = 0;
        int fim = letras.length - 1;

        while(inicio < fim){
            char temporaria = letras[inicio];
            letras[inicio] = letras[fim];
            letras[fim] = temporaria;

            inicio++;
            fim--;
        }

        System.out.println("Palavra invertida: ");
        for (char letra : letras){
            System.out.print(letra);
        }

        scan.close();
    }
}
