package NivelIniciante;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idade =  scan.nextInt();

        String classificacao = classificarIdade(idade);
        System.out.println("Classificação: "+classificacao+" e idade "+idade);
    }

    public static String classificarIdade(int idade){
        if (idade <= 0 ){
            return "idade inválida";
        } else if (idade <= 12) {
           return "criança";
        } else if (idade <= 15){
            return "Adolescente";
        } else if (idade <= 59) {
            return "Adulto";
        }else {
            return "Idoso";
        }
    }
}
