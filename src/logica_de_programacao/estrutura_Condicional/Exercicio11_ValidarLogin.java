//Exercício solicitado ao GEMINI
//Esse exercício me gerou um pouco de dificuldade, pois ainda não tinha tido contato com o ".equals", apenas com o ==

package logica_de_programacao.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio11_ValidarLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE SEU LOGIN: ");
        String login = sc.next();

        System.out.print("DIGITE SUA SENHA: ");
        int senha = sc.nextInt();

        if (login.equals("admin") && senha == 1234) {
            System.out.print("ACESSO AUTORIZADO");
        } else {
            System.out.print("ACESSO NEGADO");
        }

    }
}
