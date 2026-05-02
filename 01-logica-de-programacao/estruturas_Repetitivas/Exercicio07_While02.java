/* Escreva um programa que leia vários números inteiros, um após o outro. O laço deve ser encerrado apenas quando o usuário digitar o número 99. Ao final, o programa deve mostrar quantos números foram digitados (antes do 99). Exercício sugerido pelo GEMINI. */

package logica_de_programacao_01.estruturas_Repetitivas;
import java.util.Scanner;

public class Exercicio07_While02 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cont = 0;

        while (N != 99) {
            cont += 1;
            N = sc.nextInt();
        }
        System.out.println("Total de números digitados: " + cont);
        sc.close();
    }
}
