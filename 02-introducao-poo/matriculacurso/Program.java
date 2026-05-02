/*
Cadastro de Aluno: Crie um programa para ler o nome de um aluno e o curso em que ele está matriculado. Em seguida, mostre os dados. Depois, peça para o usuário informar um novo curso, atualize essa informação no objeto e mostre os dados atualizados.
 */
package introducao_poo_02.matriculacurso;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataCourse course = new DataCourse();

        System.out.println("Enter student data:");
        System.out.print("Name: ");
        course.name = sc.nextLine();

        System.out.print("Course: ");
        course.course = sc.nextLine();

        System.out.println();
        System.out.println("Student data: " + course);

        System.out.println();
        System.out.print("Enter new course: ");
        String newCourse = sc.nextLine();
        course.updateCourse(newCourse);

        System.out.println("Update data: " + course);

        sc.close();

    }
}
