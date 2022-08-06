package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory;

public class OwoceMorzaPizza extends Pizza {
    public OwoceMorzaPizza() {
        nazwa = "Pizza owoce morza";
        ciasto = "cienkie ciasto";
        sos = "biały sos czosnkowy";
        dodatki.add("małże");
        dodatki.add("tarty parmezan");
    }
}
