package logica_de_programacao_01.estrutura_Condicional;

import java.util.Scanner;

public class Exercicio02_composta {
    public static void main(String[] args) {
        int hora;
        Scanner sc = new Scanner(System.in);

        System.out.println("Condição Composta");
        System.out.println("Que horas são? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else {
            System.out.print("Boa tarde!");
        }
        sc.close();
    }
}
