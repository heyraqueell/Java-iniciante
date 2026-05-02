package introducao_poo_02.celular;

public class Phone {
    public String brand;
    public int bateryLevel;

    public void charge (int amount) {
        this.bateryLevel += amount;
    }

    public String toString() {
        return brand + ", Bateria em " + bateryLevel + "%";
    }
}
