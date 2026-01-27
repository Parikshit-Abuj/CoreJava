//parikshitabuj
import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = " ";
        while(name.isEmpty()){
            System.out.print("enter name: ");
            name = scanner.nextLine();
        }
        System.out.println("hello " + name);
        scanner.close();
    }
}
