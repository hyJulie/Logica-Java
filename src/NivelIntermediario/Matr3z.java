package NivelIntermediario;

import java.util.Arrays;
import java.util.Scanner;

public class Matr3z {
    //matriz 3x3
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        int soma = 0;

        System.out.print("Digite os 9 elementos da matriz 3x3: ");


        for (int i = 0; i < 3;i++){ //linha
            for (int j = 0; j < 3; j++){ //coluna
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz){
            for (int[] valor : matriz){
                System.out.println(Arrays.toString(valor) + " ");
            }
            System.out.println();
        }

        //media
        double media = soma / 9.0;

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < 3;i++){
            System.out.println(matriz[i][i]+ " ");
        }

        System.out.println("\n\nSoma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);

        scan.close();
    }
}
