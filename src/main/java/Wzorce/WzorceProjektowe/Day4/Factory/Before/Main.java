package Wzorce.WzorceProjektowe.Day4.Factory.Before;

public class Main {
    public static void main(String[] args) {
        Alien sectoid = new Sectoid("leader", 150);
        Alien muton = new Muton(" soldier",100);
        System.out.println(sectoid);
        System.out.println(muton);
        //factory.create("sectoid")
    }
}
