//PariksihtAbuj

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("enter age:");
        int age = scanner.nextInt();

        System.out.print("Enter gpa:");
        double gpa = scanner.nextDouble();

        System.out.println("are you a student");
        boolean student = scanner.nextBoolean();

        System.out.println("name:" + name);
        System.out.println(" age " + age);
        System.out.println("gpa:" + gpa);
        System.out.println("Student: " + student);
        scanner.close();
    }

}






