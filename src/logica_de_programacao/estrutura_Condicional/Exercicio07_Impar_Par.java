//Verificar se um número é IMPAR ou PAR
//Código feito com um pouco de ajuda do professor, pois não estava acertando onde colocar o %

package logica_de_programacao.estrutura_Condicional;

import java.util.Scanner;

public class Exercicio07_Impar_Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //HEAD
        System.out.println("----------------------");
        System.out.println("  IMPAR OU PAR?   ");
        System.out.println("----------------------");

        //INSERÇÃO DE DADOS
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        //CONDIÇÃO IF ELSE
        if ((num%2) == 0){
            System.out.print(num + " é PAR.");
        }
        else{
            System.out.print(num + " é IMPAR.");
        }
        sc.close();
    }
}
