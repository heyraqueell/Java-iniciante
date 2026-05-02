/*
Descrição: Desenvolva um programa para gerenciar o estoque de um produto, permitindo a entrada de dados iniciais, a adição e a remoção de unidades, exibindo sempre o valor total atualizado em estoque.
 */
package introducao_poo_02.estoqueaula01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product produto = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        produto.name = sc.nextLine();

        System.out.print("Price: ");
        produto.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        produto.quantity = sc.nextInt();

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
