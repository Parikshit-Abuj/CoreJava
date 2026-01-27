//parikshitabuj
import java.util.Random;
import java.util.Scanner;
public class Numberguessinggame {
    public static void main() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts=0;
        int randomNumber = random.nextInt(1,11);
        System.out.println("Number guessing game");
        System.out.println("guess a number between 1 to 10");
        do{
            System.out.println("enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess<randomNumber){
                System.out.println("too low try again "); }
            else if (guess > randomNumber) {
                System.out.println("too high try again");}
            else{
                System.out.println("guess was correct " +randomNumber);
                System.out.println("attempts: " +attempts);

            }

        }while(guess != randomNumber);
        scanner.close();
    }
}
