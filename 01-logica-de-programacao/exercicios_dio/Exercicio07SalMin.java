/*
Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
 */

package logica_de_programacao_01.exercicios_dio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07SalMin {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1293.20;

        System.out.println("Digite seu salário: ");
        double salarioFun = sc.nextDouble();

        double calculo = salarioFun / salarioMinimo;

        System.out.printf("Você ganha %.1f salários mínimos", calculo);

        sc.close();
    }
}
