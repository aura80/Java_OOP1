package homework_14;

public class MainT_Shirt {
    public static void main(String[] args) {
        T_Shirt tricou1 = new T_Shirt(38, "red");
        T_Shirt tricou2 = new T_Shirt(40, "green");
        T_Shirt tricou3 = new T_Shirt(42, "blue");

        System.out.println(tricou1);
        System.out.println(tricou2);
        System.out.println(tricou3);

        System.out.println();

        T_Shirt.changeBrandName("Zara");
        System.out.println(tricou1);

        T_Shirt.changeBrandName("SportZone");
        System.out.println(tricou2);

        T_Shirt.changeBrandName("Golf my life");
        System.out.println(tricou3);

        T_Shirt tricou4 = new T_Shirt(44, "yellow");
        T_Shirt tricou5 = new T_Shirt(39, "white");
        T_Shirt tricou6 = new T_Shirt(36, "pink");

        System.out.println();

        System.out.println(tricou1);
        System.out.println(tricou2);
        System.out.println(tricou3);
        System.out.println(tricou4);
        System.out.println(tricou5);
        System.out.println(tricou6);

        T_Shirt tricou7 = new T_Shirt(40, "purple");
        T_Shirt tricou8 = new T_Shirt(42, "red-blue");
        T_Shirt tricou9 = new T_Shirt(38, "pink");

        T_Shirt.changeBrandName("Nike");
        System.out.println(tricou7);
        tricou8.changeBrandName("Puma");
        tricou9.changeBrandName("Stradivarius");
        System.out.println(tricou9);

        T_Shirt.changeBrandName("Gucci");

        System.out.println(tricou7);
        System.out.println(tricou8);
        System.out.println(tricou9);

        System.out.println();

        System.out.println(tricou1);
        System.out.println(tricou2);
        System.out.println(tricou3);

        T_Shirt.changeBrandName("LV");
        System.out.println(tricou4);
        System.out.println(tricou5);
        System.out.println(tricou6);
        T_Shirt.changeBrandName("Balenciaga");
        System.out.println(tricou7);
        System.out.println(tricou8);
        System.out.println(tricou9);
    }
}
