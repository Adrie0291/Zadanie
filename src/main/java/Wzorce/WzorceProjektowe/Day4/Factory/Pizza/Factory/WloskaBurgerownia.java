package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.Factory;


public class WloskaBurgerownia extends Burgerownia {
    Burger utworzBurger(String item) {
        if (item.equals("italiano")) {
            return new WloskiBurger();
        } else {
            System.out.println("Nic z tego");
        }
        return null;
    }
}