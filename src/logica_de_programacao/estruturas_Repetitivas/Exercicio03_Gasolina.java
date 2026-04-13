package logica_de_programacao.estruturas_Repetitivas;

import java.util.Scanner;

public class Exercicio03_Gasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //VARIÁVEIS
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        //HEAD
        System.out.println("""
                ------------------------
                BEM-VINDO AO POSTO SHELL
                ------------------------""");

        System.out.println("""
                Selecione seu pedido
                1. Álcool
                2. Gasolina
                3. Diesel
                4. FIM
                ------------------------""");

        //INPUT
        int pedido = sc.nextInt(); //Primeiro entrada
        while (pedido != 4) { //Vai verificar se o valor é diferente de 4, se sim, vai entrar no while
            if (pedido == 1) {
                alcool += 1;
            } else if (pedido == 2) {
                gasolina += 1;
            } else if (pedido == 3) {
                diesel += 1;
            } //fim if-else
        pedido = sc.nextInt(); //Entradas posteriores
        } //fim while

        System.out.println("MUITO OBRIGADA!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
