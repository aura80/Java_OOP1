package homework3;

public class Main {
    public static void main(String[] args) {

        Radio radio1 = new Radio();
        System.out.println("Postul ales este:   " + radio1.posts.get(0));
        radio1.turnOn();
        radio1.displayRadioStatus();
        radio1.initialVolume();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.displayRadioStatus();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.displayRadioStatus();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeDown();
        radio1.turnOff();
        radio1.displayRadioStatus();
        radio1.turnOff();
        radio1.displayRadioStatus();
        radio1.turnOn();
        radio1.displayRadioStatus();
        radio1.initialVolume();
        radio1.turnVolumeUp();
        radio1.turnVolumeDown();
        radio1.turnOn();
        radio1.displayRadioStatus();
        radio1.initialVolume();
        radio1.turnVolumeDown();
        radio1.displayRadioStatus();
        radio1.turnVolumeDown();
        radio1.turnVolumeDown();
        radio1.turnVolumeDown();
        radio1.turnVolumeDown();

        System.out.println();

        Radio radio2 = new Radio();
        System.out.println("\nPostul ales este:   " + radio2.posts.get(1));
        radio1.turnOn();
        radio1.displayRadioStatus();
        radio1.initialVolume();
        radio1.turnVolumeUp();
        radio1.turnVolumeUp();
        radio1.turnVolumeDown();
        radio1.turnOff();
        radio1.displayRadioStatus();
        radio1.turnVolumeDown();
        radio1.turnVolumeDown();
        radio1.turnVolumeDown();

        System.out.println();

        Radio radio3 = new Radio();
        System.out.println("\nPostul ales este:   " + radio3.posts.get(2));
        radio3.displayRadioStatus();
        radio3.initialVolume();
        radio3.turnVolumeUp();
        radio3.turnVolumeUp();
        radio3.turnVolumeUp();
        radio3.displayRadioStatus();
        radio3.turnVolumeDown();
        radio3.turnOff();
        radio3.turnOn();
        radio3.initialVolume();
        radio3.turnVolumeUp();
        radio3.turnVolumeDown();
        radio3.turnOff();

        System.out.println("\n");

        Radio radio4 = new Radio();
        radio4.turnOn();
        radio4.changePostForward();
        radio4.changePostForward();
        radio4.changePostForward();
        radio4.turnVolumeUp();
        radio4.turnVolumeUp();
        radio4.turnVolumeUp();
        radio4.turnVolumeUp();
        radio4.displayRadioStatus();
        radio4.turnVolumeDown();
        radio4.turnVolumeDown();
        radio4.displayRadioStatus();
        radio4.changePostForward();
        radio4.changePostForward();
        radio4.changePostForward();
        radio4.changePostForward();
        radio4.changePostForward();
        System.out.println(radio4.changePostForward());

        System.out.println("-----------------");

        radio4.changePostBackward();
        radio4.changePostBackward();
        radio4.changePostBackward();
        radio4.changePostBackward();
        radio4.displayRadioStatus();
        radio4.changePostBackward();
        radio4.changePostBackward();
        System.out.println();
        radio4.changePostBackward();
        radio4.changePostBackward();


    }

}
