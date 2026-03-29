package logica_de_programacao.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio04_Verificar_negativo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("VERIFICAÇÃO DE NÚMERO");
        System.out.print("ENTRE COM UM NÚMERO: ");
        num = sc.nextInt();

        //CONDIÇÃO IF ELSE
        if (num < 0) {
            System.out.print("NUMERO " + num + " é NEGATIVO.");
        }
        else {
            System.out.print("NUMERO " + num + " é POSITIVO.");
        }
        sc.close();
    }
}
