//Uma empresa decidiu dar um aumento de salário aos seus funcionários conforme tabela abaixo.
// Escreva um programa que leia o salário atual de um funcionário e calcule seu novo salário.
// Exercício solicitado pelo GEMINI e resolvido por mim (Sozinha)

package logica_de_programacao_01.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio10_AumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sal, novoSal;

        System.out.print("Digite seu salário: ");
        sal = sc.nextDouble();

        if (sal <= 2000.0) {
            novoSal = sal * 1.15;
        } else if (sal > 2000.0 && sal <= 5000.0) {
            novoSal = sal * 1.10;
        } else {
            novoSal = sal * 1.05;
        }
        System.out.printf("Seu novo salário é: R$%.2f", novoSal);
        sc.close();
    }
}
