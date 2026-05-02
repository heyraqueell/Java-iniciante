/*
Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
 */
package logica_de_programacao_01.exercicios_dio;

import java.util.Scanner;

public class Exercicio10MaiorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Quantos anos você tem? ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " NÃO é maior de idade.");
        }
        sc.close();
    }
}
