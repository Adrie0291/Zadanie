package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory;

public class SerowaPizza extends Pizza {
    public SerowaPizza() {
        nazwa = "Pizza serowa";
        ciasto = "zwyczajne ciasto";
        sos = "sos do pizz marinera";
        dodatki.add("świeża mozarella");
        dodatki.add("parmezan");
    }
}

