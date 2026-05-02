//Exercício feito sozinha a partir das informações que o professor deu (área, largura, valor e comprimento)

package logica_de_programacao_01.estrutura_Sequencial;
import java.util.Locale;
import java.util.Scanner;

public class exercicio03_medir_area_terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //SEMPRE NO TOPO
        Scanner sc = new Scanner(System.in);
        //VARIÁVEIS
        double lar, comp, area, valor, total;
        //TOPO
        System.out.println("----------------------------");
        System.out.println("     MEDIÇÃO DE TERRENO     ");
        System.out.println("----------------------------");

        //COLETANDO INFORMAÇÕES
        System.out.print("Entre com a largura do terreno? ");
        lar = sc.nextDouble();
        System.out.print("Entre com o comprimento do terreno? ");
        comp = sc.nextDouble();
        System.out.print("Valor por metro quadrado: ");
        valor = sc.nextDouble();

        //ATRIBUIÇÕES
        area = lar * comp;
        total = valor * area;

        //PRINT
        System.out.printf("Valor da área: %.2f.", area);
        System.out.printf("\nValor total do terreno: %.2f.", total);

        sc.close(); //NÃO ESQUECER
    }
}
