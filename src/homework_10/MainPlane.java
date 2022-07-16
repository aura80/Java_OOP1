package homework_10;

public class MainPlane {
    public static void main(String[] args) {
        Plane p = new Plane("Airbus", "E737",50);

        p.land();
        p.fly();
        for(int i = 1; i <= 50; i++) {
            p.addPassengers();
            if (i == 5 || i == 15 || i == 24 || i == 27 || i == 30 || i == 35 || i == 45) {
                p.fly();
            }
        }
        p.land();
        p.land();
        p.land();
        p.fly();
        p.land();

        System.out.println();

        Plane pp = new Plane("Ryanair", "A106",10);
        pp.land();
        pp.fly();
        pp.addPassengers();
        pp.addPassengers();
        pp.fly();
        pp.addPassengers();
        pp.addPassengers();
        pp.fly();
        pp.addPassengers();
        pp.fly();
        pp.addPassengers();
        pp.addPassengers();
        pp.fly();
        pp.addPassengers();
        pp.addPassengers();
        pp.fly();
        pp.addPassengers();
        pp.addPassengers();
        pp.land();
        pp.land();

    }
}
