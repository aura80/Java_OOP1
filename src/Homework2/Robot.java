package Homework2;

public class Robot {
    String name;
    boolean atackPower;
    String material;

    public Robot(String name, boolean atackPower, String material) {
        this.name = name;
        this.atackPower = atackPower;
        this.material = material;
    }

    public void atack() {
        if (atackPower == false) {
            atackPower = true;
            System.out.println("The robot *" + this.name + "* made of *" + this.material + "* is attacking now.");
        }
        else
            System.out.println("The robot *" + this.name + "* made of *" + this.material + "* is already attacking.");
    }
}
