package homework8;

public class MainCalc {
    public static void main(String[] args) {
        PC pc1 = new PC(false, 16, "Intel");
        pc1.pressPowerButton();
        pc1.pressPowerButton();
        pc1.pressPowerButton();

        Monitor m1 = new Monitor(true, 16.6);
        m1.pressPowerButton();
        m1.pressPowerButton();
        m1.pressPowerButton();

        System.out.println();

        PC pc2 = new PC(false, 8, "AMD");
        pc2.pressPowerButton();
        pc2.pressPowerButton();
        pc2.pressPowerButton();
        pc2.pressPowerButton();

        Monitor m2 = new Monitor(true, 17.5);
        m2.pressPowerButton();
        m2.pressPowerButton();
        m2.pressPowerButton();
        m2.pressPowerButton();
    }
}
