// ParikshitAbuj
import java.util.Scanner;
public class Circumference {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        double circumference;
        double radius;
        double area;
        double volume;

        System.out.print("enter radius: ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3/0) * Math.PI * Math.pow(radius, 3);

        System.out.println("circumference is" + circumference + "cm");
        System.out.println("Area is " + area + "cm square");
        System.out.println("voume is" + volume + "cm cube");
    }


}
