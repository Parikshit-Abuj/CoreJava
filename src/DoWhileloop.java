//parikshitabuj
import java.util.Scanner;
public class DoWhileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("enter number between 1 to 10");
            number = scanner.nextInt();
        }
        while (number < 1 || number > 10);
        System.out.println("you picked: " + number);
        scanner.close();
        ;
    }
        }


