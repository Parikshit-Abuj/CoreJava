//parikshitabuj
import java.util.Scanner;
public class SubStringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("enter email: ");
        email = scanner.next();
        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") +1);

            System.out.println("username is " + username);
            System.out.println("domain is " + domain);}
        else {
            System.out.println("email must contain @");
        }




    }
}
