/*
Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago.
 */
package logica_de_programacao_01.exercicios_dio;

import java.util.Scanner;

public class Exercicio06Desconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorFinal = 0;

        //INPUT
        System.out.print("Digite o valor do produto: R$");
        double valor = sc.nextDouble();

        System.out.println("""
                Tabela de Código de Condições de Pagamento
                 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
                 2 - À Vista no cartão de crédito, recebe 10% de desconto
                 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
                 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%""");

        System.out.print("Selecione a forma de pagamento: ");
        int pg = sc.nextInt();

        //DESCONTO
        if (pg == 1) {
            valorFinal = valor * 0.85;
        } else if (pg == 2) {
            valorFinal = valor * 0.90;
        } else if (pg == 3) {
            valorFinal = valor;
        } else if (pg == 4) {
            valorFinal = valor * 1.10;
        } else {
            System.out.println("Valor inválido.");
        }

        System.out.printf("Valor a pagar: R$%.2f%n ", valorFinal);
        sc.close();
    }
}
