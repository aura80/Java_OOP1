package homework_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    static int contor = 1;

    int id;
    String name;

    public Student(String name) {
        System.out.println(Student.contor);
        id = contor++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Student> si = new ArrayList<Student>(Arrays.asList(new Student("Popescu"),new Student("Ionescu"),new Student("Petrescu"),
                                                        new Student("Golescu"),new Student("Irinescu"),new Student("Negrescu"),
                                                        new Student("Popa"),new Student("Popescu"),new Student("Cazan"),
                                                        new Student("Enescu")));

        for(Student s:si) {
            System.out.println(s);
        }

    }
}
