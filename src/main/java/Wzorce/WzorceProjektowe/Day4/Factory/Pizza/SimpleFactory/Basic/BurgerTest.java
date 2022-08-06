package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory.Basic;

public class BurgerTest {
    public static void main(String[] args) {
        Burgerownia burgerownia = new Burgerownia();
        System.out.println(burgerownia.zamowBurgera("wieprzowy"));
        System.out.println(burgerownia.zamowBurgera("vege"));
      //  System.out.println(burgerownia.zamowBurgera("eroa"));

    }
}
