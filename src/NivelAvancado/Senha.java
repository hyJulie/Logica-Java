package NivelAvancado;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String login = "admin";
        int senha = 1234;

        int tentativasRestantes = 3;
        int tentativasUsadas = 0;

        while(true){
            System.out.println("Digite o login: ");
            String loginUser = scan.nextLine();

            System.out.println("Digite a senha: ");
            int senhaUser = scan.nextInt();
            scan.nextLine();

            tentativasUsadas++;

            if (loginUser.equals(login) && senhaUser == senha){
                System.out.println("Acesso Permitido!");
                System.out.println("Login: "+login);
                System.out.println("Senha: "+senha);
                System.out.println("Você acertou em "+tentativasUsadas+" tentativas");
                break;
            } else {
                tentativasRestantes--;
                System.out.println("Login ou senha incorretos.");
            }

            if (tentativasRestantes == 0){
                System.out.println("Acesso bloqueado");
                break;
            }
        }

        scan.close();
    }
}
