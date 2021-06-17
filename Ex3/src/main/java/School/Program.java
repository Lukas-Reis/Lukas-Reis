package School;

import java.util.Scanner;
import Note.Student;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Name: ");
        student.name = sc.nextLine();

        System.out.print("Enter your grades from the last quarter: ");
        System.out.println();

        System.out.println("Note 1: ");
        student.n1 = sc.nextDouble();
        System.out.println("Note 2: ");
        student.n2 = sc.nextDouble();
        System.out.println("Note 3: ");
        student.n3 = sc.nextDouble();

        System.out.println(student);







    }
}
