// Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
package logica_de_programacao_01.exercicios_dio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03Reajuste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        double novoNum = (num * 0.05) + num;

        System.out.printf("%.2f", novoNum);

        sc.close();
    }
}
