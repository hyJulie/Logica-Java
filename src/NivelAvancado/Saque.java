package NivelAvancado;

import java.util.Scanner;

public class Saque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valor = scan.nextInt();

       if (valor < 2){
           System.out.println("Valor inválido");
       } else { //vai calcular a quantidade de cada nota
           int nota100 = valor /100;
           valor %= 100; //quanto sobrou

           int nota50 = valor / 50;
           valor %= 50;

           int nota20 = valor / 20;
           valor %= 20;

           int nota10 = valor / 10;
           valor %= 10;

           int nota5 = valor / 5;
           valor %= 5;

           int nota2 =  valor / 2;
           valor %= 2;


           if (valor != 0){ //verifica se sobrou algum valor que não pode ser sacado
               System.out.println("Não é possível fazer o saque, valores indisponivel");
           }else {
               System.out.println("Notas entregues: ");
               if(nota100 > 0) System.out.println("Nota 100: "+nota100);
               if(nota50 > 0) System.out.println("Nota 50: "+nota50);
               if(nota20 > 0) System.out.println("Nota 20: "+nota20);
               if(nota10 > 0) System.out.println("Nota 10: "+nota10);
               if(nota5 > 0) System.out.println("Nota 5: "+nota5);
               if(nota2 > 0) System.out.println("Nota 2: "+nota2);
           }
       }

       scan.close();
    }
}
/*
usando a o resto pra calcular o restante das notas
exemplo: 286 / 100 -> nota100 = 2;
valor %= 100 = vai sobrar 86
86 / 50
e vai por ai
 */