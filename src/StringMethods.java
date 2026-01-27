//parikshitabuj
public class StringMethods {
    public static void main(String[] args) {

        String name = "Parikshit Java";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("J");
        int LastIndex = name.lastIndexOf("t");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("i", "k");

        System.out.println(name);




    }
}
