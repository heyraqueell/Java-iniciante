/*
Cadastro de Funcionário: Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
 */
package introducao_poo_02.aumentosalario;

import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee empregado = new Employee();

        System.out.print("Name: ");
        empregado.name = sc.nextLine();

        System.out.print("Gross salary: ");
        empregado.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        empregado.tax = sc.nextDouble();

        System.out.println("Employee: " + empregado);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        empregado.increasePercentage(percentage);

        System.out.println("Update data: " + empregado);

        sc.close();
    }
}
