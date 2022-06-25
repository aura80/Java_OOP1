package Homework2;

public class Base {
    public static void main(String[] args) {
        Phone tel1 = new Phone("Iphone","S11",16);
        Phone tel2 = new Phone("Huawei","T21",8);
        Phone tel3 = new Phone("Samsung","A10",32);
        Phone tel4 = new Phone("Iphone","14",64);
        Phone tel5 = new Phone("Iphone","S12",8);

        System.out.println(tel1);
        System.out.println(tel2.toString());
        System.out.println(tel3);
        System.out.println(tel4);
        System.out.println(tel5);

        System.out.println();

        Robot R1 = new Robot("Blondie", false, "iron");
        R1.atack();
        Robot R2 = new Robot("Trudy", true, "steel");
        R2.atack();

        System.out.println();

        Book book1 = new Book("Ion", "Liviu Rebreanu", 300, 30);
        book1.flipPageForward(5);
        book1.printBookState();
        System.out.println();
        book1.flipPageBackward(4);
        book1.printBookState();
        System.out.println();
        book1.flipPageForward(25);
        book1.printBookState();
        System.out.println();
        book1.flipPageBackward(134);
        book1.printBookState();
        book1.flipPageForward(425);
        book1.printBookState();
        System.out.println();

        Book book2 = new Book("De veghe in lanul de secara", "J.D. Salinger", 234, 150);
        book2.flipPageForward(35);
        book2.printBookState();
        System.out.println();
        book2.flipPageBackward(24);
        book2.printBookState();
        System.out.println();
        book2.flipPageForward(88);
        book2.printBookState();
        System.out.println();
        book2.flipPageBackward(324);
        book2.printBookState();
        System.out.println();
        book2.flipPageForward(125);
        book2.printBookState();
        System.out.println();

        Book b = new Book("Poezii", "Mihai Eminescu", 10, 1);
        flipBook(b);
        Book c = new Book("Momente si schite", "I.L. Caragiale", 300, 293);
        flipBook(c);
        Book d = new Book("Maitreyi", "Mircea Eliade", 175, 170);
        flipBook(d);

    }

    public static void flipBook(Book book) {
        book.printBookState();

        while (book.currentPageNumber >=1 && book.currentPageNumber < book.totalPageNumber) {
            book.currentPageNumber += 1;
            System.out.println("Next page: " + book.currentPageNumber);
        }
    }
}
