//Ler 3 números inteiros e em seguida mostrar o maior entre eles.

package logica_de_programacao.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio06_qual_o_maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //HEAD
        System.out.println("----------------------");
        System.out.println("     QUAL O MAIOR?    ");
        System.out.println("----------------------");

        System.out.print("Digite 3 números: ");

        //DECLARAÇÃO DE VARIÁVEIS
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        //INSERÇÃO DE DADOS

        //CONDIÇÃO IF ELSE
        if ((n1 > n2) && (n1 > n3)){
            System.out.print(n1 + " é o maior número.");
        }
        else if ((n2 > n1) && (n2 > n3)){
            System.out.print(n2 + " é o maior número.");
            //CORREÇÃO: n1 já foi comparado com n2, então não precisa comparar n2 com n1 novamente, apenas com o n3.
        }
        else {
            System.out.print(n3 + " é o maior número.");
        }
        sc.close();
    }
}