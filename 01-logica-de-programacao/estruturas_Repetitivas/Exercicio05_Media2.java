package logica_de_programacao_01.estruturas_Repetitivas;
import java.util.Scanner;
//Feito com a ajuda do professor Nélio

public class Exercicio05_Media2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int cont = 0;
        int soma = 0;
        double media = 0;

        while (idade >= 0) {
            soma += idade;
            cont += 1;
            idade = sc.nextInt();
        }
        if (cont > 0) {
            media = (double) soma / cont; //transformar int em double
            System.out.printf("Media: %.2f \n", media);
        } else {
            System.out.println("Impossível calcular");
        }
        sc.close();
    }
}
