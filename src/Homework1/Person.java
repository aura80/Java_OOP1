package Homework1;

public class Person {
    String name;
    int age;
    String sex;
    String address;

    public Person(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        System.out.println("Hello, I am a " + this.sex + " and my name is " + this.name + ". I am " + this.age + " years old and I live in " + this.address);
    }

    public void walk() {
        System.out.println(this.name + " walks on the street.");
    }

    public void eat() {
        System.out.println(this.name + " eats a lot of apples.");

    }

    public String getSleep() {
        return this.name + " sleeps too much in the morning.";
    }
}
