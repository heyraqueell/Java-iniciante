/*
 Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu.
 Leve em consideração o ano com 365 dias e o mês com 30 dias.
 */

package logica_de_programacao_01.exercicios_dio;

import java.util.Scanner;

public class Exercicio12AnosMesesDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Em que ano você nasceu? ");
        int ano = sc.nextInt();

        int idade = 2026 - ano;
        int meses = idade * 12;
        int dias =  idade * 365;

        System.out.printf("Você tem %d anos, %d meses e %d dias de vida", idade, meses, dias);
        sc.close();
    }
}
