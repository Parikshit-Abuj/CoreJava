// parikshitabuj
import java.util.Arrays;

public class ArraysJava {
    public static void main(String[] args) {
        String[] fruits = {"apple,banana,orange,mango"};
        fruits[0]= "pineapple";
        int numOfFruits = fruits.length;
        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");
        for(String fruit : fruits){
            System.out.println(fruit);

        String[] foods = new String[3];
        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "burger";
            for(String food: foods){
                System.out.println(food);
            }
        }

    }
}
