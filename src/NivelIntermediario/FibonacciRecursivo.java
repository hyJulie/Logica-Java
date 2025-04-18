package NivelIntermediario;

import java.util.Scanner;

public class FibonacciRecursivo {
    static int fibonacci(int num){
        if (num <= 1){
            return num;
        }else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de termos que quer mostrar: ");
        int num = scan.nextInt();

        System.out.println("Sequência de Fibonacci: ");
        for (int i = 0; i < num;i++){
            System.out.println(fibonacci(i)+ " ");
        }

        scan.close();
    }
}
/*
Explicação :
Recursividade é quando uma função chama a si mesma para resolver um problema.
Recursão é poderosa, mas se você esquecer a condição de parada, o código entra em loop infinito e pode travar seu programa (isso se chama stack overflow).
 */