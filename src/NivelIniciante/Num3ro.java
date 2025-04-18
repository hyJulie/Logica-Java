package NivelIniciante;

import java.util.Scanner;

public class Num3ro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O primeiro número "+num1+" é maior que o segundo número "+num2+" e terceiro número "+num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número "+num2+" é maior que o primeiro número "+num1+" e terceiro número "+num3);
        }else {
            System.out.println("O terceiro número "+num3+" é maior que o primeiro número "+num1+" e o segundo número "+num2);
        }

        scan.close();
    }
}
