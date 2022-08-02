package Wzorce.WzorceProjektowe.Day3.Strategy.Leki;


public class Main {
    public static void main(String[] args) {
        People person1 = new People("Stefan", 49);

        if ((person1.getAge() > 80)) {
            person1.setPrice(new NewDiscount());
            System.out.println(person1.getMedicinePrice(100));
        } else if (person1.getAge() > 50) {
            person1.setPrice(new Discount10());
            System.out.println(person1.getMedicinePrice(100));
        } else {
            person1.setPrice(new NoDiscount());
            System.out.println(person1.getMedicinePrice(100));
        }
    }
}