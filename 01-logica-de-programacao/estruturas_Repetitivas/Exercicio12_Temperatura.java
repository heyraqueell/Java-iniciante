package logica_de_programacao_01.estruturas_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12_Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do { //Faça
            System.out.print("Digite a temperatura em Celsius: ");
            Double C = sc.nextDouble();
            Double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
            System.out.println("Deseja continuar? [S/N] ");
            resp = sc.next().charAt(0); //Apenas letra na posição 0
        } while (resp != 'N');

        sc.close();
    }
}
