/*
Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO
 */
package logica_de_programacao.exercicios_dio;

import java.util.Scanner;

public class Exercicio16Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean res1 = sc.nextBoolean();
        boolean res2 = sc.nextBoolean();

        if (res1 && res2) {
            System.out.println("VERDADEIRO");
        } else if (!res1 && !res2) {
            System.out.println("FALSO");
        } else {
            System.out.println("MISTO");
        }
        sc.close();
    }
}
