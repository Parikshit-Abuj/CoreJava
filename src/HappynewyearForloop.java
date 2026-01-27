// parikshitabuj
import java.util.Scanner;
public class HappynewyearForloop {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("how many seconds to coundownfrom: ");

        int start = scanner.nextInt();

        for (int i=start; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("happy new year");


    }
}
