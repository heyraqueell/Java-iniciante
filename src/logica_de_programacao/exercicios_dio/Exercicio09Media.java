/*
 Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
 */
package logica_de_programacao.exercicios_dio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09Media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String aluno = sc.nextLine();

        double notasTotal = 0;

        for (int i = 1; i <= 4; i++){
            System.out.print("Digite sua " + i + "° nota: ");
            double nota = sc.nextDouble();
            notasTotal += nota;
        }
        double media = notasTotal / 4;

        if (media >= 7.0) {
            System.out.println("ALUNO APROVADO.");
        } else {
            System.out.println("ALUNO REPROVADO.");
            System.out.println("MÉDIA ESPERADA: 7.00");
        }
        System.out.printf("%s, sua média é de %.2f%n", aluno, media);

        sc.close();
    }
}
