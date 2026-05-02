/*Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.*/
package logica_de_programacao_01.exercicios_dio;

import java.util.Scanner;

public class Exercicio01MenorQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int soma = A + B;

        System.out.println("A soma de " + A + " + " +  B + " é: " + soma);
        if (soma < C) {
            System.out.println( soma + " é menor que " + C);
        } else {
            System.out.println( soma + " não é menor que " + C);
        }
        sc.close();
    }
}
