//parikshitabuj
public class VarArgs {
    public static void main() {
        System.out.println( add(1, 2, 3, 4));
        System.out.println(average(1,3,5657,78,3));
    }
    static int add(int...numbers){
           int sum = 0;
           for(int number : numbers){
               sum += number;
           }
           return sum;
    }
    static double average(double... numbers){
        double sum = 0;
        for (double number:numbers){
            sum+=number;
        }
        return sum/numbers.length;

    }
}
