//Fazer um programa para ler quatro valores inteiros A, B, C e D.
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package logica_de_programacao_01.estrutura_Sequencial;
import java.util.Scanner;

public class exercicio05_calculaDif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, result;

        //COLETA DE DADOS
        System.out.print("Digite o 1° valor: ");
        A = sc.nextInt();
        System.out.print("Digite o 2° valor: ");
        B = sc.nextInt();
        System.out.print("Digite o 3° valor: ");
        C = sc.nextInt();
        System.out.print("Digite o 4° valor: ");
        D = sc.nextInt();

        //OPERAÇÃO
        result = (A * B - C * D);

        System.out.printf("A diferença entre os valores é: %d", result);
        sc.close();
    }
}


