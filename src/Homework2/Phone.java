package Homework2;

public class Phone {
    String brand;
    String model;
    int storage;

    public Phone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }
}
