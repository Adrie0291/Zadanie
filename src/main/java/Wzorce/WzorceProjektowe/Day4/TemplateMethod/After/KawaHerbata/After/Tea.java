package Wzorce.WzorceProjektowe.Day4.TemplateMethod.After.KawaHerbata.After;

public class Tea extends drink{
    @Override
    public void zaparzanie() {
        System.out.println("Wkładam torebkę herbaty do wrzątku. HERBATA");

    }

    @Override
    public void dodanieDodatkow() {
        System.out.println("Dodaję cytrynę. HERBATA");

    }
}
