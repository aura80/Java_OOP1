package Homework4;

public class Employee_pr1 {
    String name;
    String position;
    int yearsOfService;
    int salary;

    public Employee_pr1(String name, String position, int yearsOfService) {
        this.name = name;
        this.position = position;
        this.yearsOfService = yearsOfService;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nam) {
        this.name = nam;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String pos) {
        this.position = pos;
    }

    public int getYearsOfService() {
        return this.yearsOfService;
    }

    public int setYearsOfService(int yearsService) {
        this.yearsOfService = yearsService;
        return this.yearsOfService;
    }

    public int getSalary() {
        int bonus = 0;
        if (this.position == "manager") {
            salary = 1000;
            if (getYearsOfService() > 10) {
                bonus = salary / 10;
                salary += bonus;
            }
            else return salary;
        } else if (this.position == "tester") {
            salary = 800;
            if (getYearsOfService() > 10){
                bonus = salary / 10;
                salary += bonus;
            }
            else return salary;
        }

        return salary;
    }

    public String presentingEmployee() {
        return getName() + " is " + getPosition() + ", has " + getYearsOfService() + " years of service and a salary of " + getSalary() + " $ ";
    }

}
