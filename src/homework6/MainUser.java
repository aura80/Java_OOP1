package homework6;

public class MainUser {
    public static void main(String[] args) {
        System.out.println("\n-----Positive testing-----\n");
        User user1 = new User("dimineata", "vara12345", "vara12345");
        System.out.println("Positive user testing: " + user1.validateUser());
        System.out.println("Positive password testing: " + user1.validatePassword());
        System.out.println("\n-----Negative testing-----\n");
        User user2 = new User("dimi", "va0012345", "vara12345");
        System.out.println("Negative user testing: " + user2.validateUser());
        System.out.println("Negative password testing: " + user2.validatePassword());



    }
}
