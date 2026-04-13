package logica_de_programacao.estruturas_Repetitivas;
import java.util.Scanner;

public class Exercicio04_Crescente {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("""
                ---------------------
                DIGITE DOIS VALORES: 
                ---------------------""");

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != Y) {
            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }
        sc.close();
    }
}
