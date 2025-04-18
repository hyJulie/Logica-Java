package NivelAvancado;

import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int qtdAlunos = scan.nextInt();
        scan.nextLine();

        String[] nomes = new String[qtdAlunos];
        double[] notas1 = new double[qtdAlunos];
        double[] notas2 = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            nomes[i] = scan.nextLine();
            System.out.println("Digite a primeira nota: ");
            notas1[i] = scan.nextDouble();
            System.out.println("Digite a segunda nota: ");
            notas2[i] = scan.nextDouble();
            scan.nextLine();
        }

        for (int i = 0; i < qtdAlunos; i++) {
            double media = (notas1[i] + notas2[i]) / 2;

            System.out.println("Nomes: " + nomes[i]);
            System.out.println("Média: " + media);
        }

        scan.close();
    }
}
