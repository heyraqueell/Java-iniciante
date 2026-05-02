/*
Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
 */

package logica_de_programacao_01.exercicios_dio;

import java.util.Scanner;

public class Exercicio15Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("Quociente: " + A / B);
        System.out.println("Resto da divisão: " + A % B);
        sc.close();
    }
}
