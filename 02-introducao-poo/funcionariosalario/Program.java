package introducao_poo_02.funcionariosalario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // CRIANDO AS VARIAVEIS
        Funcionario f1, f2;

        // Instanciando (criando o objeto)
        f1 = new Funcionario();
        f2 = new Funcionario();


        System.out.println("Entre com os dados do primeiro funcionário: ");
        f1.name = sc.next();
        f1.horas = sc.nextDouble();
        f1.valor = sc.nextDouble();

        System.out.println("Entre com os dados do segundo funcionário: ");
        f2.name = sc.next();
        f2.horas = sc.nextDouble();
        f2.valor = sc.nextDouble();

        double total = f1.totalValor() + f2.totalValor();

        System.out.printf("Total = %.2f%n", total);




    }
}
