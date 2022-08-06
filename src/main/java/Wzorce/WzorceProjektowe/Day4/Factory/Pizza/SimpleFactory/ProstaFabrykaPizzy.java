package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory;

public class ProstaFabrykaPizzy {

    public Pizza utwórzPizzę(String type) {
        Pizza pizza = null;

        if (type.equals("serowa")) {
            pizza = new SerowaPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("owocemorza")) {
            pizza = new OwoceMorzaPizza();
        } else if (type.equals("wegetariańska")) {
            pizza = new WegetarianskaPizza();
        }
        return pizza;
    }
}
