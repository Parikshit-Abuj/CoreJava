//parikshitabuj
import java.util.Scanner;
public class Enhancedswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter day of week: ");
        String day = scanner.nextLine();
        switch(day){
            case "Monday","tuesday"  ->
                    System.out.println("its weekday");
            case "sudnday" ->
                    System.out.println("its holiday");
            default ->
                    System.out.println("its invalid day " + day);
        }


    }
}
