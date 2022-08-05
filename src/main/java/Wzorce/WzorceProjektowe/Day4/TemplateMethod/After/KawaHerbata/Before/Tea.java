package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.KawaHerbata.Before;

public class Tea {
    void recepturaParzenia() {
        gotowanieWody();
        wkladanieTerabkiHerbaty();
        nalwanieDoFilizanki();
        dodawanieCytryny();
    }

    private void gotowanieWody() {
        System.out.println("Gotowanie wody");
    }

    private void wkladanieTerabkiHerbaty() {
        System.out.println("Wkladanie torebki herbaty do wrzątku");
    }

    private void nalwanieDoFilizanki() {
        System.out.println("Nalewanie do filizanki");
    }

    private void dodawanieCytryny() {
        System.out.println("Dodaje cytryne");
    }
}
