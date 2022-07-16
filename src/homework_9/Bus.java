package homework_9;

public class Bus {
    private final String brand;
    private final int maxPassengers;
    private int passengersNumber = 0;
    private final int maxSpeed;

    public Bus(String brand, int maxPassengers, int maxSpeed) {
        this.brand = brand;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        System.out.println(this.brand);
    }

    public int addPassenger(int pasg) {

        if (passengersNumber < this.maxPassengers){
            int difPassengers = this.maxPassengers - passengersNumber;
            if (pasg <= difPassengers) {
                passengersNumber += pasg;
                System.out.println(this.maxPassengers - passengersNumber + " available seats in " + this.brand + "! ");
            }
            else {
                System.out.println("0 available seats! ");
                System.out.println(pasg - difPassengers + " passengers don't have available seats");
            }

        }
        else if (passengersNumber == this.maxPassengers){
            System.out.println("*** Max no. of " + passengersNumber + " passengers reached! We can't take other passengers!");
        }
        else {
            System.out.println("No more seats! Max no. of " + this.maxPassengers + " passengers reached ");
        }

        return passengersNumber;
    }

    public int reachNextStation() {
        if (passengersNumber > this.maxPassengers/2) {
            System.out.print(" ----- * ----- Half of max speed: ");
            return this.maxSpeed/2;
        }
        else if (passengersNumber <= this.maxPassengers/2) {
            System.out.print(" ----- * ----- Max speed: ");
            return this.maxSpeed;
        }

        return this.maxSpeed;
    }

}
