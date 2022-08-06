package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory;

public class PizzaTest {

    public static void main(String[] args) {
        ProstaFabrykaPizzy prostaFabrykaPizzy = new ProstaFabrykaPizzy();
        Pizzeria pizzeria = new Pizzeria(prostaFabrykaPizzy);

        Pizza pizza = pizzeria.zamówPizzę("serowa");
        System.out.println("Zamówiliśmy pizzę: " + pizza.pobierzNazwa() + "\n");
        System.out.println(pizza);

        pizza = pizzeria.zamówPizzę("wegetariańska");
        System.out.println("Zamówiliśmy pizzę: " + pizza.pobierzNazwa() + "\n");
        System.out.println(pizza);
    }
}

