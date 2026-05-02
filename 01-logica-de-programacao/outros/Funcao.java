package logica_de_programacao_01.outros;

import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max (a, b, c);

        showResult(higher);
        sc.close();
    }

    public static int max (int x, int y, int z) { //Metodo para encontrar o maior entre os números
        int maior;
         if (x > y && x > z) {
             maior = x;
         } else if (y > z) {
           maior = y;
         } else {
             maior = z;
         }
         return maior; //Retornar o resultado
    }

    public static void showResult(int value) { //nome de esboço - mostrar retorno na tela
        System.out.println("Higher: " + value);
    }

}
