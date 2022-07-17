package homework_11;

public class MainGaz {
    public static void main(String[] args) {
        Aragaz a = new Aragaz(true, false, true, false);
        a.coupleGas();
        System.out.println();

        a.decoupleGas();
        a.decoupleGas();
        a.decoupleGas();
        a.decoupleGas();
        System.out.println();

        a.coupleGas();
        a.coupleGas();
        a.coupleGas();
        a.coupleGas();

        System.out.println();

        a.decoupleGas();
        a.decoupleGas();
        a.decoupleGas();
        a.decoupleGas();

        System.out.println();

        a.pressFirstEyeButton();
        a.pressSecondEyeButton();
        a.pressThirdEyeButton();
        a.pressFourthEyeButton();

        System.out.println();

        Aragaz ar = new Aragaz(true, true, true, true);

        ar.pressFirstEyeButton();
        ar.pressSecondEyeButton();
        ar.pressThirdEyeButton();
        ar.pressFourthEyeButton();

        System.out.println();

        Aragaz aragaz = new Aragaz(false, false, false, false);

        aragaz.pressFirstEyeButton();
        aragaz.pressSecondEyeButton();
        aragaz.pressThirdEyeButton();
        aragaz.pressFourthEyeButton();

        System.out.println();

    }
}
