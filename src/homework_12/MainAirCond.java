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
        System.out.println("---------------------");
        System.out.println();

        AirConditioner air2 = new AirConditioner(28,false);
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

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        AirConditioner air3 = new AirConditioner(5,true);
        System.out.println(air3.toString());
        air3.turnOn();
        System.out.println(air3.toString());
        air3.raiseTemperature();
        air3.raiseTemperature();
        air3.raiseTemperature();
        air3.raiseTemperature();
        air3.raiseTemperature();
        air3.raiseTemperature();
        air3.raiseTemperature();
        System.out.println(air3.toString());

        air3.turnOn();
        air3.lowerTemperature();
        air3.lowerTemperature();
        air3.lowerTemperature();

        System.out.println(air3.toString());
        air3.turnOff();
        air3.turnOff();

        air3.turnOn();

        for (int i = 0; i < 33;i++) {
            air3.raiseTemperature();
            System.out.println(air3.toString());
        }

        System.out.println("---------------------");
        air3.turnOn();

        for (int i = 31; i >= 0; i--) {
            air3.lowerTemperature();
            System.out.println(air3.toString());
        }

    }
}
