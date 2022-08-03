package Wzorce.WzorceProjektowe.Day3.Observer.StacjaPogodowa;

public interface Podmiot {
    void addObserwator(Obserwator obserwator);
    void removeObserwator(Obserwator obserwator);
    void updateObserwator();
}
