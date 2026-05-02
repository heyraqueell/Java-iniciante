package logica_de_programacao_01.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio03_encadeamento {
    public static void main (String [] args){
        int hora;
        Scanner sc = new Scanner(System.in);

        System.out.println("Condição Composta");
        System.out.print("Que horas são? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else if (hora < 18){
            System.out.print("Boa tarde!");
        }
        else{
            System.out.print("Boa Noite!");
        }
        sc.close();
    }
}
