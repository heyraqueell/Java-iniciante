package logica_de_programacao.estruturas_Repetitivas;
import java.util.Scanner;

public class Exercicio06_Para {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes o laço deve rodar? ");
        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++) { //i começa com 0, se i for menor que N, i + 1
            int x = sc.nextInt(); //variável temporária, vai capturar o valor que o usuário digitar e entregar para a soma.
            soma += x;
        }
        System.out.println(soma);
        sc.close();
    }
}
