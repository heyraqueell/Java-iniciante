//Programa para ler nota do aluno (0-100)
//Caso a nota seja menor que 60, exibir a mensagem “REPROVADO”.

package logica_de_programacao.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio05_media {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner sc = new Scanner(System.in);

        //HEAD
        System.out.println("----------------------");
        System.out.println("ESCOLA LISBOA DE SOUZA");
        System.out.println("----------------------");

        //INSERÇÃO DE DADOS
        System.out.print("Digite sua 1° nota: ");
        n1 = sc.nextDouble();

        System.out.print("Digite sua 2° nota: ");
        n2 = sc.nextDouble();

        media = (n1 + n2) / 2;

        //CONDIÇÃO IF ELSE
        if (media < 60) {
            System.out.print("ALUNO REPROVADO COM MÉDIA " + media);
        }
        else {
            System.out.print("ALUNO APROVADO COM MÉDIA " + media);
        }
        sc.close();
    }

}
