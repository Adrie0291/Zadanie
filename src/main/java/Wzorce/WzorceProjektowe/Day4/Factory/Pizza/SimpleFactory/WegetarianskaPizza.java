package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory;

public class WegetarianskaPizza extends Pizza {
    public WegetarianskaPizza() {
        nazwa = "Pizza wegetariańska";
        ciasto = "Cienkie kruche ciasto";
        sos = "Sos marinara";
        dodatki.add("grubo tarty ser mozarella");
        dodatki.add("tarty parmezan");
        dodatki.add("siekana cebula");
        dodatki.add("krojone pieczarki");
    }
}

