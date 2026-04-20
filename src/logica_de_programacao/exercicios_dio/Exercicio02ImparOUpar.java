/*Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.*/
package logica_de_programacao.exercicios_dio;

import java.util.Scanner;

public class Exercicio02ImparOUpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //Verificar se é ímpar ou par
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é PAR");
        } else {
            System.out.println("O número " + num + " é IMPAR");
        }

        //Verificar se é Positivo ou Negativo
        if (num > 0) {
            System.out.println("O número " + num + " é POSITIVO");
        } else if (num == 0) {
            System.out.println("O número " + num + " é NEUTRO");
        } else {
            System.out.println("O número " + num + " é NEGATIVO");
        }
        sc.close();
    }

    public static class Exercicio15_somaValores {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = 0;

            if (A == B) {
                C = A + B;
                System.out.println("Soma dos valores iguais: " + C);
            } else {
                C = A * B;
                System.out.println("Multiplicação dos valores: " + C);
            }
            sc.close();
        }
    }
}
