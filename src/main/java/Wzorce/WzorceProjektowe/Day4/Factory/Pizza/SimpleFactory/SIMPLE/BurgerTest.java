package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory.SIMPLE;

public class BurgerTest {
    public static void main(String[] args) {
        //   Burgerownia burgerownia = new Burgerownia();
        //   System.out.println(burgerownia.zamowBurgera("wieprzowy"));
        //  System.out.println(burgerownia.zamowBurgera("vege"));
        //  System.out.println(burgerownia.zamowBurgera("eroa"));
        FabrykaBurgerow  fabrykaBurgerow = new FabrykaBurgerow();
        Burgerownia burgerownia = new Burgerownia(fabrykaBurgerow);
        Burger burger = burgerownia.zamowBurgera("vege");
        System.out.println(burger);
        burger = burgerownia.zamowBurgera("wieprzowy");
        System.out.println(burger);
    }
}
