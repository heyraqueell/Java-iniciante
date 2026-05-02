//Ao ter várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar o switch-case.

package logica_de_programacao_01.estrutura_Condicional;
import java.util.Scanner;

public class Exercicio12_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        String dia;
        //HEAD
        System.out.println("--------------------------------");
        System.out.println("        Qual o dia?      ");
        System.out.println("--------------------------------");

        //INSERÇÃO DE DADOS
        System.out.print("Digite um n° equivalente a um dia da semana: ");
        num = sc.nextInt();

        //Switch-case
        switch (num) {
            //Pode ser usado "case 1:". Porém, será obrigatório utilizar o break no final de cada case.
            case 1 -> dia = "Domingo";
            case 2 -> dia = "Segunda";
            case 3 -> dia = "Terça";
            case 4 -> dia = "Quarta";
            case 5 -> dia = "Quinta";
            case 6 -> dia = "Sexta";
            case 7 -> dia = "Sábado";
            default -> dia = "Valor inválido";
        }
        System.out.print("Dia da semana é " + dia);
        sc.close();
    }

}
