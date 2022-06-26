package Homework4;

public class Book extends Author{
    String name;
    int year;
    Author author;
    double price;

    public Book(String name, int year, Author author, double price) {
        super(author.name, author.email);
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
        //System.out.println("Author: " + this.author.getName() + "   " +  this.author.getEmail());
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor(Author author) {
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
