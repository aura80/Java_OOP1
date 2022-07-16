package homework9;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("VW", 10, 90);
        bus1.addPassenger(5);
        System.out.println(bus1.reachNextStation() + " km/h ");
        bus1.addPassenger(3);
        System.out.println(bus1.reachNextStation() + " km/h ");

        System.out.println(bus1.addPassenger(2) + " passengers");
        System.out.println(bus1.addPassenger(3) + " passengers");
        System.out.println(bus1.reachNextStation() + " km/h ");
        System.out.println(bus1.addPassenger(3) + " passengers");
        System.out.println(bus1.reachNextStation() + " km/h ");

        System.out.println();

        Bus bus2 = new Bus("BMW", 30, 110);
        bus2.addPassenger(5);
        System.out.println(bus2.reachNextStation() + " km/h ");
        bus2.addPassenger(3);
        System.out.println(bus2.reachNextStation() + " km/h ");

        System.out.println(bus2.addPassenger(8) + " passengers");
        System.out.println(bus2.addPassenger(3) + " passengers");
        System.out.println(bus2.reachNextStation() + " km/h ");
        System.out.println(bus2.addPassenger(3) + " passengers");
        System.out.println(bus2.reachNextStation() + " km/h ");
        System.out.println(bus2.addPassenger(38) + " passengers=");
        System.out.println(bus2.reachNextStation() + " km/h ");
        System.out.println(bus2.addPassenger(8) + " passengers");
        System.out.println(bus2.addPassenger(33) + " passengers");

    }
}
