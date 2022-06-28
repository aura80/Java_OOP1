package homework4;

public class Book_pr_2 extends Author_pr_2 {
    private String name;
    private int year;
    Author_pr_2 author;
    private double price;

    public Book_pr_2(String name, int year, Author_pr_2 author, double price) {
        super(author.getName(), author.getEmail());
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
        //System.out.println("Author: " + this.author.getName() + "   " +  this.author.getEmail());
    }

    public String getName() {
        return this.name;
    }

    public Author_pr_2 getAuthor(Author_pr_2 author) {
        this.author = author;

        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

}
