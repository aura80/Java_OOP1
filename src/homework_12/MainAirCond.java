package homework_12;

public class MainAirCond {
    public static void main(String[] args) {
        AirConditioner air1 = new AirConditioner(27,true);
        System.out.println(air1.toString());
        air1.turnOn();
        System.out.println(air1.toString());
        air1.turnOff();
        System.out.println(air1.toString());
        air1.lowerTemperature();
        air1.lowerTemperature();
        air1.turnOn();
        air1.lowerTemperature();
        air1.lowerTemperature();
        air1.lowerTemperature();
        air1.lowerTemperature();
        air1.lowerTemperature();
        System.out.println(air1.toString());
        air1.raiseTemperature();
        air1.raiseTemperature();
        air1.raiseTemperature();
        System.out.println(air1.toString());

        System.out.println();

        AirConditioner air2 = new AirConditioner(27,false);
        System.out.println(air2.toString());
        air1.turnOn();
        System.out.println(air2.toString());
        air1.turnOff();
        System.out.println(air2.toString());
        air2.lowerTemperature();
        air2.lowerTemperature();
        air2.turnOn();
        air2.lowerTemperature();
        air2.lowerTemperature();
        air2.lowerTemperature();
        System.out.println(air2.toString());
        air2.raiseTemperature();
        air2.raiseTemperature();
        System.out.println(air2.toString());

    }
}
