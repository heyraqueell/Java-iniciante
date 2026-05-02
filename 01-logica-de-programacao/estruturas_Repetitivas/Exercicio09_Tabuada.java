/*Exercício sugerido pelo GEMINI
FEITO SOZINHA E SEM CONSULTA */
package logica_de_programacao_01.estruturas_Repetitivas;
import java.util.Scanner;

public class Exercicio09_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual tabuada você deseja consultar? ");
        int N = sc.nextInt();

        for (int i = 0; i <= 10; i++) { //laço de 0 a 10
            int x = N * i; // x recebe o resultado de N x o contador
            // x é uma variável temporária utilizada apenas para guardar o resultado temporariamente
            System.out.println(N + " x " + i + " = " + x);
        }
    }
}
