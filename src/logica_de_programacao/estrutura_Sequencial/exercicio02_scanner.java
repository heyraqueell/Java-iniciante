package logica_de_programacao.estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, gen;
        int idade;
        double kg, sal;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine(); //Texto até encerrar com Enter

        System.out.print("Quantos anos você tem? ");
        idade = sc.nextInt(); //Tipo inteiro

        System.out.print("Qual o seu gênero? ");
        gen = sc.next(); //Lê apenas a primeira palavra

        Locale.setDefault(Locale.US);
        System.out.print("Quanto você pesa? ");
        kg = sc.nextDouble();

        System.out.print("Quanto você recebe? ");
        sal = sc.nextDouble();

        System.out.printf("Seu nome é %s, sua idade é %d, seu gênero é %s, pesa %.2f e recebe %.3f ao mês.", nome, idade, gen, kg, sal);
        sc.close();
    }
}
