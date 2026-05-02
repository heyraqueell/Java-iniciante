package introducao_poo_02.retangulo;

public class Calculo {
    public double width;
    public double height;

    public double area() {
        return this.width * this.height;
    }
    public double perimeter () {
        double p = 2 * (this.width + this.height);
        return p;
    }

    public String toString() {
        return "AREA = " + String.format("%.2f", area()) + "\n" +
                "PERIMETER = " + String.format("%.2f", perimeter());
    }

}
