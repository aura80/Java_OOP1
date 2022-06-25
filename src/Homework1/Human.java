package Homework1;

public class Human {
    String name;
    int height;
    int energy = 80;
    int weight;
    int happy;

    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.happy = 50;
    }

    public void eat(){
        energy = energy + 1;
        this.happy += 10;
        System.out.println(this.name + " ate , his energy is " + energy + " and his happiness is " + this.happy + "   :)");
    }
    public void learn(){
        energy = energy - 2;
        this.happy += 3;
        System.out.println(this.name + " learnt , his energy is " + energy + " and his happiness is " + this.happy + "   :)");
    }
    public void sleep(){
        energy = energy + 2;
        this.happy += 10;
        System.out.println(this.name + " slept , his energy is " + energy + " and his happiness is " + this.happy + "   :)");
    }
    public void exercise(){
        energy = energy - 1;
        this.happy += 10;
        System.out.println(this.name + " exercised , his energy is " + energy + " and his happiness is " + this.happy + "   :)");
    }

    public String getFinalState() {
        return "\n" + this.name + "  -  energy: " + energy + "\n        -  happiness: " + this.happy + "   :)";
    }

}
