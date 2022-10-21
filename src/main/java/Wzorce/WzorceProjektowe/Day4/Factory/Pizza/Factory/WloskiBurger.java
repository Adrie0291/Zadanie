package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.Factory;

public class WloskiBurger extends Burger{
    public WloskiBurger() {
        nazwa = "Wloski Burger";
        bulka = "Jasna bulka";
        sos = "sos vinegret";

        dodatki.add("prażona kukurdzya");
    }

    public void krojenie() {
        System.out.println("kroimy raz");
    }
}
