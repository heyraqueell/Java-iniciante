package introducao_poo_02.estaticos;

public class Convert {

    public static final double IOF = 1.06;
    public static double finalDollar(double dolarPrice, double dollarBuy ) {
        return dolarPrice * dollarBuy * IOF;
    }
}
