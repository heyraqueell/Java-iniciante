/*
Depósito Bancário: Crie um programa para gerenciar o saldo de uma conta bancária simples. Leia o nome do titular e o saldo inicial. Depois, peça um valor para depósito, atualize o saldo e mostre o status final.
*/
package introducao_poo_02.contabancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();

        System.out.print("Account holder: ");
        ac.holder = sc.nextLine();

        System.out.print("Initial balance: ");
        ac.balance = sc.nextDouble();

        System.out.println();
        System.out.println("Status: " + ac);

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        ac.deposit(value);

        System.out.println();
        System.out.println("Updated Status: " + ac);

        sc.close();
    }

}
