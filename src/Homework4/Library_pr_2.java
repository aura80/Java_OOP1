package Homework4;

import java.util.ArrayList;
import java.util.Arrays;

public class Library_pr_2 {
    public static void main(String[] args) {
        Author_pr_2 autor1 = new Author_pr_2("Nichita Stanescu", "abc@yahoo.com");
        Book_pr_2 carte1 = new Book_pr_2("Integrala poeziei", 2013, autor1, 85);
        System.out.println("Book < " + carte1.getName() + " >(< " + carte1.getPrice() + " > RON), by < " + carte1.getAuthor(autor1) + " >, published in < " + carte1.getYear() + " >");

        System.out.println("-----------------------------------");

        Author_pr_2 autor2 = new Author_pr_2("Mircea Eliade", "efg@yahoo.com");
        Book_pr_2 carte2 = new Book_pr_2("La tiganci", 2018, autor2, 21.32);
        System.out.println("Book < " + carte2.getName() + " >(< " + carte2.getPrice() + " > RON), by < " + carte2.getAuthor(autor2) + " >, published in < " + carte2.getYear() + " >");

        System.out.println("-----------------------------------");

        Author_pr_2 autor3 = new Author_pr_2("Camil Petrescu", "camil@yahoo.com");
        Book_pr_2 carte3 = new Book_pr_2("Act venetian", 1946, autor3, 40.22);
        System.out.println(carte3.name + " , " + carte3.year + "        " + carte3.author + "       " + carte3.price + " RON ");
        System.out.println(carte3.getAuthor(autor3));

        System.out.println("-----------------------------------");

        ArrayList<Author_pr_2> listaAutori = new ArrayList<>();
        listaAutori.add(autor1);
        listaAutori.add(autor2);
        listaAutori.add(autor3);
        listaAutori.add(new Author_pr_2("Mihai Eminescu", "emin@gmail.com"));

        int ii = 0;
        for (Author_pr_2 autor:listaAutori) {
            System.out.println(ii+1 + ".   " + autor.name);
            ii++;
        }

        //System.out.println(listaAutori);

        System.out.println("-----------------------------------\n");

        System.out.println(autor3.name + "\n");

        ArrayList<Book_pr_2> listaCarti = new ArrayList<>(Arrays.asList(new Book_pr_2("Patul lui Procust", 1933, autor3, 35.45),
                new Book_pr_2("Turnul de fildes", 1950, autor3, 52.4),
                new Book_pr_2("Jocul ielelor", 1918, autor3, 33.85),
                new Book_pr_2("Mitica Popescu", 1926, autor3, 38.46),
                new Book_pr_2("Suflete tari", 1921, autor3, 44.51)));

        //for (Book carte:listaCarti) {
        for (int i = 0; i < listaCarti.size(); i++) {
            System.out.println(i+1 + ".  " + listaCarti.get(i).name + " , " + listaCarti.get(i).year + "        " + listaCarti.get(i).author + "       " + listaCarti.get(i).price + " RON ");
        }

    }
}
