package homework_15;

public class Person {
    String firstName;
    String lastName;
    static int nrob = 0;
    int n;

    public Person(String firstName, String lastName) {
        System.out.println(" " + (nrob++ + 1) + " objects initialized");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ana", "Marin");
        Person p2 = new Person("Ileana", "Cosanzeana");
        Person p3 = new Person("Fat Frumos", "din Lacrima");

        System.out.println(Person.nrob);

        Person p4 = new Person("Ion", "Chirila");
        Person p5 = new Person("Stela", "Enache");
        Person p6 = new Person("Angela", "Similea");
        Person p7 = new Person("Mirabela ", "Dauer");

        System.out.println(Person.nrob);

    }
}
