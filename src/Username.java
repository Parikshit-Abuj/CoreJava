//parikshitabuj
import java.util.Scanner;
public class Username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.print("enter username ");
        username= scanner.nextLine();

        if( username.length() < 4 || username.length() > 2 ) {
            System.out.println("user name must be in 4 to 12 char:");
        }
        else if (username.contains(" ") || username.contains("_")){
            System.out.println("username must not contaon spaces or underscore");
        }
        else {
            System.out.println("welcome " + username);
        }
        scanner.close();

    }
}
