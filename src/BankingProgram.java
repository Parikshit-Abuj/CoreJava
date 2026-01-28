//parikshitabuj
import java.util.Scanner;
public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println(".................");
            System.out.println("Banking Program");
            System.out.println("..................");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("...................");

            System.out.print("Enter your choice 1-4: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                case 5 -> System.out.println("Invalid choice");
            }
        }
        System.out.println("Thank you....");

        scanner.close();

    }
    static void showBalance(double balance){
        System.out.println(".................");
        System.out.println("$ " +balance);

    }
    static double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount<0){
            System.out.println("amount cant be negative");
            return 0;
        } else {
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if (amount>balance){
            System.out.println("insufficient balance");
            return 0;
        }
        else if (amount<0){
            System.out.println("amount cant be nagative");
            return 0;
        } else {
            return amount;
        }

    }
}





