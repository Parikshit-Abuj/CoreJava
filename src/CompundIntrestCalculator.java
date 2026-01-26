//parikshitabuj
import java.util.Scanner;
public class CompundIntrestCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timescompound;
        int years;
        double amount;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter rate: ");
        rate = scanner.nextDouble();
        System.out.print("enter timescompund:" );
        timescompound = scanner.nextInt();
        System.out.print("Enter number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timescompound, timescompound*years);
        System.out.println("the amount after years " + years + "is " + amount + "$");
        scanner.close();

    }
}
