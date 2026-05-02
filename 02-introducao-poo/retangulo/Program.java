package introducao_poo_02.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculo c1 = new Calculo();

        System.out.println("Enter rectangle with width and height: ");
        c1.width = sc.nextDouble();
        c1.height = sc.nextDouble();

        System.out.println(c1);

    }
}
