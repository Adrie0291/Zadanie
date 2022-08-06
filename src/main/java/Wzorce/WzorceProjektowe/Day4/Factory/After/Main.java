package Wzorce.WzorceProjektowe.Day4.Factory.After;

import Wzorce.WzorceProjektowe.Day4.Factory.After.units.Alien;
import Wzorce.WzorceProjektowe.Day4.Factory.After.units.AlienFactory;
import Wzorce.WzorceProjektowe.Day4.Factory.After.units.Secton;
import Wzorce.WzorceProjektowe.Day4.Factory.After.units.UnitFactory;

public class Main {
    public static void main(String[] args) {
        UnitFactory factory = new AlienFactory();
        Alien secton = factory.create("secton");
        Alien muto = factory.create("muto"); // robimy obiekt z metody wytwórczej

       // Alien secton2 = new Secton("sectoidNEW",450); nie działa
        System.out.println(secton);
        System.out.println(muto);

    }
}