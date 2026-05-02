//“Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
// o valor que recebe por hora e calcula o salário desse funcionário.
// A seguir, mostre o número e o salário do funcionário, com duas casas decimais.”

package logica_de_programacao_01.estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06_calculaSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //VARIÁVEIS
        int id;
        double horas, valor, res;

        //COLETA DE DADOS
        System.out.print("Digite seu id: ");
        id = sc.nextInt();
        System.out.print("Digite suas horas trabalhadas: ");
        horas = sc.nextDouble();
        System.out.print("Digite o valor pago por hora: ");
        valor = sc.nextDouble();

        //OPERAÇÃO
        res = horas * valor;

        //PRINT
        System.out.println("NUMBER: " + id);
        System.out.printf("SALARY: U$%.2f", res);
        sc.close();
        
    }
}
