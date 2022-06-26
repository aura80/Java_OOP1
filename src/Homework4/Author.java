package Homework4;

public class Author {
    String name;
    String email;

    public Author(String name, String email) {
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
