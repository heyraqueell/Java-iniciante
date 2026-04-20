/*
 Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
 */
package logica_de_programacao.exercicios_dio;

import java.util.Scanner;

public class Exercicio05Decrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maior = 0;
        int medio = 0;
        int menor = 0;

        //maior A
        if (A > B && A > C) {
            maior = A;
            if (B > C) {
                medio = B;
                menor = C;
            } else {
                medio = C;
                menor = B;
            }
        //maior B
        } else if (B > A && B > C) {
            maior = B;
            if (A > C) {
                medio = A;
                menor = C;
            } else {
                medio = C;
                menor = A;
            }
        //maior C
        } else if (C > A && C > B) {
            maior = C;
            if (A > B) {
                medio = A;
                menor = B;
            } else {
                medio = B;
                menor = A;
            }
        }

        System.out.printf("Ordem decrescente: %d %d %d ", maior, medio, menor);
        sc.close();
    }
}