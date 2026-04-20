/*
Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
 */
package logica_de_programacao.exercicios_dio;

import java.util.Scanner;

public class Exercicio11InverterValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        int aux = A;
        A = B;
        B = aux;

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        sc.close();
    }
}
