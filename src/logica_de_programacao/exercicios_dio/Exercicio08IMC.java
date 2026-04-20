/*
Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição. Fórmula do IMC = peso / (altura) ²
 */
package logica_de_programacao.exercicios_dio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08IMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //INPUT
        System.out.print("Digite seu peso [Kg]: ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura [M]: ");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);

        //CONDIÇÃO
        if (IMC < 18.5) {
            System.out.printf("Seu IMC é %.2f%nABAIXO DO PESO.", IMC);
        } else if (IMC < 25.0) {
            System.out.printf("Seu IMC é %.2f%nPESO IDEAL, PARABÉNS!.", IMC);
        } else if (IMC < 29.9) {
            System.out.printf("Seu IMC é %.2f%nLEVEMENTE ACIMA DO PESO.", IMC);
        } else if (IMC < 34.9) {
            System.out.printf("Seu IMC é %.2f%nOBESIDADE GRAU I", IMC);
        } else if (IMC < 39.9) {
            System.out.printf("Seu IMC é %.2f%nOBESIDADE GRAU II (SEVERA)", IMC);
        } else {
            System.out.printf("Seu IMC é %.2f%nOBESIDADE GRAU III (MÓRBIDA)", IMC);
        }

        sc.close();
    }
}
