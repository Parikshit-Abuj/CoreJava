//parikshitabuj
public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 56, 7, 3, 6};
        int target = 5;
        boolean isFound = false;
        for(int i=0;i<numbers.length;i++){
            if(target == numbers[i]){
                System.out.println("element found at index: " +i);
                isFound=true;
                break;
            }
        }
        if (!isFound){
            System.out.println("element not found in the array");
        }
        }

    }
