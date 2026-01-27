//parikshitabuj
public class logicaloperators {
    public static void main(String[] args) {

        double temp = -10;
        boolean isSunny =  true;

        if(temp <= 30 &&  temp >= 0 && isSunny){
            System.out.println("The weater is good");
            System.out.println("its sunny outside");
        }
        else if (temp<=30 && temp>=0 && !isSunny) {
            System.out.println("weather is good");
            System.out.println("its cloudy");
        }
        else if (temp > 30 || temp < 0) {
            System.out.println("wearther is bad");

        }

    }
}
