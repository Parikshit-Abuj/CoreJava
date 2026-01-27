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

        if(name.isEmpty()) {
            System.out.println("no name");
        }
        else{
                System.out.println("hello " + name);
            }
        if(name.contains(" ")){
            System.out.println("your name has spaces");}
        else {
            System.out.println("no spaces");
        }
        if(name.equalsIgnoreCase("Parikshit java")) {
            System.out.println("name is equal"); }
            else{
                System.out.println("hello " +name);
            }






    }
}
