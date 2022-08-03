package Wzorce.WzorceProjektowe.Day3.Observer.StacjaPogodowa;

public interface Obserwator {
    void update(int temp, int humidity, int pressure);
}
