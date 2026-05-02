package introducao_poo_02.estoqueaula01;

public class Product {
    public String name;
    public double price;
    public int quantity;

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