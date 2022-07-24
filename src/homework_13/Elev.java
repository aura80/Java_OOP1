package homework_13;

public class Elev {
    String name;
    String grade;
    static String school;
    String scoalamea;

    public Elev(String name, String grade, String scoala) {
        this.name = name;
        this.grade = grade;
        Elev.school = scoala;
        System.out.println(Elev.school);
    }

    public String printDetails() {
        return "Name: " + this.name + ", Grade: " + this.grade + ", School: " + Elev.school;
    }

    public void changeNameSchool(String newSchool) {
        Elev.school = newSchool;
    }
}
