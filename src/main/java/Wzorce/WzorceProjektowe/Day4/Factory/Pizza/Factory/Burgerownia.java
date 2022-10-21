package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.Factory;

public abstract class Burgerownia {

    public Burger zamowBurgera(String type) {
        Burger burger;
        burger = utworzBurger(type);

        burger.przygotowanie();
        burger.pieczenie();
        burger.krojenie();
        burger.pakowanie();
        return burger;
    }

    abstract Burger utworzBurger(String item);
}
    