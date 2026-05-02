/*
Controle de Volume da TV: Crie um programa para gerenciar o volume de uma TV. Leia a marca e o volume atual. Depois, peça um valor para aumentar o volume, chame o método e mostre o status final.
 */

package introducao_poo_02.tv;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TV tv = new TV();

        System.out.print("Tv brand: ");
        tv.brand = sc.nextLine();

        System.out.print("Initial Volume: ");
        tv.volume = sc.nextByte();

        System.out.println("Status: " + tv);

        System.out.print("How much to increase volume? ");
        byte increase = sc.nextByte();
        tv.increaseVolume(increase);

        System.out.println("Updated status : " + tv);

        sc.close();
    }
}
