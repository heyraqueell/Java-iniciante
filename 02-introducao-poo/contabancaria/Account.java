package introducao_poo_02.contabancaria;

public class Account {
    public String holder;
    public double balance;

    public void deposit(double cash) {
        this.balance += cash;
    }

    public String toString() {
        return holder + ", Balance: $" + balance;
    }
}
