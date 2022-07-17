package homework_11;

public class Aragaz {
    private boolean isGasConnected;
    private boolean eyeOneIsLit;
    private boolean eyeTwoIsLit;
    private boolean eyeThreeIsLit;
    private boolean eyeFourIsLit;

    public Aragaz(boolean eyeOneIsLit, boolean eyeTwoIsLit, boolean eyeThreeIsLit, boolean eyeFourIsLit) {
        this.eyeOneIsLit = eyeOneIsLit;
        this.eyeTwoIsLit = eyeTwoIsLit;
        this.eyeThreeIsLit = eyeThreeIsLit;
        this.eyeFourIsLit = eyeFourIsLit;
        if (this.eyeOneIsLit && this.eyeTwoIsLit && this.eyeThreeIsLit && this.eyeFourIsLit) {
            isGasConnected = false;
            System.out.println("Gas decoupled!");
        }
    }

    public boolean coupleGas() {
        if (!isGasConnected) {
            isGasConnected = true;
            System.out.println("Gas is connected!");
        }
        else {
            System.out.println("Gas is already connected!");
        }

        return isGasConnected;

    }

    public void decoupleGas() {
        if (isGasConnected) {
            isGasConnected = false;
            System.out.println("Gas was disconnected!");
        }
        else {
            System.out.println("Gas was already disconnected!");
        }

    }

    public boolean pressFirstEyeButton() {
        if (eyeOneIsLit) {
            eyeOneIsLit = false;
            System.out.println("The First stove eye has been turned off");
        }
        else {
            eyeOneIsLit = true;
            System.out.println("The First stove eye has been turned on");
        }

        return eyeOneIsLit;

    }

    public boolean pressSecondEyeButton() {
        if (eyeTwoIsLit) {
            eyeTwoIsLit = false;
            System.out.println("The Second stove eye has been turned off");
        }
        else {
            eyeTwoIsLit = true;
            System.out.println("The Second stove eye has been turned on");
        }

        return eyeTwoIsLit;
    }

    public boolean pressThirdEyeButton() {
        if (eyeThreeIsLit) {
            eyeThreeIsLit = false;
            System.out.println("The Third stove eye has been turned off");
        }
        else {
            eyeThreeIsLit = true;
            System.out.println("The Third stove eye has been turned on");
        }

        return eyeThreeIsLit;
    }

    public boolean pressFourthEyeButton() {
        if (eyeFourIsLit) {
            eyeFourIsLit = false;
            System.out.println("The Fourth stove eye has been turned off");
        }
        else {
            eyeFourIsLit = true;
            System.out.println("The Fourth stove eye has been turned on");
        }

        return eyeFourIsLit;
    }

}
