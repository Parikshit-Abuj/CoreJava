//parikshitabuj
import java.util.Scanner;
public class Quitgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response= "";
        while(!response.equals("Q")){
            System.out.print("you are playing a game: ");
            System.out.print("press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("you have quit the game");
        scanner.close();

        
    }
}
