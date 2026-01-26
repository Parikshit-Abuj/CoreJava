//parikshitabuj
import java.util.Scanner;
public class IfelseAge {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("enter age:");
        age = scanner.nextInt();
        if( age >= 18 ) {
            System.out.println("you are adult"); }
        else if (age < 0) {
            System.out.println("you are not born yet");
        }
        else if (age==0){
            System.out.println("you are a baby");
        }
        else {
            System.out.println("you are child");
            scanner.close();
        }
    }
}
