package homework5;

public class MainPencil {
    public static void main(String[] args) {
        Pencil pix1 = new Pencil("albastru");
        pix1.write1("La mare este frumos!");

        Pencil pix2 = new Pencil("a");
        pix2.color = " 2 alb si 33 roz";
        pix2.write1(pix2.color);

        System.out.println("----------------");

        Pencil pix3 = new Pencil("roz");
        pix3.write2("In oras este cald");

        Pencil pix4 = new Pencil("tralala");
        pix4.color = "alb cu 2 liniute rosii";
        pix4.write2(pix4.color);

    }
}
