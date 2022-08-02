package Wzorce.WzorceProjektowe.Day3.Strategy.Leki;

public class NoDiscount implements Price {
    @Override
    public double cena(double price) {
        return price;
    }
}
