package answer;

import java.util.Locale;
import java.util.Scanner;
import calculation.Calculate;

public class Answering {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculate calculate = new Calculate();

       System.out.print("Enter with the Width: ");
       calculate.Width = sc.nextDouble();

        System.out.print("Enter with the Height: ");
        calculate.Height = sc.nextDouble();

        System.out.println();

        System.out.println("AREA " +calculate.Area());
        System.out.println("PERIMETER " +calculate.Perimeter());
        System.out.println("DIAGONAL " +calculate.Diagonal());

        sc.close();

    }
}
