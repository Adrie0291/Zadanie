package Wzorce.WzorceProjektowe.Day4.Factory.Pizza.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Burger {
    String nazwa;
    String bulka;
    String sos;
    List<String> dodatki = new ArrayList<>();

    public String pobierzNazwe() {
        return nazwa;
    }
    public void przygotowanie() {
        System.out.println("Przygotowanie burgera " + nazwa);
    }
    public void pieczenie() {
        System.out.println("Pieczenie miesa burgera" + nazwa);
    }
    public void krojenie() {
        System.out.println("Krojenie burgera w odpowiedni sposob" + nazwa);
    }
    public void pakowanie() {
        System.out.println("Pakowanie burgera do pudelka " + nazwa);
    }
    @Override
    public String toString() {
        return "Burger{" +
                "nazwa='" + nazwa + '\'' +
                ", bulka='" + bulka + '\'' +
                ", sos='" + sos + '\'' +
                ", dodatki=" + dodatki +
                '}';
    }
}
