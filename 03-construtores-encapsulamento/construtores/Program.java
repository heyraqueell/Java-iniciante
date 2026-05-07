package construtores;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product produto = new Product(name, price);

        System.out.println();
        System.out.println("Product data: " + produto);

        //adding products
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int addQnt = sc.nextInt();
        produto.addProduct(addQnt);

        System.out.println();
        System.out.println("Update data: " + produto);

        //removing products
        System.out.println();
        System.out.print("Enter the number of products to be REMOVED in stock: ");
        int removeQnt = sc.nextInt();
        produto.removeProduct(removeQnt);

        System.out.println();
        System.out.print("Update data: " + produto);
        sc.close();
    }
}
