package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory.SIMPLE;

public class Burgerownia {
    //  Burger burger;
    FabrykaBurgerow fabrykaBurgerow;

    public Burgerownia(FabrykaBurgerow fabrykaBurgerow) {
        this.fabrykaBurgerow = fabrykaBurgerow;
    }

    public Burger zamowBurgera(String type) {
        Burger burger;
        burger = fabrykaBurgerow.utworzBurgera(type);

        burger.przygotowanie();
        burger.pieczenie();
        burger.krojenie();
        burger.pakowanie();
        return burger;
    }
}
