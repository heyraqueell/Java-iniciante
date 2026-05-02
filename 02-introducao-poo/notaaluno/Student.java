package introducao_poo_02.notaaluno;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double finalNotes() {
        return (this.n1 +this.n2 + this.n3) ;
    }

    public String toString() {
        return  String.format("%.2f" ,finalNotes());
    }
    public double missingPoints() {
        return 60 - finalNotes();
    }


}
