package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        nazwa = "Pizza pepperoni";
        ciasto = "zwyczajne ciasto";
        sos = "Sos Marinara";
        dodatki.add("pepperoni w plasterkach");
        dodatki.add("siekana cebula");
        dodatki.add("tarty parmezan");
    }
}

