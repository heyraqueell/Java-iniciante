package construtores;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Aula Construtores
    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Aula Sobrecarga
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
        //quantity irá inicializar com 0, então não precisa declarar
    }

    // Aula Encapsulamento
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Aulas anteriores (Métodos)
    public double totalValueinStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", U$"
                + String.format("%.2f" , price)
                + ", "
                + quantity
                + " units, Total: U$"
                + String.format("%.2f", totalValueinStock());
    }
}
