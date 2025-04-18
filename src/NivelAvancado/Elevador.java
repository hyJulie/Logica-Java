package NivelAvancado;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int andarAtual = 0;

        System.out.println("Digite quantos andares tem o prédio: ");
        int andarMaximo = scan.nextInt();

        int opcao;
        do {
            System.out.println("==Menu==");
            System.out.println("1 - Subir");
            System.out.println("2 - Descer");
            System.out.println("3 - andar atual");
            System.out.println("4 - sair");
            System.out.println("Escolha a opcao: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1:
                    if (andarAtual < andarMaximo){
                        System.out.println("Pode subir");
                        andarAtual++;
                    }else {
                        System.out.println("Já está no último andar");
                    }
                    break;
                case 2:
                    if (andarAtual > 0){
                        System.out.println("Pode descer");
                        andarAtual--;
                    }else {
                        System.out.println("Já está no térreo");
                    }
                    break;
                case 3:
                    System.out.println("Andar atual: "+andarAtual);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 4);


        scan.close();
    }
}
