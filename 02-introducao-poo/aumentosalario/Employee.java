package introducao_poo_02.aumentosalario;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increasePercentage(double percentage) {
        this.grossSalary += (this.grossSalary * percentage / 100.0);
    }

    public String toString() {
        return name + ", $" + String.format("%.2f" ,netSalary());
    }


}
