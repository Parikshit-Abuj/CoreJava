//parikshitabuj
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0;
        boolean validOperation = true;
        char operator;
        System.out.println("enter num1: ");
        num1 = scanner.nextDouble();
        System.out.println("enter an operator(+,-,*,/,^):");
        operator = scanner.next().charAt(0);
        System.out.println("enter num2: ");
        num2 = scanner.nextDouble();
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by zero");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default ->  {
                System.out.println("invalid operator");
                validOperation = false;
            }
        }
        if (validOperation)
            System.out.println(result);
        scanner.close();
    }
}








