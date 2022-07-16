package homework7;

import java.util.ArrayList;
import java.util.List;

public class FacebookUser {
    String firstName;
    String lastName;
    int birthYear;
    List<String> posts = new ArrayList<>();

    public FacebookUser(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;

    }

    public void writePost(String content) {
        posts.add(content);
    }

    public void printAllPosts() {

        for(String s:posts) {
            System.out.println(s);
        }

        for(int i = 0; i < posts.size(); i++) {
            System.out.println("Post no. " + (i + 1) + ": " + posts.get(i));
        }

    }

    public static void main(String[] args) {
        FacebookUser user1 = new FacebookUser("Tudor", "Musat", 1920);
        user1.writePost("Hello fellows!");
        user1.writePost("I am a writer");
        user1.writePost("I like to write books!");
        user1.printAllPosts();

        System.out.println();

        FacebookUser user2 = new FacebookUser("Vasile", "Ciobanul", 1997);
        user2.writePost("Hello! I am an astronomer and I like to post.");
        user2.writePost("Nasa posted new pictures from the planet Mars surface");
        user2.printAllPosts();
    }

}
