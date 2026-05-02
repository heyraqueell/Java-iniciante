//Feito com um pouco da ajuda do Professor

package logica_de_programacao_01.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio08_DuracaoPartida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duracao;
        //HEAD
        System.out.println("----------------------");
        System.out.println("   CALCULO DE HORAS   ");
        System.out.println("----------------------");

        //INSERÇÃO DE DADOS
        System.out.print("Que horas começou o jogo? ");
        int h1 = sc.nextInt();

        System.out.print("Que horas começou o jogo? ");
        int h2 = sc.nextInt();

        if (h1 < h2){
            duracao = h2 - h1;
        } else {
            duracao = 24 - h1 + h2;
            //A variável duração começa com 24, logo após ela perde 12 horas e ganha mais 12 horas. Por isso retorna 24 horas.
        }

        System.out.print("O jogo durou: " + duracao + " horas");
        sc.close();
    }
}
