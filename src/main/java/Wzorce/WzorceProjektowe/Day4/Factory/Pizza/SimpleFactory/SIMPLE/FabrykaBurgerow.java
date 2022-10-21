package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory.SIMPLE;

public class FabrykaBurgerow {
    public Burger utworzBurgera(String type) {
        Burger burger = null;
        if (type.equals("wieprzowy")) {
            burger = new Wieprzowy();
        } else if (type.equals("vege")) {
            burger = new Vege();

        }
        return burger;
    }
}
