//ParikshitAbuj

import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[]args) {
        double width;
        double height;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("width:");
        width = scanner.nextDouble();
        System.out.println("height");
        height = scanner.nextDouble();
        area = width * height;
        System.out.println("Area is " +area);
        scanner.close();
    }
}
