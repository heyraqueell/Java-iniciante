/* Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor. */

package logica_de_programacao_01.exercicios_dio;

import java.util.Scanner;

public class Exercicio04Antecessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =  sc.nextInt();
        int antNum = num - 1; //Antecessor
        int sucNum = num + 1; //Sucessor

        System.out.println("Antecessor: " + antNum);
        System.out.println("Seu número: " + num);
        System.out.println("Sucessor: " + sucNum);

        sc.close();
    }
}
