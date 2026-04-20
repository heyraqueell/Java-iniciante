/*
Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
 */
package logica_de_programacao.exercicios_dio;

import java.util.Scanner;

public class Exercicio13Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && A == C) {
            System.out.println("Triangulo é EQUILÁTERO");
        } else if (A != B && A == C || A == B && A != C){ //Não é o jeito ideal, da pra melhorar
            System.out.println("Triangulo é ISÓSCELES");
        }else {
            System.out.println("Triangulo é ESCALENO");
        }
        sc.close();
    }
}
