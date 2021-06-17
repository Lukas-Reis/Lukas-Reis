package order;

import java.util.Locale;
import java.util.Scanner;
import dolar.CurrencyConverter;

public class Order {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        CurrencyConverter cc = new CurrencyConverter(); //Construtor padrão

        System.out.print("What is the dollar price: ");
        cc.dollarprice = sc.nextDouble();

        System.out.print("How many dollars will be bought: ");
        cc.dollarbought = sc.nextDouble();

        System.out.print("Amount to be paid in reais = " + cc.Convert());

    }
}
