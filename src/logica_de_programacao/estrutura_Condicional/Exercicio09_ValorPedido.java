//Escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
//Feito sozinha:

package logica_de_programacao.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio09_ValorPedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        //HEAD
        System.out.println("--------------------------------");
        System.out.println(" CÓDIGO |  ESPECIFICAÇÃO  | VALOR ");
        System.out.println("--------------------------------");
        System.out.println("   1    |    MINI PIZZA   | R$4,00 ");
        System.out.println("   2    |    X-BACON      | R$7,00 ");
        System.out.println("   3    |    X-SALADA     | R$6,00 ");
        System.out.println("   4    |    COXINHA      | R$5,50 ");
        System.out.println("   5    | CACHORRO QUENTE | R$7,55 ");

        System.out.println(); //gap

        //INSERÇÃO DE DADOS
        System.out.println("--------------------------------");
        System.out.print("Entre com o código do seu pedido: ");
        int code = sc.nextInt();

        System.out.print("Quantidade: ");
        int qnt = sc.nextInt();

        if (code == 1) {
            total = 4 * qnt;
        } else if (code == 2) {
            total = 7 * qnt;
        } else if (code == 3) {
            total = 6 * qnt;
        } else if (code == 4) {
            total = 5.5 * qnt;
        } else {
            total = 7.55 * qnt;
        }
        //Iria colocar o else como 'Valor inválido', mas professor pediu desse jeito.
        System.out.printf("Valor a pagar: R$%.2f", total);

        sc.close();
    }
}
