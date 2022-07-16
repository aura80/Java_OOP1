package homework8;

public class Monitor {
    private boolean on;
    private double diagonala;

    public Monitor(boolean on, double diagonala) {
        this.on = on;
        this.diagonala = diagonala;
    }

    public void pressPowerButton() {
        if (this.on) {
            this.on = false;
            System.out.println("Monitor " + diagonala + " inch, turned down");
        }
        else {
            this.on = true;
            System.out.println("Monitor " + diagonala + " inch, turned on");
        }

    }
}
