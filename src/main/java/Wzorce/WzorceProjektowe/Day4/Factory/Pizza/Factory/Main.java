package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.Factory;

public class Main {
    public static void main(String[] args) {
        Burgerownia amerykanskaBurgerownia = new AmerykanskaBurgerownia();
        Burgerownia wloskaBurgerownia = new WloskaBurgerownia();

        Burger burger = amerykanskaBurgerownia.zamowBurgera("mięsak");
        System.out.println("Stefan zamówił " + burger.nazwa + "\n");
        System.out.println(burger);
        System.out.println("-----------------------------");
        burger = wloskaBurgerownia.zamowBurgera("italiano");
        System.out.println("Alicja zamowila " + burger.nazwa + "\n");
        System.out.println(burger);

    }
}
