//ParikshitAbuj
import java.util.Scanner;
public class Hypotenuse {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter a: ");
        a = scanner.nextDouble();

        System.out.print("Enter b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println(c);

        scanner.close();
    }
}
