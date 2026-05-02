//“Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
//o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.”

package logica_de_programacao_01.estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07_loja {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //VARIÁVEIS
        int id1, id2, qtn, qtn2;
        double valor, valor2, total;

        //HEAD
        System.out.println("--------------------------");
        System.out.println("  BEM-VINDO A LOJA SOUZA  ");
        System.out.println("--------------------------");

        //COLETA DE DADOS
        System.out.print("Digite o ID 1° do produto: ");
        id1 = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        qtn = sc.nextInt();
        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();

        System.out.print("Digite o ID do 2° produto: ");
        id2 = sc.nextInt();
        System.out.print("Digite a quantidade: ");
        qtn2 = sc.nextInt();
        System.out.print("Digite o valor do produto: ");
        valor2 = sc.nextDouble();

        //OPERAÇÃO
        total = (qtn * valor) + (qtn2 * valor2);

        //PRINT
        System.out.printf("Valor total da compra: R$%.2f", total);
        sc.close();
    }
}
