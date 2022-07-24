package homework_16;

public class Player {
    String name;
    int health;
    static int slot = 0;


    public Player(String name, int health) {
        slot = slot + 50;
        this.name = name;
        this.health = health;
        if (slot >= 300) System.out.println("Max no. of players reached");

    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", slots=" + slot +
                '}';
    }

    public static void main(String[] args) {
        Player p1 = new Player("Ion", 500);
        Player p2 = new Player("Ion", 1000);
        Player p3 = new Player("Ion", 700);
        Player p4 = new Player("Ion", 300);
        Player p5 = new Player("Ion", 200);
        Player p6 = new Player("Ion", 900);
       // Player p7 = new Player("Ion", 1300);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        //System.out.println(p7);

    }
}
