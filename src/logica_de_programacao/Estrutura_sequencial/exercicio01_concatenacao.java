package logica_de_programacao.Estrutura_sequencial;

import java.util.Scanner;

public class exercicio01_concatenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine(); //Next line serve para o nome completo, ou seja, até o usuário dar Enter

        System.out.print("Nome digitado: " + nome + ".");
        sc.close();
    }
}
