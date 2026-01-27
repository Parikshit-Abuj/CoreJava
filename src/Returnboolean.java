//parikshitabuj
import java.util.Scanner;
public class Returnboolean {
    public static void main(String[] args) {
        int age= 21;
        if(ageCheck(age)){
            System.out.println("you may sign up");
        }
        else{
            System.out.println("you must be 18");
        }
    }
    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
