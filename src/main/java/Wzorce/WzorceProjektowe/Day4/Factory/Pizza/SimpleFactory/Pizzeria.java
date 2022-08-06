package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory;

public class Pizzeria {
    ProstaFabrykaPizzy prostaFabrykaPizzy;

    public Pizzeria(ProstaFabrykaPizzy prostaFabrykaPizzy) {
        this.prostaFabrykaPizzy = prostaFabrykaPizzy;
    }

    public Pizza zamówPizzę(String type) {
        Pizza pizza;

        pizza = prostaFabrykaPizzy.utwórzPizzę(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }
}
