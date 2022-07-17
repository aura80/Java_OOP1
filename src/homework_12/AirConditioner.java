package homework_12;

public class AirConditioner {
    private boolean on;
    private int temperature;
    private boolean swinging;

    public AirConditioner(int temperature, boolean swinging) {
        this.temperature = temperature;
        this.swinging = swinging;
    }

    @Override
    public String toString() {
        return "AirConditioner { " +
                "on=" + on +
                ", temperature= " + temperature +
                ", swinging=" + swinging +
                " }";
    }

    public boolean turnOn() {
        if (!on) {
            on = true;
            System.out.println("Air turned on!");
        }
        else System.out.println("Already on!");

        return on;
    }

    public boolean turnOff() {
        if (on) {
            on = false;
            System.out.println("Air turned off!");
        }
        else System.out.println("Already off!");

        return on;
    }

    public int raiseTemperature() {
        if (on && this.swinging && this.temperature < 30) {
            this.temperature += 1;
            System.out.println("+ Raise temperature!");
        }
        else System.out.println("Off!");

        return this.temperature;
    }

    public int lowerTemperature() {
        if (on && this.swinging && this.temperature > 0) {
            this.temperature -= 1;
            System.out.println("- Lower temperature!");
        }
        else System.out.println("Off!");

        return this.temperature;
    }

    public boolean swing() {
        return this.swinging;
    }

}
