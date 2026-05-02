package introducao_poo_02.notaaluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        // INPUT
        System.out.print("Student: ");
        st.name = sc.nextLine();

        System.out.print("1st note: ");
        st.n1 = sc.nextDouble();

        System.out.print("2nd note: ");
        st.n2 = sc.nextDouble();

        System.out.print("3rd note: ");
        st.n3 = sc.nextDouble();

        // DECIDE
        if (st.finalNotes() >= 60.00) {
            System.out.println("PASS");
            System.out.println("FINAL GRADE = " + st);
        } else {
            System.out.println("FAILED");
            System.out.println("FINAL GRADE = " + st);
            System.out.println("MISSING " + String.format("%.2f" , st.missingPoints()) + " POINTS");
        }



    }
}
