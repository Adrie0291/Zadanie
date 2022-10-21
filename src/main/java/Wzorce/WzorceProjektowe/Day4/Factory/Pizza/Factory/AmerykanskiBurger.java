package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.Factory;

public class AmerykanskiBurger extends Burger {
    public AmerykanskiBurger() {
        nazwa = "Amerykanski Burger";
        bulka = "Gruba, pełnoziarnista buła";
        sos = "sos ze świeżych malin";

        dodatki.add("czerwona cebula");
    }

    public void krojenie() {
        System.out.println("Krojenie burgera na 2 połówki");
    }
}
