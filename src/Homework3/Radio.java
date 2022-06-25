package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class Radio {
    boolean on;
    int volume = 0;
    int currentPostIndex;
    ArrayList<String> posts;

    public Radio() {
        currentPostIndex = 1;
        posts = new ArrayList<>(Arrays.asList("Magic FM", "Pro FM"));
        posts.add("Europa FM");
        posts.add("Manele FM");
        posts.add("Guerilla");
        posts.add("Romantic FM");
        posts.add("Radio ZU");
    }

    public boolean turnOn() {
        if (on) {
            System.out.print("Radioul este deja pornit        ");
        } else {
            System.out.print("Radioul este oprit. Il pornim   ");
            on = true;
        }
        return on;
    }

    public boolean turnOff() {
        if (on) {
            System.out.print("Inchidem radioul                ");
            on = false;
        } else System.out.print("Radioul este deja inchis        ");
        return on;
    }

    public void displayRadioStatus() {
        if (on) {
            System.out.println("  -    Radio pornit! pe postul cu indexul " + (currentPostIndex - 1) + " dat la nivelul " + volume);
        } else
            System.out.println("  -    Radio oprit!");
    }

    public void initialVolume() {
        System.out.println("Volum initial: " + volume);
    }

    public void turnVolumeUp() {
        if (turnOn() == true) {
            if (volume >= 0 && volume <= 10) {
                volume++;
                if (volume == 11)
                    System.out.println("Max volume");
                else
                    System.out.println("Volum up:  " + volume);
            }

            if (volume > 10) {
                volume = 0;
                System.out.println("Volum over 10:  " + volume);
            }
        }
        else System.out.println("Radio oprit!!!");
    }

    public void turnVolumeDown() {
        if (turnOn() == true) {
            if (volume >= 0 && volume <= 10) {
                volume--;
                if (volume == -1)
                    System.out.println("Min volume ");
                else
                    System.out.println("Volum down:  " + volume);
            }

            if (volume < 0) {
                volume = 0;
                System.out.println("Volum under 0:  " + volume);
            }
        }

    }

    public int changePostForward() {

        if (currentPostIndex >= 1 && currentPostIndex <= posts.size()) {
            for (int i = 0; i < posts.size(); i++) {
                if (i == currentPostIndex-1)
                    System.out.print("\n" + posts.get(i));
            }
            System.out.println("         Index post:   " + currentPostIndex++);
        }

        if (currentPostIndex > posts.size()) {
            currentPostIndex = posts.size();
            System.out.println("End of list! Back to index " + currentPostIndex);
        }

        return currentPostIndex;
    }

    public int changePostBackward() {
        if (currentPostIndex >= 1 && currentPostIndex <= posts.size()) {
            currentPostIndex--;
            for (int i = posts.size(); i > 0; i--) {
                if (i == currentPostIndex)
                    System.out.print(posts.get(i-1));
                if (i >= posts.size()) System.out.print("----- ");
            }
            System.out.println("         Index post:   " + (currentPostIndex));
        }
        if (currentPostIndex < 1) {
            currentPostIndex = 1;
            System.out.println("End of list! Back to index   " + currentPostIndex);
        }

        return currentPostIndex;
    }

}
