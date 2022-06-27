package homework4;

public class Author_pr_2 {
    String name;
    String email;

    public Author_pr_2(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author's name: '" + name + '\'' + ",   email: '" + email + '\'';
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

}
