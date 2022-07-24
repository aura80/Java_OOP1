package homework_14;

public class T_Shirt {
    int size;
    String color;
    static String brandName = "Adidas";

    public T_Shirt(int size, String color) {
        this.size = size;
        this.color = color;

        //brandName = "Adidas";
    }

    public static void changeBrandName(String newName) {
        T_Shirt.brandName = newName;
        System.out.println("   ***     " + T_Shirt.brandName);
    }

    @Override
    public String toString() {
        return " T_Shirt { " +
                "size=" + size +
                ", color='" + color + '\'' + ", brand= '" + T_Shirt.brandName + '\'' + " " +
                '}';
    }
}
