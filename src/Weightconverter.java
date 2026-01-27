//parikshitabuj
import java.util.Scanner;
public class Weightconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("weight conversion program");
        System.out.println("1. convert lbs to kgs");
        System.out.println("2. convert kgs to lbs");
        System.out.println("choose option");
        choice = scanner.nextInt();

        if(choice==1){
            System.out.print("enter weight in lbs:");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453593;
            System.out.println("the new weight in kgs is" +newWeight);
        }
        else if (choice == 2){
            System.out.print("enter weight in kg");
            weight = scanner.nextDouble();
            newWeight = weight * 2.2;
            System.out.println("the new weight in kgs is" +newWeight);}
}
}