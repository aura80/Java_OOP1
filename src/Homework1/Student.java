package Homework1;

public class Student {
    // starea: campuri, atribute, proprietati
    String name;
    int age;
    String phoneNo;

    public Student(String name, int age, String phoneNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;

    }

    public void arata() {
        System.out.println("name= " + this.name + " age= " + this.age + " phone number= " + this.phoneNo);
    }

    public void call(String calledNo) {
        System.out.println("The " + this.age + " years of age student " + this.name + ", having the phone number " + this.phoneNo + ", made a call towards no " + calledNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", age=" + phoneNo +
                '}';
    }
}
