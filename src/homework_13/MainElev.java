package homework_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainElev {
    public static void main(String[] args) {
        List<Elev> elevi = new ArrayList<Elev>(Arrays.asList(new Elev("Jenica","fifth","Generala 1"),
                                                             new Elev("Gigica", "third", "Ion Creanga"),
                                                             new Elev("Costel", "fourth", "Generala 1000"),
                                                             new Elev("Gigica", "7", "------"),
                                                             new Elev("Marinel", "6", "Generala 5")));
        System.out.println();

        for(Elev elev:elevi) {
            System.out.println(elev.printDetails());
        }

        System.out.println();

        for(Elev el:elevi) {
            el.changeNameSchool("Generala 20");
            System.out.println(el.printDetails());

        }

    }
}
