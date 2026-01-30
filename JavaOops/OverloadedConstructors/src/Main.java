public class Main{
    public static void main(String[] args) {

        User user1 = new User("Parikshit");
        User user2 = new User("Java", "Java@demo.com");
        User user3 = new User("Idea", "Idea@demo.com", 30);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);


    }
}

//Overloaded constructors = allow a class to have multiple constructors
                            // with different parameters list