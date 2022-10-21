package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.Factory;

public class AmerykanskaBurgerownia extends Burgerownia {
    Burger utworzBurger(String item) {
        if (item.equals("mięsak")) {
            return new AmerykanskiBurger();
        } else {
            System.out.println("BRAK WYBORU");
        }
        return null;
    }
}