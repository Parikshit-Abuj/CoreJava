//parikshitabuj
public class NestedIf {
    static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.print("student discount 10%");
                System.out.println("senior discount 20%");
                price *= 0.7;
            } else {
                System.out.println("you get student discount 10%");
                price *= 0.9;
            }

        }
        else{
            if(isSenior){
                System.out.println("you get senior discount 20%");
                price *= 0.8;
            }
        }
        System.out.println("price $" +price);
    }
}
