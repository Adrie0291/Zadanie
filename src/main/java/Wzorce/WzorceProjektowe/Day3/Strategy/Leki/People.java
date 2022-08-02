package Wzorce.WzorceProjektowe.Day3.Strategy.Leki;

public class People {
    private String name;
    private int age;
    private Price price;


    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public double getMedicinePrice(double cost) {
        return this.price.cena(cost);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
