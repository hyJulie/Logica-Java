package NivelIntermediario;

import java.util.Scanner;

public class mediaN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você quer informar?");
        int num = scan.nextInt();

        double total = 0;

        for (int i = 0; i < num; i++){
            System.out.print("Digite o "+(i + 1)+" número: ");
            double numero = scan.nextDouble();
            total += numero;
        }

        double media = total / num;
        System.out.println("Média: "+media);

        scan.close();
    }
}
