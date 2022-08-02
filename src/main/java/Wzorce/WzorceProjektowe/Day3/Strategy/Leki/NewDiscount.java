package Wzorce.WzorceProjektowe.Day3.Strategy.Leki;

public class NewDiscount implements Price{

    @Override
    public double cena(double price) {
        return price * 0.6;
    }
}
