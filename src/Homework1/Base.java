package Homework1;

public class Base {
    public static void main(String[] args) {
        Student student = new Student("Ionel", 22, "0722550022");
        student.arata();
        System.out.println(student);
        student.call("0752438264");

        System.out.println();

        Employee angajat1 = new Employee("John Mayers", 1993, 8000, "Manhattan");
        Employee angajat2 = new Employee("Ion Grigore", 2020, 3000, "Aleea castanilor");
        Employee angajat3 = new Employee("Maria Banica", 2005, 5500, "Calea Craiovei");

        System.out.println("    Name" + "      " + "Year of joining" + "   " + "Salary" + "    " + "Address");

        System.out.println(angajat1.getAngajat());
        System.out.println(angajat2.getAngajat());
        System.out.println(angajat3.getAngajat());

        System.out.println();

        Person fata = new Person("Ana Maria", 22, "female", "Bucharest, George Enescu street, no.23");
        System.out.println(fata.getSleep());
        fata.eat();
        fata.walk();
        System.out.println();
        Person baiat = new Person("Bogdan Marin", 31, "male", "Constanta, I.L. Caragiale street, no.3");
        baiat.walk();
        baiat.eat();

        System.out.println();

        Human om = new Human("Marius", 182, 78);
        om.eat();
        om.eat();
        om.learn();
        om.sleep();
        om.eat();
        om.exercise();
        om.sleep();
        om.eat();

        System.out.println(om.getFinalState());

        System.out.println();

        Cars masina1 = new Cars("VW", "Tiguan", 2015, false);

        masina1.printDetails();
        System.out.print("turn on " + masina1.model + "   -   " + masina1.startEngine() + ":  ");
        masina1.printDetails();
        System.out.print("turn on " + masina1.model + "   -   " + masina1.stopEngine() + ":  ");
        masina1.printDetails();

        System.out.println();

        Cars masina2 = new Cars("Renault", "Captur", 2022, false);

        masina2.printDetails();
        System.out.print("turn on " + masina2.model + "   -   " + masina2.startEngine() + ":  ");
        masina2.printDetails();
        masina2.printDetails();
        System.out.print("turn on " + masina2.model + "   -   " + masina2.stopEngine() + ":  ");
        masina2.printDetails();

    }
}
