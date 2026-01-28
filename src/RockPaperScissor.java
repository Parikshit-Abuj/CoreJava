//parikshitabuj
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        do {
            System.out.println("enter your move(rock,paper,scissor): ");

            playerChoice = scanner.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissor")) {
                System.out.println("invalid choice");
                continue;
            }
            computerChoice = choices[random.nextInt(3)];
            System.out.println("computerchoice: " + computerChoice);
            if (playerChoice.equals(computerChoice)) {
                System.out.println("tie");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissor")) {
                System.out.println("win");
            } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("win");
            } else if (playerChoice.equals("scissor") && computerChoice.equals("paper")) {
                System.out.println("win");
            } else {
                System.out.println("loose");
            }
            System.out.println("playagain (yes/no)? ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));
        scanner.close();

    }
}

