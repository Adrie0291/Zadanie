package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.KawaHerbata.After;

public class Coffee extends drink{
    @Override
    void zaparzanie() {
        System.out.println("Zalewam wrzątkiem kawę. KAWA");
    }

    @Override
    void dodanieDodatkow() {
        System.out.println("Dodaję cukier lub mleko. KAWA");

    }
}
