/* Escreva um programa que leia números inteiros do teclado um após o outro.
O programa deve somar apenas os números que forem pares.
O laço deve parar assim que o usuário digitar o número 0.
Ao final, exiba a soma dos números pares digitados.*/

package logica_de_programacao.estruturas_Repetitivas;
import java.util.Scanner;

public class Exercicio08_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        while (N != 0) { //Enquanto N for diferente de 0
            if ((N % 2 == 0)) { // e SE o resto da divisão de N por 2 for 0
                soma += N;  // Então soma atribui o valor
            }
            N = sc.nextInt(); //Sempre inserir o input do dado dentro do laço novamente
        }
        System.out.println("Soma dos números pares: " + soma);
        sc.close(); //Sempre fechar o Scanner
    }
}
