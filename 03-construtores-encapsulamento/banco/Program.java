package banco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int numAccount = sc.nextInt();
        Account bc;

        System.out.print("Is there an initial deposit? [y/n] ");
        char resp = sc.next().charAt(0);

        if (resp == 'y') {
            System.out.print("Enter initial deposit value: $");
            double initialDeposit = sc.nextDouble();
            bc = new Account(name,numAccount, initialDeposit);
        } else {
            bc = new Account(name, numAccount);
        }

        System.out.println();
        System.out.println("Account data: \n" + bc);

        System.out.print("\nEnter a deposit value: $");
        double deposit = sc.nextDouble();
        bc.deposit(deposit);

        System.out.println("Update account data: " + bc);

        System.out.print("\nEnter withdraw value: $");
        double withdraw = sc.nextDouble();
        bc.withdraw(withdraw);

        System.out.println("Update account data: " + bc);

        sc.close();
    }
}
