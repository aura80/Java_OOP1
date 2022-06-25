package Homework1;

public class Employee {
    String name;
    int joinYear;
    int salary;
    String address;

    public Employee(String name, int joinYear, int salary, String address) {
        this.name = name;
        this.joinYear = joinYear;
        this.salary = salary;
        this.address = address;
    }

    public String getAngajat() {
        return this.name + "     " + this.joinYear + "             " + this.salary + "     " + this.address;
    }
}
