package homework_10;

public class Plane {
    private final String brand;
    private final String model;
    private boolean isFlying;
    private final int maxPassengers;
    private int passengers = 0;

    public Plane(String brand, String model, int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.maxPassengers = maxPassengers;
        System.out.println(" ----- The plane " + this.brand + " " + this.model + " has " + this.maxPassengers + " seats maximum capacity ----- ");
    }

    public void addPassengers() {

        if (passengers == this.maxPassengers) {
            System.out.println("Max no of passengers reached");
        }
        else{
            passengers += 1;
            System.out.println(passengers + " passengers ");
        }

    }

    public boolean fly() {
        if (isFlying) {
            System.out.println("The plane "+ this.brand + " " + this.model + " flies");
            return isFlying;
        }
        else if (passengers >= this.maxPassengers/2) {
            isFlying = true;
            System.out.println("The plane "+ this.brand + " " + this.model + " took off and is now flying");
        }
        else if (passengers < this.maxPassengers/2) {
            isFlying = false;
            System.out.println("The plane "+ this.brand + " " + this.model + " doesn't fly");
        }
        return isFlying;
    }

    public void land() {
        if (isFlying) {
            isFlying = false;
            System.out.println("The plane "+ this.brand + " " + this.model + " lands");
        }
        else System.out.println("The plane "+ this.brand + " " + this.model + " is already on the ground");

    }

}
