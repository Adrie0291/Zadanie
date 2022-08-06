package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.SimpleFactory;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {
    String nazwa;
    String ciasto;
    String sos;
    List<String> dodatki = new ArrayList<String>();

    public String pobierzNazwa() {
        return nazwa;
    }

    public void przygotowanie() {
        System.out.println("Przygotowywanie pizzy: " + nazwa);
    }

    public void pieczenie() {
        System.out.println("Pieczenie pizzy: " + nazwa);
    }

    public void krojenie() {
        System.out.println("Krojenie pizzy: " + nazwa);
    }

    public void pakowanie() {
        System.out.println("Pakowanie pizzy: " + nazwa);
    }

    public String toString() {
        // Kod wyświetlający nazwę pizzy i dodatki
        StringBuffer display = new StringBuffer();
        display.append("---- " + nazwa + " ----\n");
        display.append(ciasto + "\n");
        display.append(sos + "\n");
        for (String dodatek : dodatki) {
            display.append(dodatek + "\n");
        }
        return display.toString();
    }
}

