package logica_de_programacao.estruturas_Repetitivas;
import java.util.Scanner; //Importar Scanner

public class Exercicio01_While {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) { //Enquanto x for diferente de 0
            soma += x;   //soma = soma + x;
            x =  sc.nextInt(); //x continua recebendo valores
        }
        System.out.println(soma);

        sc.close();
    }
}
