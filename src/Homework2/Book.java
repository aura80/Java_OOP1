package Homework2;

public class Book {
    String name;
    String author;
    int totalPageNumber;
    int currentPageNumber;

    public Book(String name, String author, int totalPageNumber, int currentPageNumber) {
        this.name = name;
        this.author = author;
        this.totalPageNumber = totalPageNumber;
        this.currentPageNumber = currentPageNumber;
    }

    public void flipPageForward(int a) {
        if (this.currentPageNumber >= 0 && this.currentPageNumber <= this.totalPageNumber)
            System.out.println("The book was first opened at page " + this.currentPageNumber + " and later it was flipped forward with " + a + " pages");
        this.currentPageNumber = this.currentPageNumber + a;
    }

    public void flipPageBackward(int b) {
        if (this.currentPageNumber >= 0 && this.currentPageNumber <= this.totalPageNumber)
            System.out.println("The book was first opened at page " + this.currentPageNumber + " and later it was flipped backward with " + b + " pages");
        this.currentPageNumber = this.currentPageNumber - b;
    }

    public void printBookState() {
        if (this.currentPageNumber >= 0 && this.currentPageNumber <= this.totalPageNumber)
            System.out.println("The book '" + this.name + "', written by " + this.author + ", having " + this.totalPageNumber + " pages, is opened at page " + this.currentPageNumber);
        else if (this.currentPageNumber <= 0)
            System.out.println("You flipped too much backward");
        else if (this.currentPageNumber >= this.totalPageNumber)
            System.out.println("You flipped too much forward");
    }
}
