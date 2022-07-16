package homework8;

import javax.swing.*;

public class PC {
    private boolean on;
    private final int ram;
    private final String procesor;

    public PC(boolean on, int ram, String procesor) {
        this.on = on;
        this.ram = ram;
        this.procesor = procesor;
    }

    public void pressPowerButton() {
        if (this.on) {
            this.on = false;
            System.out.println("PC processor " + this.procesor + " " + this.ram + " RAM, turned down");
        }
        else {
            this.on = true;
            System.out.println("PC processor " + this.procesor + " " + this.ram + " RAM, turned on");
        }

    }

}
