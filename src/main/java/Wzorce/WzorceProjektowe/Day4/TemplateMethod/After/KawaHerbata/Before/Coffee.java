package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.KawaHerbata.Before;

public class Coffee {
    void recepturaParzenia() {
        gotowanieWody();
        zaparzanieKawy();
        nalewanieDoFilizanki();
        dodawanieCukruOrazMleka();
    }

    private void gotowanieWody() {
        System.out.println("Gotowanie wody");
    }

    private void zaparzanieKawy() {
        System.out.println("Zaparzanie i przesączenie przez filtr");
    }

    private void nalewanieDoFilizanki() {
        System.out.println("Nalewanie do filiżanki");
    }

    private void dodawanieCukruOrazMleka() {
        System.out.println("Dodanie cukru oraz mleka");
    }
}
