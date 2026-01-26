//parikshitabuj
import java.util.Random;
public class Randomnum{
    static void main() {
        Random random = new Random();
        boolean isHead;
        isHead= random.nextBoolean();
        System.out.println(isHead);

        if (isHead) {
            System.out.println("Heads");}
            else {
            System.out.println("Tails");
        }

    }
}