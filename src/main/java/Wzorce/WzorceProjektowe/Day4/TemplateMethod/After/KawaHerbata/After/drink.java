package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.KawaHerbata.After;

public abstract class drink {
    final void recepturaParzenia() {
        gotowanieWody();
        zaparzanie();
        nalewaniedoFilizanki();
        dodanieDodatkow();
    }
    void gotowanieWody(){
        System.out.println("Gotuje wode. ABSTRACT");
    }
    abstract void zaparzanie();

    void nalewaniedoFilizanki(){
        System.out.println("Nalewam do filiżanki. ABSTRACT");
    }
    abstract void dodanieDodatkow();
}


