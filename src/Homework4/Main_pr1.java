package Homework4;


public class Main_pr1 {
    public static void main(String[] args) {
        Employee_pr1 manager1 = new Employee_pr1("Gigel", "manager", 25);
        Employee_pr1 manager2 = new Employee_pr1("Costel", "manager", 6);
        Employee_pr1 tester1 = new Employee_pr1("Titel", "tester", 7);
        Employee_pr1 tester2 = new Employee_pr1("Jenel", "tester", 18);

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

        Employee_pr1 manager3 = new Employee_pr1("", "", 0);

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
