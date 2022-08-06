package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory.Basic;

public class Burgerownia {
    Burger burger;

    public Burger zamowBurgera(String type) {
        burger = null;
        if (type.equals("wieprzowy")) {
            burger = new Wieprzowy();
        } else if (type.equals("vege")) {
            burger = new Vege();
        }

        burger.przygotowanie();
        burger.pieczenie();
        burger.krojenie();
        burger.pakowanie();
        return burger;
    }
}
