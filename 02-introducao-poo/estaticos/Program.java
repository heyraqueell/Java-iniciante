package introducao_poo_02.estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? U$");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? U$");
        double dollarBuy = sc.nextDouble();

        double paidReais = Convert.finalDollar(dollarPrice, dollarBuy);
        System.out.printf("Amount to be paid in reais: R$%.2f%n", paidReais);

        sc.close();
    }
}