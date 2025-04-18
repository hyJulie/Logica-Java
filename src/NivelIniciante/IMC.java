package NivelIniciante;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        double peso = scan.nextDouble();

        System.out.println("Digite a altura: ");
        double altura =  scan.nextDouble();

        scan.nextLine();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal, muito bem!");
        } else if (imc >= 25.5 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        }else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade grau II, preocupante!");
        }else{
            System.out.println("Obesidade mórbida");
        }

        scan.close();
    }
}
