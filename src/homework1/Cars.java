package homework1;

public class Cars {
    String brand;
    String model;
    int year;
    boolean on;

    public Cars(String brand, String model, int year, boolean on) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.on = on;
    }

    public void printDetails() {
        if (this.on == true){
            System.out.println("    " + this.brand + " " + this.model + " from " + this.year + " is running");
        }
        else
            System.out.println("    " + this.brand + " " + this.model + " from " + this.year + " has stopped");
    }

    public boolean startEngine() {
        this.on = true;
        return this.on;
    }

    public boolean stopEngine() {
        if (startEngine() == true) {
            this.on = false;
        }
        return this.on;
    }
}
