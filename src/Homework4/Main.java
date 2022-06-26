package Homework4;

public class Main {
    public static void main(String[] args) {
        Employee manager1 = new Employee("Gigel", "manager", 25);
        Employee manager2 = new Employee("Costel", "manager", 6);
        Employee tester1 = new Employee("Titel", "tester", 7);
        Employee tester2 = new Employee("Jenel", "tester", 18);

        System.out.println(manager1.presentingEmployee());
        System.out.println(manager2.presentingEmployee());

        System.out.println();

        System.out.println(tester1.presentingEmployee());
        System.out.println(tester2.presentingEmployee());

        System.out.println();

        tester1.setYearsOfService(8);
        System.out.println(tester1.getName() + " changed years of service to " + tester1.getYearsOfService());
        System.out.println(tester1.presentingEmployee());
        tester2.setYearsOfService(20);
        System.out.println(tester2.getName() + " changed years of service to " + tester2.getYearsOfService());
        System.out.println(tester2.presentingEmployee());

        System.out.println();

        Employee manager3 = new Employee("", "", 0);

        int a, b, experience;

        manager3.setName("Gigica");
        manager3.setPosition("tester");
        a = manager3.setYearsOfService(5);
        System.out.println(manager3.presentingEmployee());
        manager3.setPosition("manager");
        b = manager3.setYearsOfService(11);
        experience = b - a;
        System.out.println("    *****      " + manager3.getName() + " gaigned " + experience + " years of experience !!! ");
        System.out.println(manager3.presentingEmployee());

    }

}
