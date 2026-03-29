package logica_de_programacao.Estrutura_sequencial;
import java.util.Scanner;

public class exercicio04_soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //VARIÁVEIS
        int n1, n2, soma;

        //INPUT
        System.out.print("Digite o 1° valor: ");
        n1 = sc.nextInt();
        System.out.print("Digite o 2° valor: ");
        n2 = sc.nextInt();

        soma = n1 + n2;

        //OUTPUT
        System.out.printf("A soma entre %d e %d é de %d.", n1, n2, soma);
        sc.close();
    }
}
