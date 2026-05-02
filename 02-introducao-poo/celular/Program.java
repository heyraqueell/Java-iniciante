/*
Nível de Bateria (Celular): Crie um programa para monitorar a carga de um celular. Você deve ler a marca e a carga inicial (0 a 100). Depois, use um método para carregar o celular com um valor informado e mostre o resultado final.
 */
package introducao_poo_02.celular;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone phone1 = new Phone();

        System.out.println("Marca: ");
        phone1.brand = sc.nextLine();

        System.out.println("Carga inicial: ");
        phone1.bateryLevel = sc.nextByte();

        System.out.println("Status: " + phone1);

        System.out.println("Quanto deseja carregar? ");
        int valueBatery = sc.nextByte();
        phone1.charge(valueBatery);

        System.out.println("Status atualizado: " + phone1);

    }
}
