package homework5;

public class Pencil {
    String color;
    private int remainingInk = 1000;

    public Pencil(String color) {
        this.color = color;
    }

    public void write1(String text1) {
        System.out.println(text1);
        int u = 0;

        // Metoda 1     -   facem un array din caracterele stringului text1
        char[] litere = text1.toCharArray();

        System.out.println(litere);

        for (char l:litere) {
            if (Character.isLetter(l) || Character.isDigit(l)) {
                remainingInk--;
                u += 1;
            }
        }
        System.out.println("Am folosit " + u + " unitati de cerneala din pixul " + this.color + " si am ramas cu " + remainingInk + " unitati");

    }

    public void write2(String text2) {
        System.out.println(text2);
        int unitati = 0;

        // Metoda 2
        for (int i = 0; i < text2.length(); i++) {
            System.out.println(text2.charAt(i));
            if (Character.isLetterOrDigit(text2.charAt(i))) {
                remainingInk--;
                unitati += 1;
            } else continue;
        }
        System.out.println("Am folosit " + unitati + " unitati de cerneala din pixul " + this.color + " si am ramas cu " + remainingInk + " unitati");

    }
}
